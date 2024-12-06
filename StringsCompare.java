public class StringsCompare {
    public static void main(String[] args) {
        String name1 = "Atul";
        String name2 = "Atul";

        // Concatenation of String
        String sum = name1 + " " + name2;
        System.out.println(sum);

        // Comparing using compareTo keyword
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are NOT Equal");
        }

        // Comparing using "==" in string
        if (name1 == name2) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are NOT Equal");
        }

        // Using String Object
        if (new String("Atul") == new String("Atul")) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are NOT Equal");
        }
    }
}