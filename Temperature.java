
// Author(s): Daniel Lubin 
// Date of Last Modification: 10/10/2022
// Course: CS111B 
// Instructor: C. Conner 
// Assignment #4
// File Name: CS111Boxes.java
// This program will display 10 boxes alternating white and black with 1 random red box

public class Temperature implements TemperatureInterface
{

    private double degree;
    private char scale;
    
    //constructors
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

    public void writeOutput() {
    System.out.println("Temperature: "+degree+" "+scale);
    }

    public void writeC(){
    System.out.print("Temperature : "+fahrenheightToCelcius()+ " C");
    }

    public void writeF(){
    System.out.print("Temperature : "+celciusToFarenheight()+ " F");
    }

    public double getC(){
        return fahrenheightToCelcius();
    }
    public double getF(){
        return celciusToFarenheight();
    }

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



    public boolean equals(Temperature obj){
    if(fahrenheightToCelcius() == obj.fahrenheightToCelcius())
    return true;
    return false;
    }
}