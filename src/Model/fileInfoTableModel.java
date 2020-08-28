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
package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author josh
 */
public class fileInfoTableModel extends AbstractTableModel{
    
    
    private String[] columnNames = {"No","Package","Pos-X","Pos-Y","Layer","Rot","Comment"};
    private ArrayList<Component> data;
    
    public fileInfoTableModel(ArrayList<Component> data){
        this.data = data;
    }
    public fileInfoTableModel(){
        this.data = new ArrayList<Component> ();
    }
    public void setColumnNames(String[] cn){ columnNames = cn;}
    
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return data.size();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        if (row > data.size() || col > columnNames.length){
            return null;
        }
        Component Row = data.get(row);
        
        switch(col){
            case 0: {
                return Row.getDesignator();
            }
            case 1:{
                return Row.getFootprint();
            }
            case 2:{
                return Row.getXCoord();
            }
            case 3:{
                return Row.getYCoord();
            }
            case 4:{
                return Row.getLayer();
            }
            case 5:{
                return Row.getRotation();
            }
            case 6:{
                return Row.getComponentID();
            }
            default: return null;
        }
    }
    public Class getColumnClass(int c){
        return getValueAt(0,c).getClass();
    }
    
    public void setValueAt(Object value, int row, int col){
        
        Component Row = data.get(row);
               switch(col){
                case 0: {
                    Row.setDesignator((Integer)value);
                };break;
                case 1:{
                    Row.setFootprint((String)value);
                };break;
                case 2:{
                    Row.setXCoord((Float)value);
                };break;
                case 3:{
                    Row.setYCoord((Float)value);
                };break;
                case 4:{
                    Row.setLayer((char)value);
                };break;
                case 5:{
                    Row.setRotation((Float)value);
                };break;
                case 6:{
                    Row.setComponentID((String)value);
                };break;
            }
        data.set(row, Row);
        fireTableCellUpdated(row,col);
    }

    /*
         * JTable uses this method to determine the default renderer/
         * editor for each cell.  If we didn't implement this method,
         * then the last column would contain text ("true"/"false"),
         * rather than a check box.
     */
//    public Class getColumnClass(int c) {
//        return getValueAt(0, c).getClass();
//    }

    /*
         * Don't need to implement this method unless your table's
         * editable.
     */
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col < 0) {
            return false;
        } else {
            return true;
        }
    }


}
