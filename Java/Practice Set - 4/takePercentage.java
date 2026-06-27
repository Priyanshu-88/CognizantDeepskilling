import java.util.Scanner;

public class takePercentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of subjects");
        System.out.print("Enter the marks of phy: ");
        int phy = sc.nextInt();
        System.out.print("Enter the marks of maths: ");
        int math = sc.nextInt();
        System.out.print("Enter the marks of chem: ");
        int chem = sc.nextInt();

        double totalMarks = phy + math + chem;
        double takePercentage = totalMarks / 300 * 100;

        System.out.println(takePercentage);

        if(takePercentage > 33.0){
            System.out.println("You are pass!!");
        } else{
            System.out.println("Sorry, you are fail");
        }
    }
}
