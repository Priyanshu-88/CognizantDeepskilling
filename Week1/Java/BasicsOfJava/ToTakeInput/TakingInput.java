import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From Scanner");
        Scanner st = new Scanner(System.in);
        // System.out.println("The first number is");
        // int a = st.nextInt();
        // System.out.println("The second number is");
        // int b = st.nextInt();
        // int sum = a + b;
        // System.out.println("The sum of two number is");
        // System.out.println(sum);
        // boolean b1 = st.hasNextInt();
        // System.out.println(b1);
        String s = st.nextLine();
        System.out.println(s);
    }
}
