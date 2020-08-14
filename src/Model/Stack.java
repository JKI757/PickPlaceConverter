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

import Model.Component.Skip;
import java.util.ArrayList;

/**
 *
 * @author josh
 */
public class Stack {
    int No;
    float xOffset;
    float yOffset;
    float Feed;
    String Comment;
    int Head;
    float Height;
    int Speed;
    String Status;
    String Visual;
    int Count;
    
    ArrayList<Component> componentList;
    
    public Stack(ArrayList<Component> cl){
        this.componentList = cl;
        this.Count = this.componentList.size();
        No=0;
        xOffset = 0.0f;
        yOffset = 0.0f;
        Feed = componentList.get(0).getSpeed();//this might be wrong, check it
        Comment = "";
        Head = componentList.get(0).getPHead();
        Height = componentList.get(0).getHeight();
        Speed = componentList.get(0).getSpeed();
        switch (componentList.get(0).getSkip()){
            case None:{ Status = "None";}
            case Skip:{ Status = "Skip";}
            case CheckVacuum:{ Status = "Check Vacuum";}
        }
        switch (componentList.get(0).getVisual()){
            case Open:{Visual = "Open";}
            case Close:{Visual = "Close";}  
        }

        
    }
    public ArrayList<Component> getComponentList() {
        return componentList;
    }

    public void setComponentList(ArrayList<Component> componentList) {
        this.componentList = componentList;
        this.Count = this.componentList.size();
        No=0;
        xOffset = 0.0f;
        yOffset = 0.0f;
        Feed = componentList.get(0).getSpeed();//this might be wrong, check it
        Comment = "";
        Head = componentList.get(0).getPHead();
        Height = componentList.get(0).getHeight();
        Speed = componentList.get(0).getSpeed();
        switch (componentList.get(0).getSkip()){
            case None:{ Status = "None";}
            case Skip:{ Status = "Skip";}
            case CheckVacuum:{ Status = "Check Vacuum";}
        }
        switch (componentList.get(0).getVisual()){
            case Open:{Visual = "Open";}
            case Close:{Visual = "Close";}  
        }

    }
    
    public int getNo() {
        return No;
    }

    public void setNo(int No) {
        this.No = No;
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

    public float getFeed() {
        return Feed;
    }

    public void setFeed(float Feed) {
        this.Feed = Feed;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public int getHead() {
        return Head;
    }

    public void setHead(int Head) {
        this.Head = Head;
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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getVisual() {
        return Visual;
    }

    public void setVisual(String Visual) {
        this.Visual = Visual;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }
    
    
}
