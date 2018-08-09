// Ceng 305 object oriented Java
// homework 1
// Nijat Shukurov 1784222
//
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner yaz = new Scanner(System.in);
    Car setcar = new Car();
    System.out.println("==================================");
    System.out.println("Please enter 1 to input  Car information or 2 to input MotorCycle information");
    System.out.println("Press 0 to end the program");
    System.out.println("==================================");
    int n;
    n = yaz.nextInt();
   while ( n!=0 ){
   
        if ( n == 1){
    Car setCar = new Car();
       setCar.setplateNumber("00XX000");
       setCar.setBrand("Mercedes");
       setCar.setModel("Benz");
       setCar.setPrice(00.0);
       setCar.setYear(2010);
       setCar.setKm(20000);
       setCar.setFuelTank(2);
       setCar.rentOrSale(true);
       // end set
       setCar.getPlateNumber();
       setCar.getBrand();
       setCar.getModel();
       setCar.getPrice();
       setCar.getYear();
       setCar.getKm();
       setCar.getFuelTank();
       setCar.RENTORSALE();
       // end get
       setCar.ShowDialog(); // show on dialog  
       
    System.out.println("==================================");
    System.out.println("Please enter 1 for Car or 2 for MotorCycle");
    System.out.println("Press 0 to end the program");
    System.out.println("==================================");
    n = yaz.nextInt();
    
}
  else if (n == 2 ){ 
       MotorCycle setMotor = new MotorCycle();
       setMotor.setplateNumber("00XX000");
       setMotor.setBrand("HarleyDavidson");
       setMotor.setModel("Iron");
       setMotor.setPrice(00.0);
       setMotor.setYear(2010);
       setMotor.setKm(20000);
       setMotor.setNumberOfWheel(2); 
       // end set
       setMotor.getPlateNumber();
       setMotor.getBrand();
       setMotor.getModel();
       setMotor.getPrice();
       setMotor.getYear();
       setMotor.getKm();
       setMotor.getNumberOfWheel();
       // end get
       setMotor.ShowDialog(); // show on dialog
       
    System.out.println("==================================");
    System.out.println("Please enter 1 for Car or 2 for MotorCycle");
    System.out.println("Press 0 to end the program");
    System.out.println("==================================");
    n = yaz.nextInt();
}
    
    else {
        
       System.out.println("==================================");
    System.out.println("Please enter 1 for Car or 2 for MotorCycle");
    System.out.println("Press 0 to end the program");
    System.out.println("==================================");
    n = yaz.nextInt();
}
    }
    }
}
