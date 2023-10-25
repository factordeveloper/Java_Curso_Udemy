package Unidad_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
       // String numeroString = scanner.nextLine();


        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroString);
    //    } catch(NumberFormatException e){
          } catch(InputMismatchException e){
            System.out.println("Error, debes ingresar un número ENTERO");
            main(args);
            return;
            //System.exit(0);
        }


        System.out.println("numeroDecimal = " + numeroDecimal);

        /// CONVERTIR A BINARIO
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);



        //// CONVERTIR A OCTAL
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);


        /// CONVERTIR A HEXADECIMAL
        String resultadoHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        //String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;

        System.out.println(mensaje);



    }
}
