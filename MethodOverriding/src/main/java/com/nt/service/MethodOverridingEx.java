package com.nt.service;

class Animal {
    void eat()
    {
        System.out.println("eat() method of base class");
        System.out.println("eating.");
    }
}

// Inherited Class
class Dog extends Animal {
    void eat()
    {
        System.out.println("eat() method of derived class");
        System.out.println("Dog is eating.");
    }
}

// Driver Class
class MethodOverridingEx {
    // Main Function
    public static void main(String args[])
    {
        Dog d1 = new Dog();
        Animal a1 = new Animal();

        d1.eat();      
        a1.eat();

          // Polymorphism: Animal reference pointing to Dog object
        Animal animal = new Dog();
      
          // Calls the eat() method of Dog class
        animal.eat(); 
    }
}

