package edu.umb.cs680.hw10.fs;

import java.time.LocalDateTime;

public class File extends FSElement {

    public File (Directory Parent, String name, int size, LocalDateTime creationTime) {
        super (Parent, name, size, creationTime);
    }

    public String getName () {
        return super.getName();
    }

    public boolean isFile () {
        return true;
    }

    @Override
    protected boolean isLink() {
        return false;
    }


    @Override
    public boolean isDirectory () {
        return false;
    }

    @Override
    public void accept (FSVisitor v) {
        v.visit (this);
    }
}