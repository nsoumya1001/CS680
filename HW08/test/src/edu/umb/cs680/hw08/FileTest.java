package edu.umb.cs680.hw08;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class FileTest {

    private static FileSystem fs;
    @BeforeAll
    public static void setUpFS(){
        fs =  TestFixtureInitializer.createFS();
    }

    LocalDateTime creationtime=LocalDateTime.now();


    private String[] FileToStringArray(File file){
        String[] FileInfo = {file.getParent().getName(),
                file.getName(), String.valueOf(file.getSize()),creationtime.toString()};
        return FileInfo;
    }

    @Test
    public void EqualityCheckWithAjavaFile(){
        String[] expected={"src","A.java","100",creationtime.toString()};
        File file= fs.getRootDirs().getFirst().getSubDirectories().get(0).getFiles().getFirst();
        assertArrayEquals(expected,FileToStringArray(file));
    }

    @Test

    public void AjavaiIsAFile(){
        assertTrue (fs.getRootDirs().getFirst().getSubDirectories().get(0).getFiles().getFirst().isFile ());
    }

    @Test

    public void BjavaiIsNotADirectory(){
        assertFalse (fs.getRootDirs().getFirst().getSubDirectories().get(0).getFiles().getFirst().isDirectory());
    }

    @Test
    public void NameOfFileTest(){
        assertEquals("ATest.java",fs.getRootDirs().getFirst().getSubDirectories().get(1).getSubDirectories ().getFirst ().getFiles ().getFirst ().getName ());
    }






}
