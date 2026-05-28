def call(String path) {

    dir(path) {

        sh 'terraform validate'
    }
}
