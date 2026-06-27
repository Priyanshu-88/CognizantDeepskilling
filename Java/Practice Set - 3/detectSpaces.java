public class detectSpaces {
    public static void main(String[] args){
        String sentence = "The spaces exist between many form      doubles and triples";

        int spaces = sentence.indexOf("  ");
        System.out.println(spaces);
    }
}
