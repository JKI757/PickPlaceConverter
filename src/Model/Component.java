/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.controllerVariables;
import java.util.ArrayList;

/**
 *
 * @author josh
 */
/*


output:

Table,No.,ID,PHead,STNo.,DeltX,DeltY,Angle,Height,Skip,Speed,Explain,Note,Delay
EComponent,48,1,1,51,127.23,163.78,0,0.8,6,0,1,C9,0
...
EComponent,0,43,1,1,105.2,129.44,0,0.5,6,0,43,R1,0


input:
Designator;Footprint;X Coord;Y Coord;Layer;Rotation;Comment
1;1206;-127.24;163.78;B;0;C
...
43;1206;-105.21;129.45;B;0;R1

*/
public class Component{
    
    int Designator;
    String Footprint;
    float XCoord;
    float YCoord;
    char Layer;
    String ComponentID;
    
    String Table;
    int No;
    int PHead;
    int STNo;
    //ID == Deisgnator
    //XCoord
    //YCoord
    float Angle;
    float Height;
    int Speed;
    boolean checkVacuum;
    boolean checkVisual;

    public boolean isCheckVacuum() {
        return checkVacuum;
    }

    public void setCheckVacuum(boolean checkVacuum) {
        this.checkVacuum = checkVacuum;
    }

    public boolean isCheckVisual() {
        return checkVisual;
    }

    public void setCheckVisual(boolean checkVisual) {
        this.checkVisual = checkVisual;
    }
    
    int Delay;

    public String getTable() {
        return Table;
    }

    public void setTable(String Table) {
        this.Table = Table;
    }

    public int getNo() {
        return No;
    }

    public void setNo(int No) {
        this.No = No;
    }

    public int getPHead() {
        return PHead;
    }

    public void setPHead(int PHead) {
        this.PHead = PHead;
    }

    public int getSTNo() {
        return STNo;
    }

    public void setSTNo(int STNo) {
        this.STNo = STNo;
    }

    public float getAngle() {
        return Angle;
    }

    public void setAngle(float Angle) {
        this.Angle = Angle;
    }

    public float getHeight() {
        return Height;
    }

    public void setHeight(float Height) {
        this.Height = Height;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }

    public int getDelay() {
        return Delay;
    }

    public void setDelay(int Delay) {
        this.Delay = Delay;
    }
    
    
    
    
    public int getDesignator(){return Designator;}
    public String getFootprint(){return Footprint;}
    public float getXCoord(){return XCoord;}
    public float getYCoord(){return YCoord;}
    public char getLayer(){return Layer;}
    public float getRotation(){return Angle;}
    public String getComponentID(){return ComponentID;}
    
    public void     setDesignator(int d){ Designator = d;}
    public void     setFootprint(String f){Footprint = f;}
    public void     setXCoord(float x){ XCoord = x ;}
    public void     setYCoord(float y){ YCoord = y;}
    public void     setLayer(char l){ Layer = l;}
    public void     setRotation(float r){ Angle = r;}
    public void     setComponentID(String c){ComponentID = c ;}
    
    public Component (String s, String delimiter){
//this is deisigned to take a component string from the csv file and create a component
        
        String[] strArr = s.split(delimiter, 0);
        
        if (strArr.length != 7){
           ; //error
        }
        try{
        Designator = Integer.parseInt(strArr[0]);
        Footprint = strArr[1];
        XCoord = Float.parseFloat(strArr[2]);
        YCoord = Float.parseFloat(strArr[3]);
        Layer = strArr[4].charAt(0);
        Angle = controllerVariables.sanitizeAngle(Float.parseFloat(strArr[5]));
        ComponentID = strArr[6];
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
    
    public Component (){
//this is deisigned to take a component string from the csv file and create a component
        
        
        try{
        Designator = 0;
        Footprint = "";
        XCoord = 0.0f;
        YCoord = 0.0f;
        Layer = ' ';
        Angle = 0.0f;
        ComponentID = "";
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }

}
