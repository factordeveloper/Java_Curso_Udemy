package Unidad_1;

public class SistemasNumericos {
    public static void main(String[] args) {


        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        /// CONVERTIR A BINARIO
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        /// CONVERTIR A DECIMAL
        int numeroBinario = 0b111110100;
        System.out.println("numeroNinario = " + numeroBinario);

        //// CONVERTIR A OCTAL
        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        /// CONVERTIR A HEXADECIMAL
        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

    }
}
