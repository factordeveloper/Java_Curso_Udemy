package Unidad_1;

import javax.swing.*;

public class SistemasNumericosJoptionPane {
    public static void main(String[] args) {


        String numeroString = JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroString);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debes ingresar un número ENTERO");
            main(args);
             return;
            //System.exit(0);
        }



        System.out.println("numeroDecimal = " + numeroDecimal);

        /// CONVERTIR A BINARIO
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
       // System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        System.out.println(resultadoBinario);

        /// CONVERTIR A DECIMAL
        int numeroBinario = 0b111110100;
        System.out.println("numeroNinario = " + numeroBinario);

        //// CONVERTIR A OCTAL
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
      //  System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        /// CONVERTIR A HEXADECIMAL
        String resultadoHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        //String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);


    }
}
