public class PrimitivosBoolean {
    public static void main(String[] args) {
        
     //   boolean datoLogico = false;
          Boolean datoLogico = false;
     //   boolean datoLogico = Boolean.FALSE.booleanValue();
        System.out.println("datoLogico = " + datoLogico);

        double d = 96245.56e-3; // 96.24556e-3
        System.out.println("d = " + d);


        float f = 1.2345e2f; // 123.45
        System.out.println("f = " + f);

        System.out.println("///////////////////////");
         //   datoLogico = d < f; /// true
        //   datoLogico = (1 == 1); /// true
             datoLogico = d > f; /// false
        System.out.println("datoLogico = " + datoLogico);


    }
}
