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
                        
                        script {
                            log.info('xixixixixixixi' + server)
                            def res = libraryResource 'hello_world.json' // 使用外部资源
                            echo res

                            @Library('shared-libraries-Demo') import static com.param.GlobalVars.*
                            echo foo
                        }
                        
                    }
                }
            }
        }
    }
}
