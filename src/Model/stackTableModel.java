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
public class stackTableModel extends AbstractTableModel{
    
    
    private String[] columnNames = {"Stack","X-Offset","Y-Offset","Feed","Component ID", "Angle", "Head","Height","Speed", "Vacuum Check", "Visual Check", "Count" };
    private ArrayList<Stack> data;
    
    public stackTableModel(ArrayList<Stack> data){
        this.data = data;
    }
    public stackTableModel(){
        this.data = new ArrayList<Stack> ();
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
        Stack Row = data.get(row);
        
        switch(col){
            case 0: {
                return Row.getStackID();
            }
            case 1:{
                return Row.getxOffset();
            }
            case 2:{
                return Row.getyOffset();
            }
            case 3:{
                return Row.getFeed();
            }
            case 4:{
                return Row.getComponentID();
            }
            case 5:{
                return Row.getAngle();
            }
            case 6:{
                return Row.getHead();
            }
            case 7:{
                return Row.getHeight();
            }
            case 8:{
                return Row.getSpeed();
            }
            case 9:{
                return Row.isCheckVacuum();
            }
            case 10:{
                return Row.isCheckVisual();
            }
            case 11:{
                return Row.getCount();
            }
            default: return null;
        }
    }
    public Class getColumnClass(int c){
        return getValueAt(0,c).getClass();
    }
    
    public void setValueAt(Object value, int row, int col){
        
        Stack Row = data.get(row);
               switch(col){
                case 0: {
                    Row.setStackID((Integer)value);
                };break;
                case 1:{
                    Row.setxOffset((Float)value);
                };break;
                case 2:{
                    Row.setyOffset((Float)value);
                };break;
                case 3:{
                    Row.setFeed((Integer)value);
                };break;
                case 4:{
                    Row.setComment((String)value);
                };break;
                case 5:{
                    Row.setAngle((Float)value);
                };break;
                
                case 6:{
                    Row.setHead((Integer)value);
                };break;
                case 7:{
                    Row.setHeight((Float)value);
                };break;
                case 8:{
                    Row.setSpeed((Integer)value);
                };break;
                case 9:{
                    Row.setCheckVacuum((boolean)value);
                };break;
                case 10:{
                    Row.setCheckVisual((boolean)value);
                };break;
                case 11:{
                    Row.setCount((Integer)value);
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
        if (col != 0 && col != 4 && col != 11) {
            return true;
        } else {
            return false;
        }
    }


}
