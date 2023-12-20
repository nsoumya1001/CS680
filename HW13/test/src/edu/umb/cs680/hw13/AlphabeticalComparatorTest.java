package edu.umb.cs680.hw13;

import edu.umb.cs680.hw13.fs.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import edu.umb.cs680.hw13.fs.FileSystem;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlphabeticalComparatorTest {


    private static FileSystem fs;
    @BeforeAll
    public static void setupFS(){
        fs= TestFixtureInitializer.createFS();
    }

    @Test
    public void AlphabeticalSortingUnderRepoTest(){
        List<String> actual= new ArrayList<> ();
        for(FSElement e: fs.getRootDirs().getFirst().getSubDirectories(new AlphabeticalComparator())){
            actual.add(e.getName());}
        List<String> expected = List.of("src","test");
        assertEquals(expected,actual);
    }


    @Test
    public void AlphabeticalSortingUnderSrcTest(){
        List<String> actual= new ArrayList<> ();
        for(FSElement e: fs.getRootDirs().getFirst().getSubDirectories ().getFirst ().getFiles (new AlphabeticalComparator ())){
            actual.add(e.getName());}
        List<String> expected = List.of("A.java","B.java");
        assertEquals(expected,actual);
    }

    @Test
    public void DefaultOrderTest(){
        List<String> actual= new ArrayList<>();
        for(FSElement e: fs.getRootDirs().getFirst().getSubDirectories()){
            actual.add(e.getName());}
        List<String> expected = List.of("src","test");
        assertEquals(expected,actual);
    }





}
