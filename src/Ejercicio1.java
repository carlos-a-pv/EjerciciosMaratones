import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("primero numero(velocidad): ");
        int v = entrada.nextInt();
        System.out.println("Segundo numero(tiempo): ");
        int t = entrada.nextInt();

        System.out.println(calculateDobleDisplacement(v, t));
    }
    public static int calculateDobleDisplacement(int a, int b){
        return 2*(a*b);
    }
}