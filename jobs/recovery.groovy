job('Recovery') {
  steps {
    shell('bash /home/jenkins/recovery.sh')
  }
}
