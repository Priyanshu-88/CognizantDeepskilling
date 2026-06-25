public class stringMethods {
    public static void main(String[] args) {
        String name1 = new String("Priyanshu");
        String name2 = "Harish";
        int len = name2.length();
        System.out.println(len);

        String upperName = name1.toLowerCase();
        System.out.println(upperName);

        String lowerName = name1.toUpperCase();
        System.out.println(lowerName);

        String nonTrimedSString = "   HARSH    ";
        System.out.println(nonTrimedSString);
        System.out.println(nonTrimedSString.trim());

        String subPart = name1.substring(2);
        System.out.println(subPart);

        String subPart2 = name1.substring(2, 5);
        System.out.println(subPart2);

        String str = "Papph";
        String rep = str.replace('P', 'h');
        System.out.println(rep);

        System.out.println(str.startsWith("Pa"));
        System.out.println(str.endsWith("ph"));

        System.out.println(name1.charAt(0));

        String modName = "Ishika";
        System.out.println(modName.indexOf("ik"));
        System.out.println(modName.indexOf("ka", 2));

        //Escape sequence
        System.out.println("My name is \" Priyanshu");
    }
}
