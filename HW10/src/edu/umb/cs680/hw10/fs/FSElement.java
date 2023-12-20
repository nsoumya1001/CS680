package edu.umb.cs680.hw10.fs;

import java.time.LocalDateTime;

public abstract class FSElement {
    private String name ;
    protected Directory Parent;
    private int size;
    private LocalDateTime creationTime;

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

    public LocalDateTime getCreationTime(){
        return this.creationTime;
    }
    protected abstract boolean isDirectory();

    protected abstract boolean isFile();

    protected abstract boolean isLink();

    void accept(FSVisitor v){}
}
