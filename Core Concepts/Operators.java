// An operator is a character that represents an action

public class Operators {
    public static void main(String args[]) {
        int num = 1000;
        int num2 = 20; 

        System.out.println("num + num2 is " + (num + num2)); // addition
        System.out.println("num - num2 is " + (num - num2)); // subtraction
        System.out.println("num * num2 is " + (num * num2)); // multiplication
        System.out.println("num / num2 is " + (num / num2)); // division
        System.out.println("num % num2 is " + (num % num2) + "\n"); // modulo

        /** Assignment Operators Examples
        -> num2 = num would assign value of variable num to the variable.
        -> num2+=num is equal to num2 = num2+num
        -> num2-=num is equal to num2 = num2-num
        -> num2*=num is equal to num2 = num2*num
        -> num2/=num is equal to num2 = num2/num
        -> num2%=num is equal to num2 = num2%num
        */  
        num2 = num;
        System.out.println("= Output: " + num2); // 1000
        num2 += num;
        System.out.println("+= Output: " + num2); // 2000
        num2 -= num;
        System.out.println("-= Output: " + num2); // 1000
        num2 *= num;
        System.out.println("*= Output: " + num2); // 1000000
        num2 /= num;
        System.out.println("/= Output: " + num2); // 1000
        num2 %= num;
        System.out.println("%= Output: " + num2 + "\n"); // 0

        num2 = 20; // reassign variable for rest of program

        /** Auto-increment and Auto-decrement Operators
        -> num++ is equivalent to num=num+1
        -> num-- is equivalent to num=num-1
         */

         int num3 = 100;
         int num4 = 200;

         num3++;
         num4--;

         System.out.println("num3++ is " + num3);
         System.out.println("num4-- is " + num4 + "\n");

        /** Logical Operators

         -> are used with binary variables in conditional statements and loops
         # && = b1&&b2 will return true if both b1 and b2 are true else it would return false.
         # || = b1||b2 will return false if both b1 and b2 are false else it would return true.
         # ! = !b1 would return the opposite of b1, that means it would be true if b1 is false and it would return false if b1 is true.
         
        */

          boolean b1 = true;
          boolean b2 = false;

          System.out.println ("b1 && b2: " + (b1&&b2)); // false
          System.out.println("b1 || b2: " + (b1 || b2)); // true
          System.out.println("!(b1 && b2): " + !(b1&&b2) + "\n"); // true


          /** Relational Operators

          == returns true if both the left side and right side are equal
          != returns true if left side is not equal to the right side of operator
          > returns true if left side is greater than right
          < returns true if left side is less than right side.
          <= returns true if left side is less than or equal to right side.

          */


          if (num==num2) {
              System.out.println("num and num2 are equal");
          }
          else {
              System.out.println("num and num2 are not equal");
          }

          if (num!=num2) {
              System.out.println("num and num2 are not equal");
          }
          else {
              System.out.println("num and num2 are equal");
          } 

          if (num>num2) {
              System.out.println("num is greater than num2");
          }
          else {
              System.out.println("num is not greater than num2");
          }  

          if (num>=num2) {
              System.out.println("num is greater than or equal to num2");
          }
          else {
              System.out.println("num is not greater than or equal to num2");
          }  

          if (num<num2) {
              System.out.println("num is less than num2");
          }
          else {
              System.out.println("num is not less than num2");
          } 

          if (num<=num2) {
              System.out.println("num is less than or equal to num2");
          }
          else {
              System.out.println("num is not less than or equal to num2\n");
          }           


          /** Ternary Operator
          This operator evaluates a boolean expression and assign the value based on the result.
           */

           num2 = (num == 10) ? 100:200;
           System.out.println("num2: " + num2);

           num2 = (num == 1000) ? 100:200;
           System.out.println("num2: " + num2);


           /**
           Operator Precedence in Java

                This determines which operator needs to be evaluated first if an expression has more than one operator. Operator with higher precedence at the top and lower precedence at the bottom.
                Unary Operators
                ++  – –  !  ~

                Multiplicative
                *  / %

                Additive
                +  –

                Shift
                <<  >>  >>>

                Relational
                >  >=  <  <=

                Equality
                ==  !=

                Bitwise AND
                &

                Bitwise XOR
                ^

                Bitwise OR
                |

                Logical AND
                &&

                Logical OR
                ||

                Ternary
                ?:

                Assignment
                =  +=  -=  *=  /=  %=  >  >=  <  <=  &=  ^=  |=
           
           
        */



    }

}