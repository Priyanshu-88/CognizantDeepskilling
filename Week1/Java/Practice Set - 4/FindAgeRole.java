public class FindAgeRole {
    public static void main(String[] args){
        int age = 32;
        if(age < 18){
            System.out.println("You are a child");
        } else if(age > 18 && age < 28){
            System.out.println("You are a adult");
        } else{
            System.out.println("You are senior member");
        }
    }
}
