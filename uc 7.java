public class HelloApp {
    public static void main(String[] args) {

        // No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Join arguments with comma
        String result = "Hello, ";

        for (int i = 0; i < args.length; i++) {
            result += args[i];
            if (i < args.length - 1) {
                result += ", ";
            }
        }

        result += "!";
        System.out.println(result);
    }
}