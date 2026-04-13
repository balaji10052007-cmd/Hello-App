public class HelloArgs {
    public static void main(String[] args) {

        // If no arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Join arguments with comma
        StringBuilder result = new StringBuilder();

        for (String name : args) {
            result.append(name).append(", ");
        }

        // Remove last comma and space
        result.setLength(result.length() - 2);

        System.out.println("Hello, " + result + "!");
    }
}