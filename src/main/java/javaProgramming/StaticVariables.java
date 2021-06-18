package javaProgramming;

class Emp{
    public static double salary;
    public static String emp_Name = "Rajesh";
}
public class StaticVariables {

  public static void main(String[] args){
      Emp emp = new Emp();
      emp.salary = 50000; // Compiler will automatically replace object name to class name
      System.out.println(Emp.emp_Name+" Salary is "+emp.salary); // Emp.emp_Name directly accesses by class name

      Emp emp2 = new Emp();
      System.out.println("Employee 2 Salary is "+emp2.salary);
  }

}
