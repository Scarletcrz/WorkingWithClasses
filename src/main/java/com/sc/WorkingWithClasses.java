package com.sc;

public class WorkingWithClasses {
     public static void main(String[] arg){
          Person scarlet = new Person("Scarlet", 29, "06-24-1993", true,"000-00-0000);
//          scarlet.name = "Scarlet";
//          scarlet.age = 29;
//          scarlet.birthday = "06-24-1993";
//          scarlet.hasTattoo = true;
//          System.out.println(scarlet.name);

          System.out.println();
     }
}

class Person {
     //This is the mold to the code.(Cookie cutter)
     // Properties
    private String name;
    private int age;
    private String birthday;
    private boolean hasTattoo;
    private  String ssn =

     // Constructor method
     public Person (String name, int age, String birthday, boolean hsTattoo, String ssn){
          this.name = name;
          this.age = age;
          this.birthday = birthday;
          this.hasTattoo = hasTattoo;
          this.ssn = ssn;

     }

     // Methods- Getter and Setters
     public String getName(){
         return this.name;
     }



}
