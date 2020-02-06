/** Switch case statements is used when we have a number of choics and we may need 
to perform a different task for each choice
*/


public class SwitchCase {

    public static void main(String args[]) {
        int num=2;
        switch (num+=num) {
            case 1:
            System.out.println("Case 1: " + num);
            break;
            case 2:
            System.out.println("Case 2: " + num);
            break;
            case 3:
            System.out.println("Case 3: " + num);
            break;
            case 4:
            System.out.println("Case 4: " + num);
            break;
            default:
            System.out.println("Default: " + num);
        }
        
        //This is a switch case statement example with breaks which can be optional but can cause problems if not implemented

        char ch = 'j';

        switch (ch) {
            case 'a':
            System.out.println("Case a: " + ch);
            break;
            case 'b':
            System.out.println("Case b: " + ch);
            break;
            case 'j':
            System.out.println("Case j: " + ch);
            break;
            case 'd':
            System.out.println("Case d: " + ch);
            break;
            default:
            System.out.println("Default: " + ch);
        }

        //This is another switch case statement except with characters as cases instead of numbers
    
    
    }
    

}
