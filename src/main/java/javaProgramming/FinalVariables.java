package javaProgramming;

public class FinalVariables {

    final int i;

    FinalVariables(int x){
        this.i =x;
    }

    public static void main(String[] args){

        FinalVariables fv1 = new FinalVariables(10);
        System.out.println("Final Variable 1 is: "+fv1.i);




        FinalVariables fv2 = new FinalVariables(20);
        System.out.println("Final Variable 1 is: "+fv2.i);
    }
}
