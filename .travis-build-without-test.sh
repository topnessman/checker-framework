#!/bin/bash

# Fail the whole script if any command fails
set -e

export SHELLOPTS

## Build annotation-tools (Annotation File Utilities)
if [ -d ../annotation-tools ] ; then
    # Older versions of git don't support the -C command-line option
    (cd ../annotation-tools && git pull)
else
    (cd .. && git clone https://github.com/pascaliUWat/annotation-tools.git)
fi
# This also builds jsr308-langtools
(cd ../annotation-tools/ && git checkout pascaliuwat && ./.travis-build-without-test.sh)

## Compile
ant dist
