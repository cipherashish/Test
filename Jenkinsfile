pipeline{
    agent any
    tools {
        maven 'mymaven' 
   }
    stages{
stage ('build and install'){
            steps{
                sh "mvn clean install "
		sh "java -jar Avan-0.0.1-SNAPSHOT.jar"
            }
			 }
			   }
			     }
