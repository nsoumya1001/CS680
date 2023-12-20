package edu.umb.cs680.hw10.fs.util;

import edu.umb.cs680.hw10.fs.Directory;
import edu.umb.cs680.hw10.fs.File;
import edu.umb.cs680.hw10.fs.FSVisitor;
import edu.umb.cs680.hw10.fs.Link;

import java.util.LinkedList;

public class FileSearchVisitor implements FSVisitor {

    String fileName;
    LinkedList<File> foundFiles= new LinkedList<File> ();

    public FileSearchVisitor(String fileName){
        this.fileName=fileName;
    }


    public LinkedList<File> getFoundFiles(){
        return foundFiles;
    }

    @Override
    public void visit (Link link) {
        return;
    }

    @Override
    public void visit (File file) {

        if(file.getName().equals(fileName)){
            foundFiles.add(file); }

    }

    @Override
    public void visit (Directory directory) {
        return;
    }
}
