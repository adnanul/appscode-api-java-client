#!/usr/bin/env bash

set -o errexit
set -o nounset
set -o pipefail

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
ROOT=$DIR/..

rm -rf $ROOT/src/main/proto/appscode/api
rm -rf $ROOT/src/generated

pushd $GOPATH/src/github.com/appscode/api
# copy files
mkdir -p $ROOT/src/main/proto/appscode/api
find . -name '*.proto' | cpio -pdm $ROOT/src/main/proto/appscode/api
# cp -R ${GOPATH}/src/github.com/grpc-ecosystem/grpc-gateway/third_party/googleapis/google $ROOT/src/main/proto
cp -R ${GOPATH}/src/github.com/grpc-ecosystem/grpc-gateway/third_party/appscodeapis/appscode $ROOT/src/main/proto

cd $ROOT
gradle clean build
popd
