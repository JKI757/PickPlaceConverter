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

/**
 *
 * @author josh
 */

/*


output:

Table       ,No.,   ID,PHead,   STNo.,  DeltX,  DeltY,  Angle,  Height, Skip,Speed,Explain,Note,    Delay
EComponent, 48,     1,  1,      51,     127.23, 163.78, 0,      0.8,    6,      0,  1,      C9,     0
...
EComponent,0,43,1,1,105.2,129.44,0,0.5,6,0,43,R1,0


input:
Designator;Footprint;X Coord;Y Coord;Layer;Rotation;Comment
1;1206;-127.24;163.78;B;0;C
...
43;1206;-105.21;129.45;B;0;R1

*/

public class outputComponent {
    String Table;
    int No;
    int ID;
    int PHead;
    int STNo;
    float DeltX;
    float DeltY;
    float Angle;
    float Height;
    int Skip;
    int Speed;
    int Explain;
    String Note;
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public float getDeltX() {
        return DeltX;
    }

    public void setDeltX(float DeltX) {
        this.DeltX = DeltX;
    }

    public float getDeltY() {
        return DeltY;
    }

    public void setDeltY(float DeltY) {
        this.DeltY = DeltY;
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

    public int getSkip() {
        return Skip;
    }

    public void setSkip(int Skip) {
        this.Skip = Skip;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }

    public int getExplain() {
        return Explain;
    }

    public void setExplain(int Explain) {
        this.Explain = Explain;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    public int getDelay() {
        return Delay;
    }

    public void setDelay(int Delay) {
        this.Delay = Delay;
    }
    
    

}
