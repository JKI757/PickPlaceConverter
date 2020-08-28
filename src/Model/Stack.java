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

/**
 *
 * @author josh
 */
public class Stack {
    int stackID;
    float xOffset;
    float yOffset;
    int Feed;
    int Count;
    ArrayList<Component> componentList;
    
    // a stack is simply a configuration item that holds a single reel of a single component
    public Stack(ArrayList<Component> c){
        this.stackID = 0;
        this.componentList = c;
        this.Count = this.componentList.size();
        xOffset = 0.0f;
        yOffset = 0.0f;
        Feed = 0;
    }
    public Stack(){
        this.stackID = 0;
        this.componentList = new ArrayList<Component> ();
        this.Count = 1;
        xOffset = 0.0f;
        yOffset = 0.0f;
        Feed = 0;
    }
    public Stack(Component c){
        this.stackID = 0;
        this.componentList = new ArrayList<Component> ();
        this.componentList.add(c);
        this.Count = 1;
        xOffset = 0.0f;
        yOffset = 0.0f;
        Feed = 0;

    }

    public ArrayList<Component> getComponentList() {
        return componentList;
    }

    public int getStackID() {
        return stackID;
    }

    public void setStackID(int stackID) {
        this.stackID = stackID;
    }

    public float getxOffset() {
        return xOffset;
    }

    public void setxOffset(float xOffset) {
        this.xOffset = xOffset;
    }

    public float getyOffset() {
        return yOffset;
    }

    public void setyOffset(float yOffset) {
        this.yOffset = yOffset;
    }

    public int getFeed() {
        return this.Feed;
    }

    public void setFeed(int Feed) {
        this.Feed = Feed ;
    }

    public String getComponentID() {
        return this.componentList.get(0).getComponentID();
    }

    public void setComment(String Comment) {
        for (Component c : componentList){
            c.setComponentID(Comment);
        }
    }
    
    public float getAngle() {
        return this.componentList.get(0).getAngle();
    }

    public void setAngle(float Angle) {
        for (Component c : componentList){
            c.setAngle(Angle);
        }
    }


    public int getHead() {
        return this.componentList.get(0).getPHead();
    }

    public void setHead(int Head) {
        for (Component c : componentList){
            c.setPHead(Head);
        }
    }

    public float getHeight() {
        return this.componentList.get(0).getHeight();
    }

    public void setHeight(float Height) {
        for (Component c : componentList){
            c.setHeight(Height);
        }
    }

    public int getSpeed() {
        return this.componentList.get(0).getSpeed();
    }

    public void setSpeed(int Speed) {
        for (Component c : componentList){
            c.setSpeed(Speed);
        }
    }

    public boolean isCheckVacuum() {
        return this.componentList.get(0).isCheckVacuum();
    }

    public void setCheckVacuum(boolean checkVacuum) {
        for (Component c : componentList){
            c.setCheckVacuum(checkVacuum);
        }
    }

    public boolean isCheckVisual() {
        return this.componentList.get(0).isCheckVisual();
    }

    public void setCheckVisual(boolean Visual) {
        for (Component c : componentList){
            c.setCheckVisual(Visual);
        }
    }

    public int getCount() {
        return this.componentList.size();
    }

    public void setCount(int Count) {
        this.Count = Count;
    }
    public void incrementCount(){this.Count++;}
    
    public void addComponent(Component c){
        this.componentList.add(c);
    }
}
