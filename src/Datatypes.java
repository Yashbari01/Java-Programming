public class Datatypes { // The main class named 'Datatypes'.
    public static void main(String[] args) { // The main method, the entry point of the Java application.
        // println and print difference:
        // println will print the message and then move the cursor to a new line.
        // print will print the message and keep the cursor on the same line.

        // There are 8 Primitive data types in Java:
        // boolean, char, byte, int, short, long, float, and double.

        // int DataType:
        // Represents a 32-bit signed integer with a value range from -2,147,483,648 to 2,147,483,647.
        int a = 10; // Declares an integer variable 'a' and assigns it a value of 10.
        int b = 20; // Declares an integer variable 'b' and assigns it a value of 20.
        System.out.println(a + b); // Prints the sum of 'a' and 'b' which is 30.

        // char DataType:
        // Represents a single 16-bit Unicode character with a range from '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).
        char Data = 'A'; // Declares a char variable 'Data' and assigns it the character 'A'.
        System.out.println(Data); // Prints the character 'A'.

        // byte DataType:
        // Represents an 8-bit signed integer with a value range from -128 to 127.
        byte b1 = 1; // Declares a byte variable 'b1' and assigns it a value of 1.
        System.out.println(b1); // Prints the value of 'b1' which is 1.

        // short DataType:
        // Represents a 16-bit signed integer with a value range from -32,768 to 32,767.
        short s1 = 32767; // Declares a short variable 's1' and assigns it the maximum value of 32767.
        System.out.println(s1); // Prints the value of 's1' which is 32767.

        // long DataType:
        // Represents a 64-bit signed integer with a value range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        long L1 = 9223372036854775807L; // Declares a long variable 'L1' and assigns it the maximum value for a long with an 'L' suffix.
        System.out.println(L1); // Prints the value of 'L1' which is 9223372036854775807.

        // boolean DataType:
        // Represents one of two possible values: true or false.
        boolean bool1 = a == b; // Declares a boolean variable 'bool1' and assigns it the result of the expression 'a == b', which is false.
        System.out.println(bool1); // Prints 'false' since 'a' is not equal to 'b'.

        // float DataType:
        // Represents a single-precision 32-bit IEEE 754 floating point. Its value range is limited by the number of significant digits, but effectively infinite.
        float f1 = 10.1f; // Declares a float variable 'f1' and assigns it a value of 10.1. The 'f' suffix indicates a float literal.
        System.out.println(f1); // Prints the value of 'f1' which is 10.1.

        // double DataType:
        // Represents a double-precision 64-bit IEEE 754 floating point. Its value range is also limited by the number of significant digits, but effectively infinite.
        double D1 = 98.7887670; // Declares a double variable 'D1' and assigns it a value of 98.7887670.
        System.out.println(D1); // Prints the value of 'D1' which is 98.7887670.

        // There are 3 Non-Primitive data types in Java:
        // Strings, arrays, and classes.

        // String is a class that represents a sequence of characters.
        String string1 = "Hello I am Yash"; // Declares a String variable 'string1' and assigns it the text "Hello I am Yash".
        System.out.println(string1); // Prints the value of 'string1', which is "Hello I am Yash".
    }
}
