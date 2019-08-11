node {
	stage('Clone Repository'){
	
	//git 'https://github.com/adipudi1/SpringDockerRepo/tree/feature/SpringDocker-0.0.1/demo'
	git branch: 'master', url: "https://github.com/adipudi1/demo.git"
	}
	
	

    stage('Build') {
        def mvn_version = 'Maven'
            withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
            sh "mvn clean install"
        }
        //sh 'mvn clean install'
    }
    
    //stage('Run Maven Container') {
       
        //Remove maven-build-container if it exists
      //  sh " docker rm -f maven-build-container"
        
        //Run maven image
        //sh "docker run --rm --name maven-build-container maven-build"
   //}
}