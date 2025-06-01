def call( String dockerHubUser, String ImageName, String ImageTag, String dockerlogincred) {

   echo "This is Tpushing the code to Dockerhub"
    withCredentials([usernamePassword(credentialsId:"${dockerlogincred}",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    sh "docker push ${dockerHubUser}/${ImageName}:${ImageTag}"
                }  
}
