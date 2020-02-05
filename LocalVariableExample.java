public class LocalVariableExample {
    // declaring an instance variable
    public String myVar="This is an instance variable";

    public void myLocalMethod() {
        // creating a local variable 
        String myVar="This is my local method";
        System.out.println(myVar);
    }
    public static void main(String args[]) {
        // creating an object 
        LocalVariableExample obj = new LocalVariableExample();

        /* We are calling the method, that changes the 
       * value of myVar. We are displaying myVar again after 
       * the method call, to demonstrate that the local 
       * variable scope is limited to the method itself.
       */
       
       obj.myLocalMethod();
       System.out.println(obj.myVar);
       



    }




}