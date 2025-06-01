def call() {
        echo "This is Deploying the code"
        sh 'docker compose up -d'
        echo "This is Deployment is successfull"
}
