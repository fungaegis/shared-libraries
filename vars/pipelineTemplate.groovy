#!/usr/bin/env groovy

def call(String type,Map map) {
    if (type == "golang") {
        pipeline {
            agent any
            parameters {
                choice(name: 'server',choices:"${map.server}", description: '服务器列表选择')
            }
            stages {
                stage('单元测试') {
                    steps{
                        unitTest(server) // 可以直接使用同一个package里面的东西
                        // log.info('xixixixixixixi' + server)  // Method calls on objects not allowed outside "script" blocks
                        def request = libraryResource 'hello_world.json'
                        script {
                            log.info('xixixixixixixi' + server)
                            
                            println request
                        }
                        
                    }
                }
            }
        }
    }
}
