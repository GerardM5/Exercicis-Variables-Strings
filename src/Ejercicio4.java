import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int option=0;
        Scanner sc = new Scanner(System.in);
        String [] lista = new String[10];
        int numElements = 0;
        do{
            System.out.println("Que quieres hacer? \n1)Añadir tarea\n2)Eliminar tarea\n3)Mostrar tareas\n4)Salir");
            option=sc.nextInt();

            switch (option) {
                case 1 -> {
                    for (int i = 0; i < lista.length; i++) {
                        if (lista[i] == null) {
                            System.out.println("Introcuce la tarea numero " + (i + 1));
                            lista[i] = sc.next();
                            numElements++;
                            break;
                        }
                    }
                    System.out.println("Lista llena");
                }
                case 2 -> {
                    System.out.println("Selecciona que tarea quieres borrar:");
                    int delete = (sc.nextInt() - 1);
                    lista[delete] = null;
                    for(int i = delete;i < lista.length-1;i++){
                        lista[i] = lista[i+1];
                        System.out.println(i);
                    }
                    lista[lista.length-1]=null;
                    numElements--;
                    System.out.println("Tienes un total de " + numElements + " elementos en la lista");
                }
                case 3 -> {
                    System.out.println("Aqui tienes todas las tareas:");
                    for (int i = 0; i < numElements; i++) {
                        System.out.println((i + 1) + ")" + lista[i]);
                    }
                    System.out.println("Tienes un total de " + numElements);
                    }


                case 4 -> System.out.println("Gracias por usar");
                default -> System.out.println("Numero incorrecto");
            }


        }while (option!=4);
    }
}
