/**
 * The primary purpose of object-oriented programming is to increase the flexibility and 
 * maintainability of programs. Object oriented programming brings together data and its 
 * behaviour(methods) in a single location(object) makes it easier to understand how a 
 * program works.
 */

 /**
  * -> Object : is a bundle of data and its behaviour known as methods
  * It has two characteristics: States and Behaviour
  * In this example I will make a car object
  * Object: Car; State: Colour, Year; Behaviour: Driving, Parked
  */

  public class Car {
      //Instance variables which are the fields
      String carColor;
      int carYear;

      //constructor 
      Car(String color, int year) {
          this.carColor = color;
          this.carYear = year;

      }
      public static void main(String args[]) {
          //creating objects 
          Car object = new Car("Yellow", 2019);
          Car object2 = new Car("Black", 2018);

          System.out.println(object.carColor + " " + object.carYear);
          System.out.println(object2.carColor + " " + object2.carYear);
      }

  }

