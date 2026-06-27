import java.util.Scanner;
public class CalculatingCGPA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The marks in math");
        int math = sc.nextInt();
        System.err.println("The marks in phy");
        int phy = sc.nextInt();
        System.out.println("The mark in chem");
        int chem = sc.nextInt();
        float totalMarks = math + phy + chem;
        float percentage = (totalMarks/300) * 100;
        System.out.println("The percentage is: ");
        System.out.println(percentage);
        double CGPA = percentage / 9.5;
        System.out.println("The cgpa is: ");
        System.out.println(CGPA);
    }
}
