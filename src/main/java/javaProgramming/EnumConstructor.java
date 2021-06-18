package javaProgramming;

enum ColorConstructor{
    RED,GREEN,BLUE;

    private ColorConstructor(){
        System.out.println("Constructor Called for: "+this.toString());
    }

    public void ColorInfo(){
        System.out.println("Called Color");
    }
}
public class EnumConstructor {

    public static void main(String[] args){
        ColorConstructor c1 = ColorConstructor.RED;
        System.out.println(c1);
        c1.ColorInfo();
    }
}
