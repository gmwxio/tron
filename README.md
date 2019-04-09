# TRON

An __algebraic-data + annotation language__ for capturing specification, specifically of modern cloud systems. TRON enables developers and operations to easily define and capture semantics invariance in configuration files.

It started life as a strict superset of Google’s Protocol Buffers and draws influence from many languages including Capnproto, Go, Dhall, Cue and ADL. 

The project's principles include; 

- strict determinitic specification, separate from non-deterministic specification and Turing-complete implementation
- usability at developer scale 
- principle of least privilege
- distinguishing authentication from authorization (to the extent of replacing the word authorization by **resource**)
- rule of least power
- defaults not implicits (watch out for hidden assumptions aka implicits)
- understand dualities (static vs dynamic)
- understand context aka shades or grey (eg static vs less static vs less static vs dynamic)
- Probablity of success is function of perceived value as a ratio of perceived pain of adoption

## Status 

This is early days for TRON if you would like to get involved please contact me.

## Roadmap

- Proto Language Server supporting *extend* and *options*
