/*
 * Copyright (c) 2020, josh
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package Controller;

import static Controller.controllerVariables.Layer.*;
import Model.fileInfoTableModel;
import Model.Component;
import Model.Stack;
import Model.outputComponent;
import Model.componentListTableModel;
import Model.stackTableModel;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author josh
 */
public class controllerVariables {
    
    ArrayList<Component> icl;
    ArrayList<outputComponent> ocl;
    File inputFile;
    File outputFile;
    readInputFile rf;
    String[] fileInfoTableHeaders;
    fileInfoTableModel fitm;
    componentListTableModel ctm;
    stackTableModel stm;
    ArrayList<Stack> stackList;

    public ArrayList<Stack> getStackList() {
        return stackList;
    }

    public void setStackList(ArrayList<Stack> stackList) {
        this.stackList = stackList;
    }
    
    
    String currentDirectory = System.getProperty("user.dir");
    public enum Layer{Top, Bottom};
    Layer layer=Top;
    boolean useBothHeads=false;

    public boolean isUseBothHeads() {
        return useBothHeads;
    }

    public void setUseBothHeads(boolean useBothHeads) {
        this.useBothHeads = useBothHeads;
    }
    
    public void setInputFile(File f){inputFile = f;}
    public void setOutputFile(File f){outputFile = f;}
    public void setICL(ArrayList<Component> i){icl = i;}
    public void setOCL(ArrayList<outputComponent> o){ocl = o;}
    public void setRF(readInputFile r){rf = r;}
    public void setfileInfoTabHeaders(String[] s){fileInfoTableHeaders = s;}
    public void setFileInfoTableModel(fileInfoTableModel fitm){this.fitm = fitm;}
    public void setCurrentDirectory(String s){currentDirectory = s;}
    public void setComponentListTableModel(componentListTableModel ctm){this.ctm = ctm;}
    public void setStackTableModel(stackTableModel stm) { this.stm = stm;}
    public void setLayer(Layer l){layer=l;}
    
    public File getInputFile(){return inputFile;}
    public File getOutputFile(){return outputFile;}
    public ArrayList<Component>  getICL(){return icl;}
    public ArrayList<outputComponent> getOCL(){return ocl;}
    public readInputFile getRF(){return rf;}
    public String[] getfileInfoTabHeaders(){return fileInfoTableHeaders;}
    public fileInfoTableModel getFileInfoTableModel(){
        if (fitm != null){
            return fitm;
        }else{
            return (new fileInfoTableModel());
        }
    }
    public componentListTableModel getComponentListTableModel(){
        if (ctm != null){
            return ctm;
        }else{
            return (new componentListTableModel());
        }
    }

    public stackTableModel getStackTableModel() {
        if (stm != null) {
            return stm;
        } else {
            return (new stackTableModel());
        }
    }

    public String getCurrentDirectory() {
        return currentDirectory;
    }
    public Layer getLayer(){return layer;}
}
