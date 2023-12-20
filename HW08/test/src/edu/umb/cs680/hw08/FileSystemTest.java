package edu.umb.cs680.hw08;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class FileSystemTest {

    private static FileSystem fs;
    @BeforeAll
    public static void setUpFS(){
        fs =  TestFixtureInitializer.createFS();
    }



    @Test
    public void SingeltonClassCheck(){

        FileSystem file1= FileSystem.getFileSystem();
        FileSystem file2= FileSystem.getFileSystem();
        assertSame(file1,file2);
    }

    @Test
    public void getRootDirs(){
        assertTrue(fs.getRootDirs().getFirst() instanceof Directory);
    }

    @Test
    public void appendRootDir(){
        Integer root_dir=fs.getRootDirs().size()+1;
        Directory root2=new Directory(null,"root2",0, LocalDateTime.now());
        fs.appendRootDir(root2);
        assertEquals(root_dir,fs.getRootDirs().size());
    }

    @Test
    public void RepoNameCheck(){
        String expected="repo";
        assertEquals(expected,fs.getRootDirs().getFirst().getName());
    }
}
