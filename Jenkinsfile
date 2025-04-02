pipeline {
    agent any
    environment {
        IMAGE_NAME = "richdotcom101/calculator"
        IMAGE_TAG = "latest"
    }
    stages {
        stage("Stage 1 : Git clone") {
            steps {
                git 'https://github.com/chrisdotorg/Calculator.git'
            }
        }
        stage("Stage 2 : Build project") {
            steps {
                sh 'mvn clean package'
            }
        }
        stage("Stage 3 : Building Docker Image") {
            steps {
                sh 'pwd'
                sh 'ls -l'
                sh 'docker build -t $IMAGE_NAME:$IMAGE_TAG .'
            }
        }
        stage("Stage 4 : Pushing Docker Image to Docker Hub") {
            steps {
                withCredentials([usernamePassword(credentialsId: 'docker_hub_cred', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                    script {
                        sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
                        sh 'docker push $IMAGE_NAME:$IMAGE_TAG'
                    }
                }
            }
        }
        stage("Stage 5 : Deployment with Ansible"){
            steps{
                sh 'ansible-playbook -i inventory.ini deploy.yml'
            }
        }
    }
}
