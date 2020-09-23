package NewTask;

public class EncapsTest extends EncapsulationDemo{
	
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsTest();
       
         obj.setEmpName("Sandeep");
         obj.setEmpAge(30);
         obj.setEmpSSN(3);
         System.out.println("Employee Name: " + obj.getEmpName());
         System.out.println("Employee SSN: " + obj.getEmpSSN());
         System.out.println("Employee Age: " + obj.getEmpAge());
    } 
}
