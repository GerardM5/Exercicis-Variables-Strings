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
            incognitWord[i]='i';
            System.out.print(incognitWord[i]);
        }
        int count = 0;
        while (count <5) {
            System.out.println("Dime una letra:");
            letter = sc.next().charAt(0);

            for (int i = 0; i < word.length(); i++) {
                if(letter==word.charAt(i)){
                    incognitWord[i] = letter;
                }
                    /*if (incognitWord[i]==null){m


                    }else{
                        System.out.println(incognitWord[i]);
                    }*/
            }

        }



    }
}
