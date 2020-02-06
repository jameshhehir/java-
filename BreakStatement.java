/** usually used to come out of the loop and also used in 
switch statements to stop the switch statement executing more 
cases after the desired one has being found */

public class BreakStatement {
    public static void main(String args[]) {

        //Example of a while loop with a break
        int num=0;
        while(num<=100)
        {
            System.out.println("Value of variable is: " +num);
            if (num==2) 
            {
                break;
            }
            num++;
        }
        System.out.println("Out of while-loop");

        //Example of a for loop with a break

        for (int i=1;i<10;i++) {
            System.out.println("Value of the variable is: " +i);

            if (i>=7) {
                break;
            }
       
        }
        System.out.println("This is out of the loop");
    
    }
}