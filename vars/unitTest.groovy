#!/usr/bin/env groovy

def call(String server){
    echo 'unittesting...............' + server
    echo server
    def res = libraryResource 'hello_world.json' // 使用外部资源
    echo res
}