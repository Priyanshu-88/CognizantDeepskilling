import java.util.Scanner;
public class CBSEPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of maths");
        int maths = sc.nextInt();
        System.out.println("Enter the marks of physics");
        int phy = sc.nextInt();
        System.out.println("Enter the marks of chemistry");
        int chem = sc.nextInt();
        System.out.println("Enter the marks of Commercial Arts");
        int arts = sc.nextInt();
        System.out.println("Enter the marks of Computer Science");
        int cs = sc.nextInt();

        double totalMarks = maths+phy+chem+arts+cs;

        double percentage = (totalMarks/500) * 100;

        System.out.println("The percentage you scored is: ");
        System.out.println(percentage);
    }
}
