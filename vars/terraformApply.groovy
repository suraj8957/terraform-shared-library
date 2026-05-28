def call(String path) {

    dir(path) {

        sh 'terraform apply -auto-approve'
    }
}
