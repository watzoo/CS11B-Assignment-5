
// Author(s): Daniel Lubin 
// Date of Last Modification: 10/10/2022
// Course: CS111B 
// Instructor: C. Conner 
// Assignment #4
// File Name: CS111Boxes.java
// This program will display 10 boxes alternating white and black with 1 random red box

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Temperature {

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


    public double fahrenheightToCelcius() {
    if(scale == 'C' || scale == 'c')
    return ((double)(Math.round(degree*10)))/10;
    else
    return ((double)Math.round((((degree-32)*5)/9)*10))/10;   

    }

    public 

    public double celciusToFarenheight() {
    if(scale == 'F' || scale == 'f')
    return ((double)Math.round(degree*10))/10;
    else
    return ((double)Math.round((1.8*degree + 32)*10))/10;


    }
    public void setDegree(double degree){
    this.degree = degree;
    }
    
    public void setScale(char scale){
    this.scale = scale;
    }
    
    public void setTemperature(double degree, char scale){
    this.degree = degree;
    this.scale = scale;
    }



    public boolean equals(Temperature obj){
    if(getDegreeInCelsius() == obj.getDegreeInCelsius())
    return true;
    return false;
    }
}