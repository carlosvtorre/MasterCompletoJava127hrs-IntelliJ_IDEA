public class PrimitivosEnteros {
    public static void main(String[] args){
        Byte numeroByte = 127; // 127 es el número mayor que puede almacenar un byte,-128,127
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Variables tipo Byte corresponden en byte a= "+Byte.BYTES);
        System.out.println("Variables tipo Byte corresponden en bites a= "+Byte.SIZE);
        System.out.println("Valor máximo de un Byte: "+Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un Byte: "+Byte.MIN_VALUE);

        System.out.println("--------------------------------------------------------");
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Variables tipo Short corresponden en byte a= "+Short.BYTES);
        System.out.println("Variables tipo Short corresponden en bites a= "+Short.SIZE);
        System.out.println("Valor máximo de un Short: "+Short.MAX_VALUE);
        System.out.println("Valor mínimo de un Short: "+Short.MIN_VALUE);

        System.out.println("--------------------------------------------------------");
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Variables tipo Int corresponden en byte a= "+Integer.BYTES);
        System.out.println("Variables tipo Int corresponden en bites a= "+Integer.SIZE);
        System.out.println("Valor máximo de un Int: "+Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un Int: "+Integer.MIN_VALUE);

        System.out.println("--------------------------------------------------------");
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Variables tipo Long corresponden en byte a= "+Long.BYTES);
        System.out.println("Variables tipo Long corresponden en bites a= "+Long.SIZE);
        System.out.println("Valor máximo de un Long: "+Long.MAX_VALUE);
        System.out.println("Valor mínimo de un Long: "+Long.MIN_VALUE);

        System.out.println("--------------------------------------------------------");
        


    }
}
