package Oops;

class Person {
  String name;
  int age;

  public Person() {
    System.out.println("Person are being created.");
  }

  void walk() {
    System.out.println(this.name + " is walking.");
  }

  void walk(int steps) {
    System.out.println(this.name + " walked " + steps + " steps.");
  }

  void eat() {
    System.out.println(this.name + " is eating.");
  }
}

public class Oops {

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.age = 0;
    p1.name = "nice";

    p1.eat();
    p1.walk();
    p1.walk(10);
  }
}
