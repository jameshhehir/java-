public class ConstructorExample {
    int age;
    String name;

    //a constructor has the same name as the class
    ConstructorExample() {
        this.age = 49;
        this.name = "John Jacob";

    }

    // another constructor example 
    ConstructorExample(int a, String n) {
        this.age = a;
        this.name = n;
    }

    public static void main(String arg[]) {
        ConstructorExample person1 = new ConstructorExample();
        ConstructorExample person2 = new ConstructorExample(32, "Naa Naa");

        System.out.println(person1.name + " " + person1.age);
        System.out.println(person2.name + " " + person2.age);
    }




}