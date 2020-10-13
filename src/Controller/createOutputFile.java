/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Component;
import Model.Stack;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author josh
 */
public class createOutputFile {
    controllerVariables cv;
    
    public createOutputFile(controllerVariables c){
        cv = c;
        
    }
    public void generateCSV(File f){
        FileWriter fw = null;
        try {
            fw = new FileWriter(f);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        
        
        
        StringBuilder builder = new StringBuilder();
        String columnNamesList = "Table,No.,ID,DeltX,DeltY,FeedRates,Note,Height,Speed,Status,SizeX,SizeY,HeightTake,DelayTake";

        builder.append(columnNamesList +"\n");
         try{
            fw.write(builder.toString());
//            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
       
        for (Stack s : cv.getStackList()){
            StringBuilder stackBuilder = new StringBuilder();
            stackBuilder.append("Station,");
            stackBuilder.append(s.getStackID()+",");
            stackBuilder.append(s.getxOffset()+",");
            stackBuilder.append(s.getyOffset()+",");
            stackBuilder.append(s.getFeed()+",");
            stackBuilder.append(s.getComponentID()+",");
            stackBuilder.append(s.getHeight()+",");
            stackBuilder.append(s.getSpeed()+",");
            stackBuilder.append((s.getComponentList().get(0).isCheckVacuum())? 1 : 0);
            stackBuilder.append(",");
            stackBuilder.append("0,0,0,0\n");
            try{
                fw.write(stackBuilder.toString());
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
            
       }
        StringBuilder bpBuilder = new StringBuilder();
        bpBuilder.append("\nTable,No.,ID,DeltX,DeltY\n");
        bpBuilder.append("Panel_Coord,0,1,0,0\n\n");
         try{
            fw.write(bpBuilder.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        builder = new StringBuilder();
        columnNamesList = "Table,No.,ID,PHead,STNo.,DeltX,DeltY,Angle,Height,Skip,Speed,Explain,Note,Delay";

        builder.append(columnNamesList +"\n");
         try{
            fw.write(builder.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
         
        int i = 0;
        for (Component c : cv.getICL()){
            StringBuilder ComponentBuilder = new StringBuilder();
            ComponentBuilder.append("EComponent,");
            ComponentBuilder.append(i++);
            ComponentBuilder.append(",");
            ComponentBuilder.append(c.getNo());
            ComponentBuilder.append(",");
            ComponentBuilder.append(c.getPHead());
            ComponentBuilder.append(",");
            ComponentBuilder.append(c.getSTNo());
            ComponentBuilder.append(",");
            ComponentBuilder.append(c.getXCoord());
            ComponentBuilder.append(",");
            ComponentBuilder.append(c.getYCoord());
            ComponentBuilder.append(",");
            ComponentBuilder.append(c.getAngle());
            ComponentBuilder.append(",");
            ComponentBuilder.append(c.getHeight());
            ComponentBuilder.append(",");
            ComponentBuilder.append(c.isCheckVacuum() ? 1 : 0);
            ComponentBuilder.append(",");
            ComponentBuilder.append(c.getSpeed());
            ComponentBuilder.append(",");
            ComponentBuilder.append(c.getNo());
            ComponentBuilder.append(",");
            ComponentBuilder.append(c.getComponentID());
            ComponentBuilder.append(",");
            ComponentBuilder.append(c.getDelay());
            ComponentBuilder.append("\n");
            try{
               fw.write(ComponentBuilder.toString());
           } catch (Exception e) {
               e.printStackTrace();
               return;
           }   
        }
        
        StringBuilder bpBuilder2 = new StringBuilder();
        bpBuilder2.append("\nTable,No.,ID,CenterX,CenterY,IntervalX,IntervalY,NumX,NumY,Start\n");
        bpBuilder2.append("Table,No.,nType,nAlg,nFinished\n");
        bpBuilder2.append("PcbCalib,0,0,0,0\n");
        bpBuilder2.append("Table,No.,ID,offsetX,offsetY,Note\n");
        bpBuilder2.append("CalibPoint,0,0,0,0,CalibPoint,1,0,0,0\n");
        bpBuilder2.append("Table,No.,DeltX,DeltY,AlphaX,AlphaY,BetaX,BetaY,DeltaAngle\n");
        bpBuilder2.append("CalibFator,0,0,0,0,0,1,1,0\n");
         try{
            fw.write(bpBuilder2.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
        
        try{
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}
