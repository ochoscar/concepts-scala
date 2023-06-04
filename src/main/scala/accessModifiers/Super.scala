package accessModifiers {

  class Super {
    protected def f() : Unit = { println("f") }
  }

  class Sub extends Super {
    f()
  }
  
  class Other {
    // ERROR: no es accesible
    //(new Super).f()
  }

}
