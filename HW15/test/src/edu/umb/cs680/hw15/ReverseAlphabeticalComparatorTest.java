package edu.umb.cs680.hw15;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseAlphabeticalComparatorTest {


    private static FileSystem fs;
    @BeforeAll
    public static void setupFS(){
        fs= TestFixtureInitializer.createFS();
    }


    @Test
    public void ReverseAlphabeticalSortingUnderRepoTest(){
        List<String> actual= new ArrayList<> ();
        for(FSElement e: fs.getRootDirs().getFirst().getSubDirectories((FSElement f1,FSElement f2) ->f2.getName().compareTo(f1.getName()))){
            actual.add(e.getName());}
        List<String> expected = List.of("test","src");
        assertEquals(expected,actual);
    }

    @Test
    public void ReverseAlphabeticalSortingUnderSrcTest(){
        List<String> actual= new ArrayList<> ();
        for(FSElement e: fs.getRootDirs().getFirst().getSubDirectories ().getFirst ().getFiles ((FSElement f1,FSElement f2) ->f2.getName().compareTo(f1.getName()))){
            actual.add(e.getName());}
        List<String> expected = List.of("B.java","A.java");
        assertEquals(expected,actual);
    }




}
