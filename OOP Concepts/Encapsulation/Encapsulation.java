/**
 * Encapsulation simply means binding object state(fields) and behavior(methods) together. 
 * If you are creating class, you are doing encapsulation.
 */

class PeopleCount {
     private int numOfPeople = 0; //declaring this insatnce variable private to stop it being called from outsie the class
     public void setNumOfPeople (int count) {
         numOfPeople = count;
     }
     public double getNumOfPeople () {
         return numOfPeople;
     }
 }

 public class Encapsulation {
     public static void main(String args[]){
         PeopleCount noPeople = new PeopleCount();
         noPeople.setNumOfPeople(4645);
         System.out.println("No of people: " + (int)noPeople.getNumOfPeople());
     }
 }

 /**
  * So what is the benefit of encapsulation in java programming
Well, at some point of time, if you want to change the implementation 
details of the class PeopleCount, you can freely do so without affecting 
the classes that are using it.
  */