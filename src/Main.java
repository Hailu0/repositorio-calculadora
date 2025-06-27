//TIP Para <b>ejecutar</b> el código, pulsar <shortcut actionId="Run"/> o
// Haz clic en el ícono <icon src="AllIcons.Actions.Execute"/> del margen.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        int finalizar = 0;
        int valores = 0;
        int a;
        int b;

        System.out.println("Ingrese los valores que se utilizaran en el calculo");
        a = entrada.nextInt();
        b = entrada.nextInt();

        do {
            if(valores == 2) {
                System.out.println("Ingrese los valores que se utilizaran en el calculo");
                a = entrada.nextInt();
                b = entrada.nextInt();
            }

            menu();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado es: " + suma(a, b));
                    break;
                case 2:
                    System.out.println("El resultado es: " + resta(a, b));
                    break;
                case 3:
                    System.out.println("El resultado es: " + multiplicacion(a, b));
                    break;
                case 4:
                    System.out.println("El resultado es: " + division(a, b));
                    break;
                default:
                    System.out.println("Valor no valido");
            }
            System.out.println("Desea finalizar el programa?");
            System.out.println("1)Si");
            System.out.println("2)No");
            finalizar = entrada.nextInt();
            if (finalizar == 2){
                System.out.println("Desea utilizar los mismos valores?");
                System.out.println("1)Si");
                System.out.println("2)No");
                valores = entrada.nextInt();
            }

        } while (finalizar != 1);
}
    public static int suma(int a, int b){
        return a + b;
    }
    public static int resta(int a, int b){
        return a - b;
    }
    public static int multiplicacion(int a, int b){
        return a * b;
    }
    public static double division(double a, double b){
        return a / b;
    }
    public static void menu(){
        System.out.println("Ingrese el valor de acuerdo a la operacion a realizar:");
        System.out.println("1)Suma");
        System.out.println("2)Resta");
        System.out.println("3)Multiplicar");
        System.out.println("4)Dividir");

    }

}

