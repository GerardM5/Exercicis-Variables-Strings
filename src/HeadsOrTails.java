import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {

    public static void main(String[] args) {
        int generalCount = 0;
        int faceCount = 0;
        while (askIfWantsToThrowCoin()) {
            generalCount++;
            boolean isFace = throwCoin();
            showSideCoin(isFace);
            faceCount = countIfIsFace(faceCount, isFace);
            showResult(faceCount, generalCount);
        }
    }

    private static void showResult(int faceCount, int generalCount) {
        System.out.println("Tienes " + faceCount + " puntos de "+ generalCount+ " tiradas.");
    }

    private static int countIfIsFace(int count, boolean sideCoin) {
        if (sideCoin) count++;
        return count;
    }

    private static void showSideCoin(boolean sideCoin) {
        if (sideCoin) System.out.println("Cara");
        else System.out.println("Cruz");
    }

    private static boolean throwCoin() {
        int sideCoin = new Random().nextInt(2);
        return sideCoin == 1;
    }

    private static boolean askIfWantsToThrowCoin() {
        System.out.println("Vols tirar la moneda? (S/N)");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text.equalsIgnoreCase("S");
    }
}
