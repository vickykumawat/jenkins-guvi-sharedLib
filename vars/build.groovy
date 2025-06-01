def call(String DockerHubUser, String ImageName, String ImageTag) {

   echo "This is building the code"
    sh "docker build -t ${DockerHubUser}/${ImageName}:${ImageTag} . "
}
