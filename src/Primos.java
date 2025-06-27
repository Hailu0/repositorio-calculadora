import java.util.Scanner;
public class Primos {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese un numero para comprobar si es par o impar");
        numero = entrada.nextInt();

        if (impar(numero)<=2){
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }


    }
    public static int impar(int a){
        int numeros_divisibles = 0;

        for (int i=1; i<=a && numeros_divisibles<=2; i++){
            if(a % i == 0){
                numeros_divisibles = numeros_divisibles + 1;
                System.out.println(numeros_divisibles);
            }
        }

        return numeros_divisibles;
    }
}
