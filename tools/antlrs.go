package tools

import "github.com/jpillora/opts"

type antlrs struct {
	Jar      string `opts:"env=ANTLR_JAR"`
	Language string
	Antlr    []anAntlr `opts:"-"`
	Regexp   Regexp
}
type anAntlr struct {
	OutputDir string
	LibDir    string
	Package   string
	Visitor   bool
	SrcDir    string
	Files     []string
}
type Regexp struct {
	Match   string
	Replace string
}

func NewAntlrs() opts.Opts {
	return opts.New(&antlrs{}).Name("antlrs")
}

func (ans *antlrs) Run() error {
	for _, an := range ans.Antlr {
		a := antlr{
			Jar:       ans.Jar,
			Language:  ans.Language,
			OutputDir: an.OutputDir,
			LibDir:    an.LibDir,
			Package:   an.Package,
			Visitor:   an.Visitor,
			SrcDir:    an.SrcDir,
			Files:     an.Files,
			Regexp: Regexp{
				Match:   ans.Regexp.Match,
				Replace: ans.Regexp.Replace,
			},
		}
		if err := a.Run(); err != nil {
			return err
		}
	}
	return nil
}
