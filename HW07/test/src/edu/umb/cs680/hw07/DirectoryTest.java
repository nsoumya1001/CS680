package edu.umb.cs680.hw07;

import edu.umb.cs680.hw07.Directory;
import edu.umb.cs680.hw07.FileSystem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DirectoryTest {

    private static FileSystem fs;
    @BeforeAll
    public static void setUpFS(){
        fs =  TestFixtureInitializer.createFS();
    }

    private LocalDateTime creationtime=LocalDateTime.now();


    private String[] dirToStringArray(Directory d){
        String[] dirInfo = {d.getParent().getName(),
                d.getName(), String.valueOf(d.getSize()), creationtime.toString()};
        return dirInfo;
    }

    @Test
    public void verifyDirectoryEqualitySrc(){
        String[] expected = {"repo", "src", "0",creationtime.toString()};
        Directory actual = fs.getRootDirs ().getFirst().getSubDirectories ().getFirst ();
        assertArrayEquals(expected,
                dirToStringArray(actual) ); }

    @Test
    public void getNameTest(){
        String actual_name=fs.getRootDirs ().getFirst().getSubDirectories ().getFirst ().getName();
        String exp_name="src";
        assertEquals(exp_name,actual_name);
    }

    @Test
    public void getChildrenTest(){
        LinkedList<FSElement> actual_children=fs.getRootDirs ().getFirst().getSubDirectories ().getFirst ().getChildren();
        String child1=actual_children.getFirst().getName();
        String child2=actual_children.get(1).getName();
        List<String> actual_child_name=List.of(child1,child2);
        List<String> exp_child_name=List.of("A.java","B.java");
        assertEquals(exp_child_name,actual_child_name);
    }

    @Test
    public void appendChildTest(){
        Directory dir1=new Directory(null,"Hello",0,creationtime.now());
        File file1=new File(dir1,"file1",100,creationtime.now());
        dir1.appendChild(file1);
        String actual_name=dir1.getChildren().getFirst().getName();
        String exp_name="file1";
        assertTrue(exp_name==actual_name);
    }

    @Test
    public void countChildrenTest(){
        Directory dir1=new Directory(null,"Hello",0,creationtime.now());
        File file1=new File(dir1,"file1",100,creationtime.now());
        dir1.appendChild(file1);
        Integer actual= dir1.countChildren();
        Integer expected=1;
        assertEquals(expected,actual);
    }

    @Test
    public void getSubDirectoriesTest(){
        LinkedList<Directory> actual_children=fs.getRootDirs ().getFirst().getSubDirectories ();
        List<String> actual_list=List.of(actual_children.getFirst().getName(),actual_children.get(1).getName());
        List<String> exp_list=List.of("src","test");
        assertEquals(actual_list,exp_list);
    }
    @Test
    public void getParentTest(){
        Directory dir1=new Directory(null,"Hello",0,creationtime.now());
        File file1=new File(dir1,"file1",100,creationtime.now());
        dir1.appendChild(file1);
        Directory expected=dir1;
        assertEquals(expected,file1.getParent());
    }

    @Test
    public void getFilesTest(){
        LinkedList<File> actual_files=fs.getRootDirs ().getFirst().getSubDirectories ().getFirst ().getFiles();
        List<String> actual_files_names=List.of(actual_files.get(0).getName(),actual_files.get(1).getName());
        List<String> exp_files_names=List.of("A.java","B.java");
        assertEquals(exp_files_names,actual_files_names);
    }

    @Test
    public void isDirectoryTest(){
        assertTrue(fs.getRootDirs ().getFirst().isDirectory());
    }


    @Test
    public void verifyDirectoryEqualityTest(){
        String[] expected = {"repo", "test", "0",creationtime.toString()};
        Directory actual = fs.getRootDirs ().getFirst().getSubDirectories ().get(1);
        assertArrayEquals(expected,
                dirToStringArray(actual) ); }


    @Test
    public void RepoParentNullTest(){
        assertNull(fs.getRootDirs().getFirst().getParent());
    }

    @Test
    public void TotalSizeTest(){
        int expected=700;
        int actual= fs.getRootDirs ().getFirst().getTotalSize ();
        assertEquals (expected,actual);
    }



}


