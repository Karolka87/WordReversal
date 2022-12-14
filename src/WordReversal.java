import java.util.Scanner;

public class WordReversal {
    public static void main(String[] args) {
        String[] sentence1 = new String[5];
        System.out.println("Podaj pierwsze słowo: ");
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < sentence1.length; i++){
            String slowo = scan.nextLine();
            sentence1[i] = slowo;
            System.out.println("Podaj kolejne slowo");
        }
        for (int j = sentence1.length-1; j >= 0; j--) {
           System.out.println(sentence1[j]);
        }
    }
}
