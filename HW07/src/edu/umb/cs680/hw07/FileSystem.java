package edu.umb.cs680.hw07;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

public class FileSystem {

    private static FileSystem instance = null;


    private LinkedList<Directory> rootdirs;

    private FileSystem(){
        this.rootdirs = new LinkedList<>();
    }

    public static FileSystem getFileSystem(){
        if(instance==null) {
            instance = new FileSystem();
        }
        return instance;
    }

    public LinkedList<Directory> getRootDirs(){
        return rootdirs;
    }

    public void  appendRootDir(Directory root) {
        rootdirs.add(root);
        root.setParent(null);
    }//check

    public static void main (String[] args) {
    }

   }
