public class SingletonPattern {

    public static void main(String[] args) {

        // Getting Logger instance
        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");

        // Getting Logger instance again
        Logger logger2 = Logger.getInstance();
        logger2.log("User logged in.");

        // Checking if both the references point to the same object or not
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("Different instances created.");
        }

        // Printing hash codes to verify
        System.out.println("Logger1 HashCode: " + logger1.hashCode());
        System.out.println("Logger2 HashCode: " + logger2.hashCode());
    }
}