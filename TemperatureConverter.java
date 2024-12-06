import java.util.*;

public class TemperatureConverter {
    // Convert Fahrenheit to Celcius
    public static double celciusToFahrenheit(double tempValue) {
        return (tempValue * 9/5) + 32;
    }
    
    // Convert Celcius to Fahrenheit
    public static double fahrenheitToCelcius(double tempValue) {
        return (tempValue - 32) * 5/9;
    }
    
    // Main converter(implementation)
    public static void convert(){
        //Create scale and value input
        Scanner scaleInput = new Scanner(System.in);
        Scanner valueInput = new Scanner(System.in);
        
        //Sore the scale and input value
        String tempScale;
        double tempValue;
        
        //Prompt user on the type of conversion
        System.out.println("Press C to activate Celcius to Fahrenheit converter\n OR \nPress F to activate Fahrenheit to Celcius converter");
        tempScale = scaleInput.nextLine();
        
        if(tempScale.equalsIgnoreCase("C")) {
            // When C key is pressed as scale input
           System.out.println("Convert Celsius to Fahrenheit...");
           System.out.println("Enter temperture value" + " (" + "-273.15" + "\u00B0" + "C" + " - " + "100.0" + "\u00B0" + "C" + ")");
           tempValue = valueInput.nextDouble();
           
           //Check whether the temperature value is in the range -273.15 - 100
           if(tempValue < -273.15 || tempValue > 100){
               System.out.println("Warning: Enter temperature range from -273.15" + "\u00B0" + "C" + " - " + "100.0" + "\u00B0" + "C");
           }  else {
                    System.out.println("The temperature from Celcius to Fahrenheit is " + celciusToFahrenheit(tempValue) + "\u00B0" + "F");
           }
        } 
        else if(tempScale.equalsIgnoreCase("F")) {
            // When F key is pressed as scale input
            System.out.println("Convert Fahrenheit to Celsius...");
            System.out.println("Enter temperture value" + " (" + "-459.67" + "\u00B0" + "F" + " - " + "212,0" + "\u00B0" + "F" + ")");
            tempValue = valueInput.nextDouble();
            
            //Check whether the temperature value is in the range -459.67 - 212
            if(tempValue < -459.67 | tempValue > 212){
                System.out.println("Warning: Enter temperature range from -459.67" + "\u00B0" + "F" + " - " + "212.0" + "\u00B0" + "F");
            } else {
                System.out.println("The temperature from Fahrenheit to Celcius is " + fahrenheitToCelcius(tempValue) + "\u00B0" + "C");
            }
        } 
        else {
            //When neither D nor F is entered as scale input
            System.out.println("Invalid scale");
        }
    }
//    
    public static void main(String[] args) {
        convert();
    }
}
