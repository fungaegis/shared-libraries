#!/usr/bin/env groovy

library 'share-library'

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
                        unitTest
                    }
                }
            }
        }
    }
}
