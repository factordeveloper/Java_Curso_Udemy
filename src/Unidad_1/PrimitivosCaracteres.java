package Unidad_1;

public class PrimitivosCaracteres {
    public static void main(String[] args) {
      char caracter = '@';
      char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println( (caracter==decimal) + " " +(caracter!=decimal));

        System.out.println("///////////////////////");

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);

      char espacio = ' ';
      char retroceso = '\b';
      char tabulador = '\t';
      char nuevaLinea = '\n';
      char retornoCarro = '\r';

        System.out.println("char correspondiente en byte a = " + espacio + Character.BYTES);
        System.out.println("char correspondiente en bites a = " + tabulador + Character.SIZE);
        System.out.println("máximo valor para char = " + Character.MAX_VALUE);
        System.out.println("mínimo valor para char = " + Character.MIN_VALUE);





    }
}
