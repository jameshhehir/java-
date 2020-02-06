public class DataTypes {
    public static void main (String args[]) {
        byte num = 112; // any mnumber between -128 and 127. Used mostly to save memory
        short num1 = 32767; // Range -32768 to 32767
        int num2 = 2147483647; // Range 2,147,483,648 to 2,147,483,647
        long num3 = 2376566562852750L; //Range -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        double num4 = 3.1928373648; //this hold a decimal capable of hold 15 places 
        float num5 = 1.29876f; //capable of holding 6 to 7 decimal digits
        boolean f = false; //Boolean is capable of holding a 'true' or 'false' statement;
        char ch = 'T'; //char is capable of storing characters 

        System.out.println("This is a byte: " + num);
        System.out.println("This is a short: " +num1);
        System.out.println("This is an int: " +num2);
        System.out.println("This is a long: " +num3);
        System.out.println("This is a double: " +num4);
        System.out.println("This is a float: " +num5);
        System.out.println("This is a boolean: " +f);
        System.out.println("This is a char: " +ch);

    }

// The above data types are literal which means they have a fixed value assigned to the varibale

}