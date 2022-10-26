import java.time.Year;

// Author(s): Daniel Lubin 
// Date of Last Modification: 10/25/2022
// Course: CS111B 
// Instructor: C. Conner 
// Assignment #5
// File Name: Temperature.java
// This program represents temperatures in either farenheight or celcius.

public class Temperature implements TemperatureInterface
{

    private double degree;
    private char scale;
    
    /*Constructor Methods. */
    public Temperature(){
    degree = 0;
    scale = 'C';
    }
    public Temperature(double degree){
    this.degree = degree;
    scale = 'C';
    }
    public Temperature(char scale){
    degree = 0;
    this.scale = scale;
    }
    public Temperature(double degree, char scale){
    this.degree = degree;
    this.scale = scale;
    }

    /*Write outputs */
    public void writeOutput() {
    System.out.println("Temperature: "+degree+" "+scale);
    }
    public void writeC(){
    System.out.print("Temperature : "+fahrenheightToCelcius()+ " C");
    }
    public void writeF(){
    System.out.print("Temperature : "+celciusToFarenheight()+ " F");
    }
    public String toString(){
        return String.format("Temperature: " + degree + " degrees " + scale);
    }


    /*Methods for getting temps */
    public double getC(){
        return fahrenheightToCelcius();
    }
    public double getF(){
        return celciusToFarenheight();
    }

    /* Calculations for converting between scales */
    public double fahrenheightToCelcius() {
    if(scale == 'C' || scale == 'c')
    return ((double)(Math.round(degree*10)))/10;
    else
    return ((double)Math.round((((degree-32)*5)/9)*10))/10;   
    }
    public double celciusToFarenheight() {
    if(scale == 'F' || scale == 'f')
    return ((double)Math.round(degree*10))/10;
    else
    return ((double)Math.round((1.8*degree + 32)*10))/10;
    }


     /* Set commands for setting the degree and scale sperately as well as all at once.*/
    public void set(double degree){
    this.degree = degree;
    }
    public void set(char scale){
    this.scale = scale;
    }
    public void set(double degree, char scale){
    this.degree = degree;
    this.scale = scale;
    }

    /*Equals comparison method */
    public boolean equals(Temperature obj){
    if(fahrenheightToCelcius() == obj.fahrenheightToCelcius())
    return true;
    return false;
    }
}