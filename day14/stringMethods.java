public class stringMethods {
    public static void main(String[] args) {
        String fName = "Shishir";
        String lName = "Shekhar";

        // Get character
        System.out.println(fName.charAt(0));
        // Get unicode value
        System.out.println(fName.codePointAt(0));
        // Get unicode value before
        System.out.println(fName.codePointBefore(1));
        // Number of unicode points
        System.out.println(fName.codePointCount(0, 3));
        // Compare String
        System.out.println(fName.compareTo(lName));
        // Compare String and ignore case
        System.out.println(fName.compareToIgnoreCase(lName));
        // Concat
        System.out.println(fName.concat(lName));
        // Check for a particular value
        System.out.println(fName.contains("S"));
        // Check end value
        System.out.println(fName.endsWith("s"));
        // Check for equality
        System.out.println(fName.equals(lName));
        // Check for equality ignore case
        System.out.println(fName.equalsIgnoreCase(lName));
        // Get byte
        System.out.println(fName.getBytes());
        // Get byte with character set
        System.out.println(fName.getBytes());
        // Get char
        // fName.getChars(0, 0, null, 0);
        // System.out.println(fName);
        // hash the string value
        System.out.println(fName.hashCode());
        // get index of char
        System.out.println(fName.indexOf('s'));
        // get index of char from after an index
        System.out.println(fName.indexOf('s', 2));
        // get index of string
        System.out.println(fName.indexOf("sh"));
        // get index of string from after an index
        System.out.println(fName.indexOf("shi", 2));
        // check empty
        System.out.println(fName.isEmpty());
        // check last index
        System.out.println(fName.lastIndexOf('s'));
        // check last index after an index
        System.out.println(fName.lastIndexOf('s', 2));
    }
}
