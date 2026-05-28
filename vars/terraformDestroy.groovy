def call(String path) {

    dir(path) {

        sh 'terraform destroy -auto-approve'
    }
}
