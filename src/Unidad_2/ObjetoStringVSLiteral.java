package Unidad_2;

public class ObjetoStringVSLiteral {
    public static void main(String[] args) {

        /// creando objeto implicitamente
        String curso = "Programacion JAVA";
        //// crear objeto explicitamente
        String curso2 = new String("Programacion JAVA");


        /// COMPARAR OBJETO con ==
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2  " + esIgual);

        /// COMPARAR VALOR DEL OBJETO CON metodo equals()
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2)  " + esIgual);

        /// COMPARAR VALOR DEL OBJETO CON metodo equalsIgnoreCase()
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2)  " + esIgual);

        //// optimiza el objeto, reutulizo lo ya creado
        String curso3 = "Programacion JAVA";
        esIgual = curso == curso3;
        System.out.println("curso == curso3  " + esIgual);
    }
}
