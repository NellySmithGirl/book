#!/bin/sh

set -x

version=$1

mvn versions:set -DnewVersion=${version}

find ./ -name *.versionsBackup | xargs rm -rf

mvn compile -Dmaven.test.skip=true

if [ $? != 0 ]
then
    echo "compile error"
	exit 1
fi

mvn install -Dmaven.test.skip=true

if [ $? != 0 ]
then
     echo "deploy error"
 	exit 1
 fi

git commit -a -m "Update version to ${version} as release"

git tag -a ${version} -m "${version}"

git push origin ${version}
