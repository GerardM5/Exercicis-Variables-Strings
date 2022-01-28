import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        int[] entrada = new int[6];
        for(int i = 0; i < entrada.length; i++){
            System.out.println("Dime el numero "+ (i+1));
            entrada[i]=sc.nextInt();
        }
        for (int i = entrada.length; i>0;i--){
            System.out.print( entrada[i-1] + " ");
        }
    }
}
