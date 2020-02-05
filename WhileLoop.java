/**
Syntax of while loop
while(condition)
{
   statement(s);
}
 */

 public class WhileLoop {

     public static void main(String args[]) throws Exception {
         //while loop simple example with sleep function
         int i=10;
         while(i>0) {
             System.out.println(i);
             Thread.sleep(1000);
             i--;
         }

         System.out.println("LIFT OFF!!");

         String arr[] = {"Liverpool","Man Utd","Chelsea","Everton"};

         int j = 0;

         while (j<=3) {
             System.out.println("The biggest financial teams are: " + arr[j]);
             Thread.sleep(1000);
             j++;
         }



     }


 }