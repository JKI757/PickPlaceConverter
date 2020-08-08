/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Component;
import java.io.File;
import java.io.FileNotFoundException;  
import java.util.Scanner; 
import java.util.ArrayList;

/**
 *
 * @author josh
 */
public class readInputFile {
    
    File inFile;
    ArrayList<Component> componentList = new ArrayList<Component>();
    String[] columnNames;
    public readInputFile(File f){
        inFile = f;
        try{
            Scanner reader = new Scanner (inFile);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                if ((line.charAt(0) != '*') && (line.charAt(0) != '"')){
                    componentList.add(new Component(line,";"));
                }
            }
        }catch (FileNotFoundException e){
            ;
        }
    }
    
    public ArrayList<Component> getComponentList(){
        return componentList;
    }
    public String[] getColumnNames(){
        return columnNames;
    }
}
