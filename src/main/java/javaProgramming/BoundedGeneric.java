package javaProgramming;

class Bound<T extends A>{

    private T objRef;

    public Bound(T obj){
        this.objRef = obj;
    }

    public void doRunTest(){
        this.objRef.displayClass();
    }
}

class A{
    public void displayClass(){
        System.out.println("Inside Super Class");
    }
}
class B extends A{
    public void displayClass(){
        System.out.println("Inside Sub Class B");
    }
}

class C extends A{
    public void displayClass(){
        System.out.println("Inside Sub Class C");
    }
}

public class BoundedGeneric {

    public static void main(String[] args){

        Bound<A> bA = new Bound<A>(new A());
        bA.doRunTest();

        Bound<B> bB = new Bound<B>(new B());
        bB.doRunTest();

        Bound<C> bC = new Bound<C>(new C());
        bC.doRunTest();
    }
}
