package accessModifiers

class Outer {

  class Inner {

    // Miembro privado
    private def f() : Unit = { println("f") }
    
    // Miembro publico
    def fPublic() : Unit = { println("Miembro publico") }

    class InnerMost {

      f();
      fPublic();

    }

    (new Inner).f();

  }

  // ERROR no es accesible
  // (new Inner).f();

  // Es posible acceder al miembro publico
  (new Inner).fPublic();
  
}
