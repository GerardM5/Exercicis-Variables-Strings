import java.util.Scanner;

public class Penjat {
    public static void main(String[] args) {

        System.out.println("Dime una palabra para empezar a jugar");
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        System.out.println("Adivina la palabra");
        char letter;
        char [] incognitWord = new char [word.length()];
        for (int i = 0; i < word.length(); i++) {
            incognitWord[i]= '_';
            System.out.print(incognitWord[i]);
        }
        System.out.println(" ");
        int count = 5, correctLetter=0;
        while (count >0) {
            correctLetter=0;
            System.out.println("Dime una letra:");
            letter = sc.next().charAt(0);

            for (int i = 0; i < word.length(); i++) {
                if(letter==word.charAt(i)){
                    incognitWord[i] = letter;
                }
                System.out.print(incognitWord[i]);
                if(incognitWord[i]==word.charAt(i)){
                    correctLetter++;
                }

            }
            int n=0;
            for (int i = 0; i < word.length(); i++) {

                if (letter==incognitWord[i]){
                    n++;
                }
            }
            if(n==0){
                count--;
                System.out.println("\nIncorrecto, te quedan " + count + " intentos.");

            }
            if (correctLetter==word.length()){
                break;
            }
            System.out.println(" ");

        }
        if(correctLetter==word.length()){
            System.out.println("\nENHORABUENA!! HAS ACERTADO.");
        }else{
            System.out.println("HAS PERDIDO");
        }


    }
}
