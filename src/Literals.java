public class Literals { // Class declaration named Literals
    public static void main(String[] args) { // Main method, entry point of the program
        int count = 356; // Decimal integer literal assigned to variable 'count'
        System.out.println(count); // Prints the decimal value: 356

        int Octal = 011; // Octal integer literal (leading zero) assigned to variable 'Octal'
        System.out.println(Octal); // Prints the decimal value of octal 011: 9

        int hexadecimal = 0x67e; // Hexadecimal integer literal (0x prefix) assigned to variable 'hexadecimal'
        System.out.println(hexadecimal); // Prints the decimal value of hexadecimal 0x67e: 1662

        int binary = 0b0011; // Binary integer literal (0b prefix) assigned to variable 'binary'
        System.out.println(binary); // Prints the decimal value of binary 0b0011: 3

        char cha1 = 'A'; // Character literal 'A' assigned to variable 'cha1'
        System.out.println(cha1); // Prints the character: A

        char cha2 = '\u0021'; // Unicode escape sequence for '!' assigned to variable 'cha2'
        System.out.println(cha2); // Prints the character: !

        boolean bool = true; // Boolean literal true assigned to variable 'bool'
        System.out.println(bool); // Prints the boolean value: true

        String str1 = "Yash"; // String literal "Yash" assigned to variable 'str1'
        System.out.println(str1); // Prints the string: Yash

        String str2 = null; // null literal assigned to variable 'str2' (no reference)
        System.out.println(str2); // Prints: null
    }
}
