package oop;

public class Inheritance {
    public static void main(String[] args) {
        Parent p = new Parent(); //Static block executed
//        Parent.print();
//        System.out.println();

    }
}

class Parent{
    static String name;
    static {
        name = "Thilina";
        System.out.println("Static block executed");
    }
    public static void print(){
        System.out.println("Hello");
    }

}

class Child {

}