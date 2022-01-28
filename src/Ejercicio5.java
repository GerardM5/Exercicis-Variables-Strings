import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        plane vueling1 = new plane();
        plane ryanair1 = new plane();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introcuce numero de vuelo del avion 1: ");
        vueling1.nombre = sc.next();
        System.out.println("introcuce texto del avion 1: ");
        vueling1.texto = sc.next();

        System.out.println("Introcuce numero de vuelo del avion 2: ");
        ryanair1.nombre = sc.next();
        System.out.println("introcuce texto del avion 2: ");
        ryanair1.texto = sc.next();

        System.out.println("Datos del avion 1:\nNombre: " + vueling1.nombre + "\nTexto: " + vueling1.texto);
        System.out.println("Datos del avion 2:\nNombre: " + ryanair1.nombre + "\nTexto: " + ryanair1.texto);
    }
}

class plane{
    String nombre;
    String texto;


}
