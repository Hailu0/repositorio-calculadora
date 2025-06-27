import java.util.Scanner;
public class Mayorymenor {
    public static void main(String[]Args){
        Scanner entrada = new Scanner(System.in);
        int cantidadNumeros;
        int numero;
        int mayor = 0;
        int menor = 0;
        System.out.println("Cuantos numeros desea ingresar?");
        cantidadNumeros = entrada.nextInt();

        for(int i=1; i<=cantidadNumeros; i++) {
            System.out.println("Ingrese el numero " + i);
            numero = entrada.nextInt();

            if(i == 1){
                mayor = numero;
                menor = numero;
            }

            mayor = mayor(numero, mayor);
            menor = menor(numero, menor);
        }
        System.out.println("El numero mayor es:" + mayor);
        System.out.println("EL numero menor es:" + menor);
    }
    public static int mayor(int a, int mayorActual){
        if (a > mayorActual){
           mayorActual = a;
        }
        return mayorActual;
    }
    public static int menor(int a, int menorActual){
        if (a < menorActual){
            menorActual = a;
        }
        return menorActual;
    }
}
