#!/usr/bin/env groovy

def call(String server){
    echo 'unittesting...............' + server
    echo server
    import com.cleverbuilder.GlobalVars
    println GlobalVars.foo
}
