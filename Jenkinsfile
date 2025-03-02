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
    }
}