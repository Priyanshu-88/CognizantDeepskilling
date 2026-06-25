import java.util.Scanner;
public class ConvertKmtoMiles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of km");
        int km = sc.nextInt();
        double miles = km * 0.621371;
        System.out.println(miles);
    }
}