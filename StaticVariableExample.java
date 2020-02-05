public class StaticVariableExample {
    public static String myVar="This is the original statement";

    public static void main(String args[]) {
        StaticVariableExample obj = new StaticVariableExample();
        StaticVariableExample obj2 = new StaticVariableExample();
        StaticVariableExample obj3 = new StaticVariableExample();

        System.out.println(obj.myVar);
        System.out.println(obj2.myVar);
        System.out.println(obj3.myVar);
        
        //At this point, the program will display "This is the..." 3 times as static variables

        obj.myVar = "This is the changed statement"; //changing the value of the static variable using obj

        System.out.println(obj.myVar);
        System.out.println(obj2.myVar);
        System.out.println(obj3.myVar);

        //By changing the static variable at line 15, it changes the string to "This is the changed statement"
    
    }


}