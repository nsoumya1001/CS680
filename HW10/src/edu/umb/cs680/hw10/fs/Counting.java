package edu.umb.cs680.hw10.fs;

import edu.umb.cs680.hw10.fs.util.CountingVisitor;

public class Counting implements FSCommand{
    private Directory directory;
    private CountingVisitor visitor;

    public Counting(Directory directory) {
        this.directory = directory;
        this.visitor = new CountingVisitor ();
    }

    @Override
    public void execute() {
        directory.accept(visitor); // Apply the visitor to the directory
    }

    public int getNoOfFiles(){
        return visitor.getNoOfFiles ();
    }

    public int getNoOfDirectories(){
        return visitor.getNoOfDirectories ();
    }

    public int getNoOfLinks () {
        return visitor.getNoOfLinks ();
    }

}
