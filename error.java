class Parent {
    public final void display() {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent {
    // This will give a compile error because the display()
    // method in the Parent class is marked as final
    //  public void display() {
    //     System.out.println("This is the Child class");
    // } 
}

public class error {
    public static void main(String[] args) {
        Child ob = new Child();
        ob.display(); 
    }
}