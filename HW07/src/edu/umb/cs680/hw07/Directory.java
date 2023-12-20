package edu.umb.cs680.hw07;


import java.time.LocalDateTime;
import java.util.LinkedList;

public class Directory extends FSElement {
    protected Directory directory;
    protected LinkedList<FSElement> children = new LinkedList<FSElement>();


    public Directory(Directory Parent, String name, int size, LocalDateTime creationTime) {
        super(Parent, name, size, creationTime);
        this.directory =Parent;

    }
    public String getName(){
        return this.name;
    }

    public LinkedList<FSElement> getChildren(){
        return this.children;
    }

    public void appendChild(FSElement child){

        if (!(child instanceof Directory || child instanceof File)) {
            throw new IllegalArgumentException("Child must be a directory or a file.");
        }
        children.add(child);
        child.setParent (this);

    }
    public int countChildren(){
        return this.children.size();
    }
    public LinkedList<Directory> getSubDirectories(){

        LinkedList<Directory> directories = new LinkedList<>();
        for (FSElement element : children) {
            if (element instanceof Directory) {
                directories.add((Directory) element);
            }
        }
        return directories;
    }
    public Directory getParent(){
        return this.directory;
    }

    public LinkedList<File> getFiles(){

        LinkedList<File> files = new LinkedList<>();
        for (FSElement element : children) {
            if (element instanceof File) {
                files.add((File) element);
            }
        }
        return files;
    }
    public  int getTotalSize(){

            int  totalSizeOfFiles = 0;
            for (FSElement child : children) {
                if (child instanceof File) {
                    totalSizeOfFiles =totalSizeOfFiles + ((File) child).getSize();

                } else if (child instanceof Directory) {
                    totalSizeOfFiles= totalSizeOfFiles+ ((Directory) child).getTotalSize();
                }
            }
            return totalSizeOfFiles;

    }
    @Override
    public boolean isDirectory() {
        return true;

    }

    @Override
    public boolean isFile(){
        return false;
    }

}
