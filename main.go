package main

import (
	"github.com/jpillora/opts"
	"github.com/wxio/tron/tools"
)

var (
	Version string
	Data    string
	Commit  string
)

type root struct{}
type build struct{}

func main() {
	r := root{}
	opts.New(&r).Name("tron").
		EmbedGlobalFlagSet().
		Complete().
		Version(Version).
		AddCommand(opts.New(&build{}).
			AddCommand(tools.NewAntlr()).
			AddCommand(tools.NewAntlrs().
				ConfigPath(".antlr.build.json"))).
		Parse().
		RunFatal()
}

func (r root) Run() {
}
