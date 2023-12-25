job('Seed All') {
  scm {
    git ('https://github.com/Mazurovsasha/seed.git')
  }
  steps {
    dsl {
      external('jobs/*.groovy')  
      // default behavior
      // removeAction('IGNORE')      
      removeAction('DELETE')
    }
  }
}
