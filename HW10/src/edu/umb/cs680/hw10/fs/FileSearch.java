package edu.umb.cs680.hw10.fs;

import edu.umb.cs680.hw10.fs.util.FileSearchVisitor;

import java.util.LinkedList;

public class FileSearch implements FSCommand{
    private Directory directory;
    private FileSearchVisitor visitor;

    public FileSearch(Directory directory, String fileName) {
        this.directory = directory;
        this.visitor = new FileSearchVisitor(fileName);
    }

    @Override
    public void execute() {
        directory.accept(visitor); // Apply the visitor to the directory
    }

    public LinkedList<File> getFoundFiles() {
        return visitor.getFoundFiles();
    }
}
