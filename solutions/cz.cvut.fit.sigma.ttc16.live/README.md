# TTC'16 Live Contest - Execution of dataflow-based model transformations - SIGMA solution

This repository contains a [SIGMA](http://fikovnik.github.io/Sigma) solution for the [TTC'16 Live Contest](https://github.com/bluezio/ttc2016-live).

## Prerequisites

- [SBT - simple build tool](http://www.scala-sbt.org/download.html)
- Cloned [TTC'16 Live Contest](https://github.com/bluezio/ttc2016-live) repository in Eclipse workspace

## Running

- There are launch configurations for Eclipse. 

## Sample Results

- `families2persons/input/families.model` in 15 ms 
- `families2persons/input/familyGS.model` in 18 ms 
- `families2persons/input/familyGM.model` in 116 ms 
- `families2persons/input/familyGL.model` in 492 ms 

- `tree2graph/input/tree.model` in 14 ms 
- `tree2graph/input/treeGS.model` in 26 ms 
- `tree2graph/input/treeGM.model` in 238 ms 
- `tree2graph/input/treeGL.model` in 1031 ms 

All runs on java version "1.8.0_74", OSX 10.11.5, 3,1 GHz Intel Core i7

## Re-generating SIGMA support for the EMF model

Shall the EMF model change, these are the steps to regenerate the EMF support for SIGMA:

```sh
$ sbt
...
> consoleQuick
> :load generate-sigma-support.scala-console
```