import java.util.Scanner;

public class ConvertToLowercase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name  = sc.next();
        String lowerName = name.toLowerCase();
        System.out.println(lowerName);
    }
}
