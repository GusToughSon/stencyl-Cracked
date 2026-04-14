#!/bin/bash
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd "$DIR"

# Launch Stencyl for Mac with custom identity and Pro patches
./runtime/bin/java \
  -Xms64m \
  -Xmx4096m \
  -Dapple.laf.useScreenMenuBar=true \
  -Dapple.awt.graphics.useQuartz=true \
  -Dapple.awt.showGrowBox=true \
  -Dsun.java2d.noddraw=true \
  -Dsun.java2d.d3d=false^
  -XX:-OmitStackTraceInFastThrow \
  -jar sw.jar
