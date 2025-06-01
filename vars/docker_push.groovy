def call( String dockerHubUser, String ImageName, String ImageTag) {

   echo "This is Tpushing the code to Dockerhub"
    withCredentials([usernamePassword(credentialsId:"dockerhublogin",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    sh "docker push ${dockerHubUser}/${ImageName}:${ImageTag}"
                }  
}
