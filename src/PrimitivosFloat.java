public class PrimitivosFloat {

    static int varStatic;

    public static void main(String[] args) {

        // float realFloat = 212e3f;
        // float realFloat = 2120f;
        // float realFloat = 15000f;
        float realFloat = 1.5e-10f;
        System.out.println("///////////////////////");
       System.out.println("realFloat = " + realFloat);
        System.out.println("float correspondiente en byte a = " + Float.BYTES);
        System.out.println("float correspondiente en bites a = " + Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("mínimo valor para float = " + Float.MIN_VALUE);

        System.out.println("///////////////////////");

        double realDouble = 3.465765765E8D;
        System.out.println("realDouble = " + realDouble);

        System.out.println("double correspondiente en byte a = " + Double.BYTES);
        System.out.println("double correspondiente en bites a = " + Double.SIZE);
        System.out.println("máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("mínimo valor para double = " + Double.MIN_VALUE);


        System.out.println("///////////////////////");
        
        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);

        System.out.println("varStatic = " + varStatic);

    }
}
