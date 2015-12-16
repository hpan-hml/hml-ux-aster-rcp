Aster RCP Pluigns - Dandelion Fork 
==================================

# Project Overview

**Synopsis:** [At Hardpan Media 'Blog](http://j.mp/hml-forks-powerloom-dandelion)

## Availability

**Primary Source Code Repository (Aster RCP):** [github:hpan-hml/hml-ux-aster-rcp](https://github.com/hpan-hml/hml-ux-aster-rcp)

**Original Source Code Repository (Dandelon):** [sourceforge:dadelion-ecl](http://sourceforge.net/p/dandelion-ecl/code/ci/master/tree/)

**License:** [GPL 3](http://www.gnu.org/licenses/gpl.txt)

**Notes:**

* _License identity_ referenced from `*/feature.xml` files


# _Ad Hoc_ Issue Tracker

## Issue - Remove Binary Distributions from SCCM Repository

* Issue Kind: ???

**Facets of issue:**

* A license agreement _must_ be made avaialable to the end user,
   for each binary distribution

* In that the Dandelion plugin may provide a Common Lisp implementation
  by way of Eclipse Platform Provisioning services, it may add a notable
  feature of convenience for new programming projects, however it may 
  introduce a concerrn with regards to compatibility with host Common Lisp 
  implementations

* Exactly two Common Lisp implementations are available in the orignal 
  codebase (SBCL and CLISP), but without exacting documentation about 
  the features, ABI, or source of each respective implementation, on any 
  single machine architecture

* An SCCM repository may be applied simultaneously as a package repository.
  However, it may result in a more ideal workflow to maintain the package 
  repository as a service seperate from the SCCM repository

    * Concern: Binary files being redistributed in the SCCM repository,
      for _multiple individual machine (HW platform, OS platform) architectures

    * Observation: Individual operating system (OS) platforms may each support
      a distinct_package provisioning_ framework (e.g FreeBSD ports and 
      pkgng, Debian source/binary packages, RPM source/binary packages, 
      Darwin ports, Cygwin packages)

    * Though it may serve to add a certain degree of complexity to the
      release management cycle, but if individual Common Lisp implementations
      will be distributed via this project, it may be ideal to ensure that 
      each respective implementation is built from source, before each 
      distribution production. For one concern, this may serve to simplify
      a process of _issue tracking_ onto any individual distribution

    * _Build definitions_ should be included with binary distributions, such
      as _may be_ defined in a manner functionally analogous to FreeBSD ports, 
      or Debian packages, or RPM packages, or otherwise.

Isssue was observed as a side-effect of a warning message emitted by Git:
> remote: warning: GH001: Large files detected. You may want to try Git Large File Storage - [https://git-lfs.github.com](https://git-lfs.github.com/).
> remote: warning: See [http://git.io/iEPt8g](http://git.io/iEPt8g) for more information.
> remote: warning: File PluginEnvironmentSBCLMacIntel/binary/environment_sbcl_1.1.10 is 56.84 MB; this is larger than GitHub's recommended maximum file size of 50.00 MB
> remote: warning: File PluginEnvironmentSBCLMacPPC/binary/environment_sbcl_1.1.10 is 80.42 MB; this is larger than GitHub's recommended maximum file size of 50.00 MB

