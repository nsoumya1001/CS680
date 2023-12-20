package edu.umb.cs680.hw09.fs.util;

import edu.umb.cs680.hw09.fs.Directory;
import edu.umb.cs680.hw09.fs.FSVisitor;
import edu.umb.cs680.hw09.fs.File;
import edu.umb.cs680.hw09.fs.Link;

public class CountingVisitor implements FSVisitor {


    int NoOfFiles,NoOfDirectories,NoOfLinks;
    @Override
    public void visit (Link link) {
        NoOfLinks++;
    }

    @Override
    public void visit (File file) {
        NoOfFiles++;
    }

    @Override
    public void visit (Directory directory) {
        NoOfDirectories++;
    }

    public int getNoOfFiles(){
        return NoOfFiles;
    }

    public int getNoOfDirectories(){
        return NoOfDirectories;
    }

    public int getNoOfLinks () {
        return NoOfLinks;
    }
}
