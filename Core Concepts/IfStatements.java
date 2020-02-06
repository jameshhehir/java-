/** If you need to execute a set of statements based on a condition 
then we need to use control flow statements. 

4 types in this example are:

a) if statement
b) nested if statement
c) if-else statement
d) if-else-if statement

*/

public class IfStatements {

    public static void main(String args[]) {
        int num = 10;

        if (num>5) {
            System.out.println("This is true because 10 is greater than 5\n");
        }
        // This is an example of an if statement

        if (num>6) {
            if (num<11) {
                System.out.println("This is true\n");
            }
        }
        //This is an example of a nested if statement

        if (num>10) {
            System.out.println("num is greater than 10");
        }
        else {
            System.out.println("num is less than or equal to 10\n");
        }
        //This is an example of an if-else statement

        int numBig = 1234;

        if (numBig <100 && numBig>=1) {
            System.out.println("It is a two digit number");
        }
        else if (numBig <1000 && numBig>=100) {
            System.out.println("It is a three digit number");
        }
        else if (numBig <10000 && numBig>=1000) {
            System.out.println("It is a four digit number");
        }
        else if (numBig <100000 && numBig>=10000) {
            System.out.println("It is a five digit number");
        }
        else if (numBig <1000000 && numBig>=100000) {
            System.out.println("It is a six digit number");
        } 



    }


}
