pipeline{
    agent any
    environment{
        IMAGE_NAME = "richdotcom101/calculator"
        IMAGE_TAG = "latest"
    }
    stages{
        stage ("stage 1 : Git clone"){
            steps{
                git 'https://github.com/chrisdotorg/Calculator.git'
            }
        }
        stage("stage 2 : Build project"){
            steps{
                sh 'mvn clean package'
            }
        }
        stage ("Building Docker Image"){
            steps {
                sh 'pwd'
                sh 'ls -l'
                sh 'docker build -t $IMAGE_NAME:$IMAGE_TAG .'
            }
        }
        stage("Pushing Docker Image to Image"){
            steps{
                script{
                   withCredentials([usernamePassword(credentialsId: 'docker_hub_cred', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')])
                   sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
                   sh 'docker push $IMAGE_NAME:$IMAGE_TAG'
                }
            }
        }
    }
}