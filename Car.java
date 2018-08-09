import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.regex.*;
public class Car{
     String  brand, model ;
     String plateNumber = "00XX00";
     double price;
     int year , km , enginePower , fuelTank;
     boolean rentOrsale;
     String RENTORSALE;// TO convert boolean to string
Car(){
        }// default constructor
Car(String brand , String model , String plateNumber ) {
  this.brand = brand;
  this.model = model;
  this.plateNumber = plateNumber;
}// string type construces
Car (double price , int year , int km , int enginePower , int fuelTank){
    this.price = price;
    this.year = year;
    this.km = km;
    this.enginePower = enginePower;
    this.fuelTank = fuelTank;
}
Car(boolean rentOrsale){
    this.rentOrsale = rentOrsale;
}
 // number type construces
 // =============================// end constructors. 
void setBrand(String brand){
 this.brand = JOptionPane.showInputDialog(null , "Set  Brand"  );
 while(this.brand.matches("[0-9]*") == true){
    this.brand = JOptionPane.showInputDialog(null , "Brand name must be letter Set  Brand name again"  );
    }
 }//end set brandname
void setModel(String model){
    this.model = JOptionPane.showInputDialog( null , " Set model " );
    while(this.model.matches("[0-9]*") == true){
        this.model = JOptionPane.showInputDialog( null , "Model name must be letter please  Set Model name again " );
    }
    }//endsetmodel
void setplateNumber(String plateNumber ){
    this.plateNumber = JOptionPane.showInputDialog( null , " Set Plate Number ");//input platenumber
    while(this.plateNumber.matches("[0-9][0-9][A-Z][A-Z][0-9][0-9][0-9]") == false ){
    this.plateNumber = JOptionPane.showInputDialog( null , " Plate Number must be 00XX000 type Set Plate Number again ");
  } 
}// end setplatenumber
void setPrice(double price){
this.price = Double.parseDouble(JOptionPane.showInputDialog( null , " Set Price " ));
while(this.price <=0 ){
    this.price = Double.parseDouble(JOptionPane.showInputDialog( null , " Set Price again" ));
}
}//end setprice
void setYear(int year){
this.year = Integer.parseInt(JOptionPane.showInputDialog(null , " Set Year" ));
while( this.year > 2015 || this.year <= 1700){
    this.year = Integer.parseInt(JOptionPane.showInputDialog(null , " The year must be 4 numbers and above 1700 and below 2015 Set Year again" ));
}
}     //endsetyear
void setKm(int km){
    this.km = Integer.parseInt(JOptionPane.showInputDialog(null , " Set Km"));
    while(this.km < 0 ){
        this.km = Integer.parseInt(JOptionPane.showInputDialog(null , " please Set Km again "));
    }
}//endsetkm
void setEginePower(int enginePower){
this.enginePower = Integer.parseInt(JOptionPane.showInputDialog(null , " Set Engine Power"));
while(this.enginePower < 0 ){
    this.enginePower = Integer.parseInt(JOptionPane.showInputDialog(null , " Set Engine Power again"));
}
}// end setenginepower
void setFuelTank( int fuelTank ){
    this.fuelTank = Integer.parseInt(JOptionPane.showInputDialog(null , " Set Fuel Tank "));
    while(this.fuelTank < 0){
        this.fuelTank = Integer.parseInt(JOptionPane.showInputDialog(null , " Set Fuel Tank again "));
    } 
}//end setfueltank
void rentOrSale(boolean rentOrsale){
    String rs = JOptionPane.showInputDialog(null , " enter 'R' for Rent , 'S' for Sale");
    
    while(rs.matches("R") == false || rs.matches("S") == false){
        rs = JOptionPane.showInputDialog(null , "Please  enter 'R' for Rent , 'S' for Sale");
    }
    if(rs.matches("R") == true){
        this.rentOrsale = true;
    }
    if(rs.matches("S") == true){
    this.rentOrsale = false;
}
    }//end rentorsalemethod
    //  ============================// end Set Methods.
String getBrand(){
    return this.brand;
    }//edngetbrand
String getModel(){
    return this.model;
}//edngetmodel
String getPlateNumber(){
   
    return this.plateNumber;
}//endgetplate
double getPrice(){
    return this.price;
}//endgetprice
int getYear(){
    return this.year;
}//endgetyear
int getKm(){
    return this.km;
}//endgetkm
int getEnginePower(){
    return this.enginePower;
}//endgetengine
int getFuelTank(){
    return this.fuelTank;
}// end getfuel
String RENTORSALE(){
    if (this.rentOrsale == true){
RENTORSALE = "RENT";
}
if(this.rentOrsale == false){
RENTORSALE = "SALE";
}
return RENTORSALE;
}// convert rentOrsale boolean to String


    //=============================// end Get Methods
    void ShowDialog(){
JOptionPane.showMessageDialog(null, "Car information :  " +"\n Plate Number : " + this.plateNumber + "\n Brand : " + this.brand + "\n Model : " + this.model +
 "\n Price : " + this.price + " TL" + "\n Year " + this.year +"\n Km : " + this.km + "\n Engine Power : " 
 + this.enginePower + " CC " + " \n Fuel Tank : " + this.fuelTank
 + " \n Rent or Sale : " + RENTORSALE);
} // this method shows all about all information about MotorCycle on the Dialog Screen
}