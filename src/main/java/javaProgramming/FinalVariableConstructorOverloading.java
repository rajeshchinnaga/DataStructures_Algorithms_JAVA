package javaProgramming;

public class FinalVariableConstructorOverloading {

    final int i;

    FinalVariableConstructorOverloading(int x){
        this.i =x;
    }

    FinalVariableConstructorOverloading(){

        this.i=20;
    }

    public static void main(String[] args){

        FinalVariableConstructorOverloading fv1 = new FinalVariableConstructorOverloading(10);
        System.out.println("Final Variable 1 is: "+fv1.i);

        FinalVariableConstructorOverloading fv2 = new FinalVariableConstructorOverloading();
        System.out.println("Final Variable 1 is: "+fv2.i);
    }
}
