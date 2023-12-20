package edu.umb.cs680.hw10.fs;

import edu.umb.cs680.hw10.fs.util.FileCrawlingVisitor;

import java.util.LinkedList;

public class FileCrawling implements FSCommand {
    private Directory directory;
    private FileCrawlingVisitor visitor;

    public FileCrawling (Directory directory) {
        this.directory = directory;
        this.visitor = new FileCrawlingVisitor ();
    }

    @Override
    public void execute () {
        directory.accept (visitor);

    }

    public LinkedList<File> getFiles() {
        return visitor.getFilesFromCrawling();
    }
}
