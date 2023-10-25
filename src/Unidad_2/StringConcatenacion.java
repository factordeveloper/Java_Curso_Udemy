package Unidad_2;

public class StringConcatenacion {
    public static void main(String[] args) {

        String curso = "Programacion JAVA";
        String profesor = "Andres Guzman";
        String detalle = curso + " con el instructor " + profesor;

        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB);
        //// encontro de primeras un texto asi que
        /// Programacion JAVA con el instructor Andres Guzman105


        System.out.println(numeroA + numeroB);
        //// encontro de primeras un int asi que
        /// 15

        System.out.println(detalle + (numeroA + numeroB));
        //// habian parentesis asi que
        /// Programacion JAVA con el instructor Andres Guzman15

        System.out.println(numeroA + numeroB + detalle);
        //// encontro de primeras un int asi que
        /// 15Programacion JAVA con el instructor Andres Guzman
        
        String detalle2 = curso.concat(" con ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);
        /// detalle2 = Programacion JAVA con Andres Guzman

    }
}
