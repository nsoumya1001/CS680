package edu.umb.cs680.hw07;

import java.time.LocalDateTime;

public class File extends FSElement {

    public File (Directory Parent, String name, int size, LocalDateTime creationTime) {
        super (Parent, name, size, creationTime);
    }

    public String getName () {
        return this.name;
    }

    public boolean isFile () {
        return true;
    }


    @Override
    public boolean isDirectory () {
        return false;
    }
}