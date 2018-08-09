
import javax.swing.JOptionPane;
public class MotorCycle{
     String plateNumber ,brand, model ;
     double price;
     int year , km , enginePower , numberOfwheel;
     
MotorCycle(){
        }// default constructor
 MotorCycle(String brand , String model , String plateNumber ) {
  this.brand = brand;
  this.model = model;
  this.plateNumber = plateNumber;
  }  
  MotorCycle(double price , int year , int km , int enginePower , int numberOfwheel){
    this.price = price;
    this.year = year;
    this.km = km;
    this.enginePower = enginePower;
    this.numberOfwheel = numberOfwheel;
   }
 // =============================// end constructors. 
void setBrand(String brand){
 this.brand = JOptionPane.showInputDialog(null , "Set  Brand"  );
 while(this.brand.matches("[0-9]*") == true){
    this.brand = JOptionPane.showInputDialog(null , "Brand name must be letter Set  Brand name again"  );
    }  
 }
void setModel(String model){
    this.model = JOptionPane.showInputDialog( null , " Set model " );
    while(this.model.matches("[0-9]*") == true){
        this.model = JOptionPane.showInputDialog( null , "Model name must be letter please  Set Model name again " );
    }
}// end setmodel
void setplateNumber(String plateNumber){
    this.plateNumber = JOptionPane.showInputDialog( null , " Set Plate Number ");//input platenumber
    while(this.plateNumber.matches("[0-9][0-9][A-Z][A-Z][0-9][0-9][0-9]") == false ){
    this.plateNumber = JOptionPane.showInputDialog( null , " Plate Number must be 00XX000 type Set Plate Number again ");
    }
}//endsetplate
void setPrice(double price){
this.price = Double.parseDouble(JOptionPane.showInputDialog( null , " Set Price " ));
while(this.price <=0 ){
    this.price = Double.parseDouble(JOptionPane.showInputDialog( null , " Set Price again" ));
}
}//endsetprice
void setYear(int year){
this.year = Integer.parseInt(JOptionPane.showInputDialog(null , " Set Year" ));
while( this.year > 2015 || this.year <= 1700){
    this.year = Integer.parseInt(JOptionPane.showInputDialog(null , " The year must be 4 numbers and above 1700 and below 2015 Set Year again" ));
}
}//ednsetyear
void setKm(int km){
this.km = Integer.parseInt(JOptionPane.showInputDialog(null , " Set Km"));
    while(this.km < 0 ){
        this.km = Integer.parseInt(JOptionPane.showInputDialog(null , " please Set Km again "));
    }
}//ednsetkm
void setEginePower(int enginePower){
this.enginePower = Integer.parseInt(JOptionPane.showInputDialog(null , " Set Engine Power"));
while(this.enginePower < 0 ){
    this.enginePower = Integer.parseInt(JOptionPane.showInputDialog(null , " Set Engine Power again"));
}
}//endsetengine
void setNumberOfWheel( int numberOfwheel ){
    this.numberOfwheel = Integer.parseInt(JOptionPane.showInputDialog(null , " Set Number of Wheel"));
    while(this.numberOfwheel < 0 || this.numberOfwheel > 4 ){
         this.numberOfwheel = Integer.parseInt(JOptionPane.showInputDialog(null , " Set Number of Wheel again please "));
    }
} // end setnumberofwheel
//  ============================// end Set Methods.
String getBrand(){
    return this.brand;
    }//endbrand
String getModel(){
    return this.model;
}//endmodel
String getPlateNumber(){
    return this.plateNumber;
}//endplatenumber
double getPrice(){
    return this.price;
}//endprice
int getYear(){
    return this.year;
}//ednyear
int getKm(){
    return this.km;
}//endkm
int getEnginePower(){
    return this.enginePower;
}//endenginepower
int getNumberOfWheel(){
    return this.numberOfwheel;
}//endgetnumberofwheel
    //=============================// end Get Methods
    void ShowDialog(){
JOptionPane.showMessageDialog(null, "MotorCycle information :  " +"\n Plate Number : " + this.plateNumber + "\n Brand : " + this.brand + "\n Model : " + this.model +
 "\n Price : " + this.price + " TL" + "\n Year " + this.year +"\n Km : " + this.km + "\n Engine Power : " 
 + this.enginePower + " CC " + " \n Number of Wheels : " + this.numberOfwheel);
} // this method shows all about all information about MotorCycle on the Dialog Screen
}