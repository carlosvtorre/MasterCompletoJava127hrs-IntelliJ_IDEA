public class Variable {
    public static void main(String [] args){
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar = " + saludar);
        // El toUpperCase es para que la variable saludar se imprima en Mayúscula
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        // El toLowerCase es para que la variable saludar se imprima en Minúscula
        System.out.println("saludar = " + saludar.toLowerCase());

        System.out.println("--------------------------------------------");
        int numero = 10;
        boolean valor = true;
        if (valor){
            System.out.println("numero = " + numero);
        }

        System.out.println("---------------------------------------------");
        // variable de tipo dinámica
        //var num = "15";
        //según el valor que asignemos, va a influenciar en el tipo de dato
        //System.out.println("num = " + num);
        String nombre = "Andrés";
        if (numero > 9){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);



    }
}
