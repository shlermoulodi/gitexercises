package gitday1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("creating probs yo");
        System.out.println();
        String name = "Shler";
        System.out.println(toLower(name));
        System.out.println(toUpper(name));
    }

    private static String toUpper(String str) {
        return str.toUpperCase();
    }

    private static String toLower(String s) {
        return s.toLowerCase();
    }
}
