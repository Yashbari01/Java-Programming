public class Datatypes {
    public static void main(String[] args){
//        println and print different these two that println will display the message on a new line while the print statement will print the message on the same line.

//        There are 8 Primitive data types in Java – Boolean, char, byte, int, short, long, float, and double.

//        int DataType value range lies between -2,147,483,648 to 2,147,483,647.
        int a=10;
        int b=20;
        System.out.println(a+b);

//        Char DataType value range lies between '\u0000'(or 0) to '\uffff' (or 65,535 inclusive).
        char Data ='A';
        System.out.println(Data);

//        Byte DataType value range lies between -128 to 127.
        byte b1=1;
        System.out.println(b1);

//        short DataType value range lies between -32768 to 32767.
        short s1=32767;
        System.out.println(s1);

//        long DataType value range lies between -9223372036854775808 to 9223372036854775807 (32-bit).
        long L1= 9223372036854775807L;
        System.out.println(L1);

//        Boolean DataType is only two possible values true/false.
        boolean bool1= a == b;
        System.out.println(bool1);

//        float DataType is a single-precision 32-bit IEEE 754 floating point. Its value range is unlimited.
        float f1= 10.1f;
        System.out.println(f1);

//        Double DataType is a double-precision 64-bit IEEE 754 floating point. Its value range is unlimited.
        double D1= 98.7887670;
        System.out.println(D1);

//        There are 3 Non-Primitive data types in Java – strings, arrays, and classes.
        String string1 = "Hello I am Yash";
        System.out.println(string1);
    }
}
