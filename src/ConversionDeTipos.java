public class ConversionDeTipos {
    public static void main(String[] args) {
        
        /// STRING A ENTERO
        String numeroStr = "50";
       // var numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        /// STRING A DOUBLE
        String realStr = "98765.43e-3";
       //  var realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        /// STRING A BOOLEAN
        String logicoStr = "true";
       // var logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        //// STRING A INTEGER
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        /// Sumarle 10 al convertirlo
        otroNumeroStr = String.valueOf(otroNumeroInt + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);


        /// DOUBLE A STRING
        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);
        
        
        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);
        
        /// CASTEAR INT A SHORT
        int i = 22768;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);

        System.out.println(Short.MAX_VALUE);
        char b = (char)i;
        System.out.println("b = " + b);
        
        float f = (float)i;
        System.out.println("f = " + f);

    }
}
