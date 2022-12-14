import java.util.Scanner;

public class WordReversal {
    public static void main(String[] args) {
        String sentence1[] = {};
        System.out.println("Podaj pierwsze słowo: ");
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            String slowo = scan.nextLine();
            sentence1[i] = slowo;
            i++;
        }
        for (int j = 0; j <= sentence1.length; j++) {
           System.out.println(sentence1[j]);
        }
    }
}
