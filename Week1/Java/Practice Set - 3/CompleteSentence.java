import java.util.Scanner;

public class CompleteSentence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the senetence: ");
        String sentence = "Dear Priyanshu, thanks a lot";

        String modifiedString = sentence.replace("Priyanshu", "Harsh");
        // System.out.println(sentence);
        System.out.println(modifiedString);
    }
}
