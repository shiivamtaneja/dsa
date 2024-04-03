package Oops;

class Person {
  String name;
  int age;
}

public class Oops {

  public static void main(String[] args) {
    Person p1 = new Person();

    p1.age = 0;
    p1.name = "nice";

    System.out.println("Name " + p1.name + " Age " + p1.age);
  }
}
