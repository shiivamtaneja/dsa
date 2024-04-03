package Oops;

class Person {
  String name;
  int age;

  // static is used so that this variable can be
  // accessed without creating an object of that class
  static int count;

  public Person() {
    count++;
    System.out.println("creating a Person.");
  }

  public Person(int age, String name) {
    // this() calls the default constructor
    this();
    this.age = age;
    this.name = name;
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

    // p1.eat();
    // p1.walk();
    // p1.walk(10);

    Person p2 = new Person(20, "New User");

    System.out.println(Person.count);
  }
}
