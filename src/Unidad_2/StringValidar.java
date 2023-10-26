package Unidad_2;

public class StringValidar {
    public static void main(String[] args) {

        String curso = null;
        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso = "";
        }

        /// verificar si es vacio
        boolean esVacio = curso.length() == 0;

        if(esVacio == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

      //  System.out.println(curso.toUpperCase());
      ///  System.out.println(curso.toUpperCase()); Null Pointer Exception null no se concatena con concat()
      ///  System.out.println("Bienvenido al curso ".concat(curso));  Null Pointer Exception
      //  System.out.println("Bienvenido al curso " + curso);   /// Bienvenido al curso null


    }
}
