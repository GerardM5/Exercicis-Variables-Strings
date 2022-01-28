import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), factorial=1;

        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }


}
