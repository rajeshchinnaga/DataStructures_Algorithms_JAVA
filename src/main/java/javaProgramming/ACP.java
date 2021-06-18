package javaProgramming;

public class ACP {

    public static void main(String[] args){
        StringBuffer sbf = new StringBuffer("RAJESH IS A GOOD BOY");
        System.out.println("Statement is: "+sbf);

        sbf.appendCodePoint(63);
        System.out.println("After appending Code Point-Statement is: "+sbf);
    }
}
