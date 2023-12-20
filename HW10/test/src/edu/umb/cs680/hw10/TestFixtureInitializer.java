package edu.umb.cs680.hw10;
import edu.umb.cs680.hw10.fs.Directory;
import edu.umb.cs680.hw10.fs.File;
import edu.umb.cs680.hw10.fs.FileSystem;
import edu.umb.cs680.hw10.fs.Link;


import java.time.LocalDateTime;
public class TestFixtureInitializer {

    public static FileSystem createFS(){
        // we have initialized all directories and files whose parent is repo element
        Directory repo = new Directory(null,"repo",0, LocalDateTime.now());
        Directory src = new Directory(repo,"src",0, LocalDateTime.now());
        Directory test = new Directory(repo,"test",0, LocalDateTime.now());
        File readme = new File(repo,"readme.md",200,LocalDateTime.now());

        // we will create children of src directory
        File A = new File(src,"A.java",100,LocalDateTime.now());
        File B = new File(src,"B.java",150,LocalDateTime.now());

        // we will create src test directory
        Directory srcTest = new Directory(test,"src",0, LocalDateTime.now());

        // we will create children of test directory
        File ATest = new File(srcTest,"ATest.java",100,LocalDateTime.now());
        File BTest = new File(srcTest,"BTest.java",150,LocalDateTime.now());
        Link rm=new Link(srcTest,"rm.md",0,LocalDateTime.now (),readme);


        repo.appendChild(src);
        repo.appendChild(test);
        repo.appendChild(readme);

        src.appendChild(A);
        src.appendChild(B);

        test.appendChild (srcTest);

        srcTest.appendChild(ATest);
        srcTest.appendChild(BTest);
        srcTest.appendChild (rm);


        FileSystem fs= FileSystem.getFileSystem();
        fs.appendRootDir(repo);

        return fs;

    }


}
