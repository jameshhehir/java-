public class InstanceVariableExample {
    String myVar="This is the original statement";

    public static void main(String args[]) {
        InstanceVariableExample obj = new InstanceVariableExample();
        InstanceVariableExample obj2 = new InstanceVariableExample();
        InstanceVariableExample obj3 = new InstanceVariableExample();

        System.out.println(obj.myVar);
        System.out.println(obj2.myVar);
        System.out.println(obj3.myVar);

        // change the instance variable 

        obj2.myVar = "This is the changed statement";

        System.out.println(obj.myVar);
        System.out.println(obj2.myVar);
        System.out.println(obj3.myVar);

        //This is similar to the static example except you can change one instance instead of all three. In this example obj2 is changed

    }



}