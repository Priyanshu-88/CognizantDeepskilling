import java.util.Scanner;

public class GradeEncryption{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade:");
        int grade = sc.nextInt();

        //Encrypt Grade
        int encryptGrade = grade + 8;
        System.out.println("The grade encrypted: " + encryptGrade);

        //Decrypt Grade
        int decryptGrade = encryptGrade - 8;
        System.out.println("The grade decrypted: " + decryptGrade);
    }
}