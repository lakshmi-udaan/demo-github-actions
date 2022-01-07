#!/bin/bash

cd doc/docs/sections/ || exit
cat ./badges.md ../index.md ./contents.md ./about.md ./getting-started.md ./integrate-snorql-to-project.md \
./enable-snorql-extensions.md ./build-custom-metrics.md ./kotlin-documentation.md ./roadmap.md \
../../../CONTRIBUTING.md ./license-details.md ./contacts.md ./acknowledgements.md > ../../../result.md