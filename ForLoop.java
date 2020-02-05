/** Loops are used to execute a set of statements repeatedly until a particular condition is satisfied.
Syntax of for loop:
for(initialization; condition ; increment/decrement)
{
   statement(s);
}

 */

 public class ForLoop {
     public static void main(String args[]) {

         //Simple for loop that decrements from 10 to 1
         for (int i=10;i>0;i--) {
             System.out.println("The value of i is: " + i + "\n");
         }

         //Infinite Loop
         for (int i=1; i==1; i++) {
             System.out.println("The value of i is: " + i + "\n");
         }
         
         //Looping an array
         String arr[] = {"Jimmy", "Jack", "Erik", "Kevin"};

         for (int i=0; i<arr.length; i++) {
             System.out.println(arr[i] + " is number " + (i+1) + " in the queue");
         }

         System.out.println("\n");

         //Enhanced for loop on arrays

         int i = 1;

         for (String name : arr) {
             System.out.println(name + " is number " + (i++) + " in the queue");
         }
     }
 }