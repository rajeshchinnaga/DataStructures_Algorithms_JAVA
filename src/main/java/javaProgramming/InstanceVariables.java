package javaProgramming;

class Marks{
    int java_marks;
    int python_marks;
    int c_marks;
}
public class InstanceVariables {

   public static void main(String[] args){

   Marks student1 = new Marks();
   student1.java_marks = 99;
   student1.python_marks = 92;
   student1.c_marks = 90;

   Marks student2 = new Marks();
   student2.java_marks = 97;
   student2.python_marks = 91;
   student2.c_marks = 93;

       System.out.println("Marks for Student1");
       System.out.println("Student1_JavaMarks = "+student1.java_marks);
       System.out.println("Student1_PythonMarks = "+student1.python_marks);
       System.out.println("Student1_CMarks = "+student1.c_marks);

       System.out.println("=================================================");

       System.out.println("Marks for Student2");
       System.out.println("Student2_JavaMarks = "+student2.java_marks);
       System.out.println("Student2_PythonMarks = "+student2.python_marks);
       System.out.println("Student2_CMarks = "+student2.c_marks);
   }

}
