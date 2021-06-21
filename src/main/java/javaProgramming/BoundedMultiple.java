package javaProgramming;

class BoundMultiple<T extends AMultiple & BMultiple>{
    private T objRef;

    public BoundMultiple(T obj){
        this.objRef = obj;
    }

    public void doRunTest(){
        this.objRef.classDisplay();
    }
}
interface BMultiple{
    public void classDisplay();
}
class AMultiple implements BMultiple{

    @Override
    public void classDisplay() {
        System.out.println("Inside Super class A");
    }
}
public class BoundedMultiple {

    public static void main(String[] args){

        BoundMultiple<AMultiple> bMultipleA = new BoundMultiple<AMultiple>(new AMultiple());
        bMultipleA.doRunTest();

    }

}

