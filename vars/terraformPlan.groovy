def call(String path) {

    dir(path) {

        sh 'terraform plan'
    }
}
