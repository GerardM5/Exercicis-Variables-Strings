import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba primer nombre");
        String name1 = sc.next();
        System.out.println("Escriba segundo nombre");
        String name2 = sc.next();
        System.out.print(name1);
        for(int i=name2.length(); i>0;i--){
            System.out.print(name2.charAt(i-1));
        }
    }
}
