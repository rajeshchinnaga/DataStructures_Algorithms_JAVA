package javaProgramming;

public class LocalVariablesScope {

    static int x = 11;
    private int y = 33;
    public void method1(int x)
    {
        LocalVariablesScope t = new LocalVariablesScope();
        this.x = 22;
        y = 44;

        System.out.println("Test.x: " + LocalVariablesScope.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }

    public static void main(String args[])
    {
        LocalVariablesScope t = new LocalVariablesScope();
        t.method1(5);
    }
}
