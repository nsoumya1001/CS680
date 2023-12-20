package edu.umb.cs680.hw07;

import java.time.LocalDateTime;

public abstract class FSElement {
    protected String name ;
    protected Directory Parent;
    protected int size;
    protected LocalDateTime creationTime;

    public FSElement(Directory Parent, String name , int size, LocalDateTime creationTime){
        this.Parent = Parent;
        this.name= name ;
        this.size= size;
        this.creationTime=creationTime;
    }

    public void setParent(Directory Parent) {
        this.Parent = Parent;
    }

    public Directory getParent(){
        return this.Parent;

    }
    public int getSize(){
        return this.size;
    }

    public String getName(){
        return this.name;
    }
    public abstract boolean isDirectory();

    protected abstract boolean isFile();
}
