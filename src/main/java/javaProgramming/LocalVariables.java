package javaProgramming;
//Initialisation of local variables is mandatory
public class LocalVariables {

    public LocalVariables(){
        int marks=35;
        marks = marks+10;
        System.out.println(marks);
    }


    public static void main(String[] args){
        LocalVariables lv= new LocalVariables();
    }
}
