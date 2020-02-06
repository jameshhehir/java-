/**
 * Continue Statements are mostly used inside loops similar to break statements
 * Whenever it is encountered inside a loop, control directly jumps to the beginning 
 * of the loop for next iteration, skipping the execution of statements inside loop’s 
 * body for the current iteration. 
 */

 public class ContinueStatements {

    public static void main(String args[]) {
        for (int i=0; i<=6; i++) {
            if (i==4) {
                continue;
            }

            System.out.print(i + " ");
            
        }

        int j=0;
        do 
        {
            if (j<=7) {
                j++;
                continue;
            }
            System.out.print(j+ " ");
            j++;
        }while (j<10);
    }
 }