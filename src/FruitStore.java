import java.util.Scanner;

public class FruitStore {
    public static void main(String[] args) {
        int money = askUserForMoney();
        int option = chooseFruit();
        money = selectFruit(option, money);
        System.out.println("Te quedan " + money + "€");
    }

    private static int selectFruit(int option, int money) {
        if (option == 1) {
            money = payFruit(money, 2);
        } else if (option == 2) {
            money = payFruit(money,3);
        } else if (option == 3) {
            money = payFruit(money,5);
        } else {
            System.out.println("No hay de esa fruta");
        }
        return money;
    }

    private static int payFruit(int money, int price) {
        if (money >= price) {
            money -= price;
            System.out.println("Gracias por su compra");
        } else {
            System.out.println("No tienes dinero suficiente");
        }
        return money;
    }

    private static int chooseFruit() {
        showFruitOptions();
        System.out.println("Que fruta quieres?\n1)Platano\n2)Manzana\n3)Naranja");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void showFruitOptions() {
        System.out.println("Tenemos estas frutas:");
        System.out.println("Platano a 2€");
        System.out.println("Manzana a 3€");
        System.out.println("Naranja a 5€");
    }

    private static int askUserForMoney() {
        System.out.println("Cuanto dinero tienes?");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
