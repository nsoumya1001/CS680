package edu.umb.cs680.hw08;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


public class LinkTest {


    private static FileSystem fs;
    @BeforeAll
    public static void setUpFS(){
        fs = TestFixtureInitializer.createFS ();
    }

    LocalDateTime creationtime=LocalDateTime.now();


    private String[] LinkToStringArray(Link link){
        return new String[]{link.getParent().getName(),
                link.getName(), String.valueOf(link.getSize()),creationtime.toString(),link.getTarget().getName()};
    }

    @Test
    public void EqualityCheckWithLink(){
        String[] expected={"src","rm.md","0",creationtime.toString(),"readme.md"};
        Link link= fs.getRootDirs().getFirst().getSubDirectories ().get (1).getSubDirectories ().getFirst ().getLink ().getFirst ();
        assertArrayEquals(expected,LinkToStringArray(link));
    }


    @Test
    public void ParentOfRMLink(){
        assertEquals("src",fs.getRootDirs().getFirst().getSubDirectories ().get (1).getSubDirectories ().getFirst ().getLink ().getFirst ().getParent ().getName ());
    }

    @Test
    public void IsDirectoryTest(){
        assertFalse(fs.getRootDirs().getFirst().getSubDirectories ().get (1).getSubDirectories ().getFirst ().getLink ().getFirst ().isDirectory ());
    }

    @Test
    public void TargetOfLinkRM(){
        assertEquals("readme.md",fs.getRootDirs().getFirst().getSubDirectories ().get (1).getSubDirectories ().getFirst ().getLink ().getFirst ().getTarget ().getName ());
    }

}
