public class string_all_methods {
    public static void main(String[] args) {
        // this is upper case, lower case methods of string
        String a = "hii am jagannath lerning java";
        System.out.println("\tthis is upper case and lower case methods of string\n");
        System.out.println("this is upper case: " + a.toUpperCase());
        System.out.println("this is original: " + a);
        System.out.println("this is lower case: " + a.toLowerCase());

        // this is length, use length() method to get the length of a string. The length
        // of a string is the number of characters in it.
        String fn = "jagannath";
        String fl = " phad";
        System.out.println("\n\tthis is length, method of string\n");
        System.out.println("fn + fl: " + fn + fl);
        System.out.println("Length of fn: " + fn.length());
        System.out.println("Length of fl: " + fl.length());
        // this is == and equals methods of string
        // use == operator to compare the reference of two strings, and use equals()
        // method to compare the content of two strings.
        System.out.println("\n\tthis is == and equals methods of string\n");
        System.out.println("fn == fl: " + (fn == fl));
        System.out.println("fn.equals(fl): " + fn.equals(fl));
        // charAt method of string
        // use charAt() method to get the character at a specific index in a string. The
        // index starts from 0.
        System.out.println("\n\tthis is charAt method of string\n");
        System.out.println("charAt(0) of fn: " + fn.charAt(0));
        // equalsIgnoreCase method of string
        // use equalsIgnoreCase() method to compare two strings, ignoring case
        // considerations.
        System.out.println("\n\tthis is equalsIgnoreCase method of string\n");
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println("equalsIgnoreCase method: " + str1.equalsIgnoreCase(str2));
        // contains method of string
        // use contains() method to check if a string contains a specific sequence of
        // characters.
        System.out.println("\n\tthis is contains method of string\n");
        String str3 = "Hello, World!";
        System.out.println("contains method: " + str3.contains("World"));
        // substring method of string
        // use substring() method to extract a part of a string. It takes two
        // parameters: the starting index (inclusive) and the ending index (exclusive).
        System.out.println("\n\tthis is substring method of string\n");
        System.out.println("substring method: " + str3.substring(7, 12));
        // indexOf method of string
        // use indexOf() method to find the index of the first occurrence of a specific
        // character or substring in a string. It returns -1 if the character or
        // substring is not found.
        System.out.println("\n\tthis is indexOf method of string\n");
        System.out.println("indexOf method: " + str3.indexOf("e"));
        System.out.println("indexOf method: " + str3.indexOf("World"));
        System.out.println("indexOf method: " + str3.indexOf("o"));
       
        // replace method of string
        // use replace() method to replace all occurrences of a specific character or
        // substring in a string with another character or substring.
        System.out.println("\n\tthis is replace method of string\n");
        System.out.println("replace method: " + str3.replace("World", "Java"));
        System.out.println(str3);
        //trim method of string
        // use trim() method to remove leading and trailing whitespace from a string.
        System.out.println("\n\tthis is trim method of string\n");
        String str4 = "   Hello, World!   ";
        System.out.println("trim method: [" + str4.trim() + "]");
    }
}
