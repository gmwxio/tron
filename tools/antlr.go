package tools

import (
	"fmt"
	"io/ioutil"
	"os"
	"os/exec"
	"regexp"
	"strings"

	"github.com/jpillora/opts"
)

type antlr struct {
	Jar       string `opts:"env=ANTLR_JAR"`
	Language  string
	OutputDir string
	LibDir    string
	Package   string
	Visitor   bool
	SrcDir    string
	Files     []string
	Regexp    struct {
		Match   string
		Replace string
	}
}

func NewAntlr() opts.Opts {
	return opts.New(&antlr{})
}

func (an *antlr) Run() error {
	if an.Jar == "" ||
		an.Language == "" ||
		an.OutputDir == "" ||
		an.Package == "" ||
		an.SrcDir == "" ||
		len(an.Files) == 0 {
		return fmt.Errorf("incomplete")
	}
	cwd, _ := os.Getwd()
	args := []string{
		"-jar",
		an.Jar,
		"-Dlanguage=" + an.Language,
		"-o", cwd + "/" + an.OutputDir,
		"-package", an.Package,
	}
	if an.LibDir != "" {
		args = append(args, "-lib")
		args = append(args, cwd+"/"+an.LibDir)
	}
	if an.Visitor {
		args = append(args, "-visitor")
	}
	args = append(args, an.Files...)
	fmt.Printf("java %v\n", strings.Join(args, " "))
	cmd := exec.Command("java", args...)
	cmd.Dir = cwd + "/" + an.SrcDir
	by, err := cmd.CombinedOutput()
	fmt.Print(string(by))
	if err != nil {
		return err
	}
	fmt.Printf("%s %s\n", an.Regexp.Match, an.Regexp.Replace)
	f, err := os.Open(cwd + "/" + an.OutputDir)
	if err != nil {
		return err
	}
	fi, err := f.Readdir(0)
	if err != nil {
		return err
	}
	re, err := regexp.Compile(an.Regexp.Match)
	if err != nil {
		return err
	}
	for _, fil := range fi {
		if !fil.IsDir() {
			by, err := ioutil.ReadFile(cwd + "/" + an.OutputDir + "/" + fil.Name())
			if err != nil {
				return err
			}
			by2 := re.ReplaceAll(by, []byte(an.Regexp.Replace))
			ioutil.WriteFile(cwd+"/"+an.OutputDir+"/"+fil.Name(), by2, fil.Mode())
		}
	}
	return nil
}
