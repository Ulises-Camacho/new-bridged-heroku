interface Figura { 
   public void draw();
} 
// concrete implementations
class Linea implements Figura {
   public void draw() {
      System.out.println("Linea");
   }
}
class Cuadrado implements Figura {
   public void draw() {
      System.out.println("Cuadraro");
   }
}

class Circulo implements Figura {
	   public void draw() {
	      System.out.println("Circulo");
	   }
	}

class Painting {
   public static void main (String[] args) {
      Figura s1 = new Linea ();
      Figura s2 = new Cuadrado ();
      Figura s3 = new Circulo ();
      
      paint (s1);
      paint (s2);
      paint (s3);
      
   }
   // single method executes against the software contract as a prototype
   static void paint (Figura s) {
      s.draw ();
   }
}