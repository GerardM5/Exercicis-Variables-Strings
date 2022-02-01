import java.util.Scanner;

public class Ejercicio3Funciones {
    public static void main(String[] args) {
        String name1 = askForName(1);
        String name2 = askForName(2);
        name2 = revertName(name2);
        printNames(name1, name2);


    }

    private static String revertName(String name) {
        String finalname = "";
        for (int x = name.length() - 1; x >= 0; x--)
            finalname += name.charAt(x);
        return finalname;
    }

    private static void printNames(String name1, String name2) {
        System.out.println("Resultado: " + name1 + name2);
    }

    private static String askForName(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe nombre " + num + ": ");
        String name = sc.next();
        return name;
    }
}
