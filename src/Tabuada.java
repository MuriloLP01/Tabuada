public class Tabuada {


    public static void main(String[] args) {
        //Tabuada
        int i = 1;
        int valor = 0;
        int numero = 1;
        while (numero <= 10) {
            System.out.println("Tabuada do " + numero + ":");
            while (i <= 10) {
                valor = numero * i;
                System.out.println( numero + "*" + i + " = " + valor);
                i++;
            }
            numero ++;
            i = 1;
            System.out.println("");
        }
    }
}
