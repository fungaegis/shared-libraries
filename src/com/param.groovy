#!/usr/bin/env groovy
package com.param

class GlobalVars {
   static String foo = "bar"
//    println "myname"
   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   // println GlobalVars.foo
}


def test(name) {
    echo "myname" + name
}