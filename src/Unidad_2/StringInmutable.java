package Unidad_2;

public class StringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion JAVA";
        String profesor = "Andres Guzman";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        /// curso = Programacion JAVA

        System.out.println("resultado = " + resultado);
        /// resultado = Programacion JAVAAndres Guzman

        System.out.println(curso == resultado);
        /// false

       String resultado2 =  curso.transform(c -> {
            return c + " con " + profesor;
        });

        System.out.println("curso = " + curso);
        //// curso = Programacion JAVA


        System.out.println("resultado2 = " + resultado2);
        /// resultado2 = Programacion JAVA con Andres Guzman

        resultado.replace("a", "A");
        System.out.println("resultado = " + resultado);
        /// resultado = Programacion JAVAAndres Guzman

        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado3 = " + resultado3);
        /// resultado3 = ProgrAmAcion JAVAAndres GuzmAn


    }
}
