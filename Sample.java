public class Employee{
  public void empName(){
    System.out.println("employee name:Aadhil");
  }
  public void empId(){
    System.out.println("Employee Id : 110");
  }
  public void empAddress(){
    System.out.println("Employee Address : Dhaka");
  }
  public static void main(String[] args){
    Employee e = new Employee();
    e.empName();
    e.empId();
    e.empAddress();
  }
}
