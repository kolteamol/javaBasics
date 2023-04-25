package com.mack;


// child or derived class
class A
{
    void foo()
    {
        System.out.println("Inside the foo method of base class.");
    }
}
class B extends A
{
    void foo()
    {
        System.out.println("Inside the foo method of derived class.");
    }
}
public class CouplingExample {
    public static void main(String argvs[])
    {

// creating an object of class B
        B obj = new B();
        obj.foo();
    }
}
