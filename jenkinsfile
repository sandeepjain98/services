pipeline {
    agent any
    stages {
        stage('build') {
            steps {
              sh ' /opt/gradle/gradle-3.4.1/bin/gradle clean build'
            }
        }
       
    }
    post {
        failure {
            mattermostSend color: 'danger', message: "Something is wrong with ${env.JOB_NAME}. Check it out (<${env.BUILD_URL}|here>)"
        }
    }
}
