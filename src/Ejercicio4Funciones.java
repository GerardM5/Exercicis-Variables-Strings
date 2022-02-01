/*import java.util.Scanner;

public class Ejercicio4Funciones {

    public static void main(String[] args) {
        String [] arrTasks = new String[10];
        int option = askOption();
        selectOption(option, arrTasks);
    }

    private static void selectOption(int option, String arrTasks[]) {
        switch (option) {
            case 1 -> addTask(arrTasks);
            case 2 -> deleteTask(arrTasks);
            case 3 -> showTasks(arrTasks;
            case 4 -> System.out.println("Gracias por usar");
            default -> System.out.println("Numero incorrecto");
        }
    }

    private static String addTask(String[] arrTasks) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrTasks.length; i++) {
            if (arrTasks[i] == null) {
                System.out.println("Introcuce la tarea numero " + (i + 1));
                arrTasks[i] = sc.next();
            }
    }

    private static int askOption() {
        System.out.println("Que quieres hacer? \n1)Añadir tarea\n2)Eliminar tarea\n3)Mostrar tareas\n4)Salir");
        int option= sc.nextInt();
        return option;
    }
}*/
