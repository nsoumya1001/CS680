package edu.umb.cs680.hw13.fs;


import java.time.LocalDateTime;

public class Link extends FSElement {

    protected FSElement target;

    public Link (Directory ParentDir, String name, int size, LocalDateTime creationTime, FSElement target) {
        super (ParentDir, name, 0, creationTime);
        this.target = target;

    }

    @Override
    public boolean isDirectory () {
        return false;
    }

    @Override
    public boolean isLink () {
        return true;
    }

    public FSElement getTarget () {
        return this.target;
    }

    @Override
    public boolean isFile () {
        return false;
    }
}
 