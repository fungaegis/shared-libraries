#!/usr/bin/env groovy

def call(String server){
    echo 'unittesting...............' + server
    echo server
    def res = LibraryResource 'hello_world.json'
    echo res
}