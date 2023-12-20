package edu.umb.cs680.hw15;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeStampComparatorTest {


    private static FileSystem fs;
    @BeforeAll
    public static void setupFS(){
        fs= TestFixtureInitializer.createFS();
    }


    @Test
    public void TimeStampComparatorSortingUnderRepoTest(){
        List<String> actual= new ArrayList<> ();
        for(FSElement e: fs.getRootDirs().getFirst().getSubDirectories(Comparator.comparing(FSElement::getCreationTime))){
            actual.add(e.getName());}
        List<String> expected = List.of("src","test");
        assertEquals(expected,actual);
    }


    @Test
    public void TimeStampComparatorSortingUnderSrcTest(){
        List<String> actual= new ArrayList<> ();
        for(FSElement e: fs.getRootDirs().getFirst().getSubDirectories ().getFirst ().getFiles (Comparator.comparing((FSElement f) -> f.getCreationTime()))){
            actual.add(e.getName());}
        List<String> expected = List.of("A.java","B.java");
        assertEquals(expected,actual);
    }




}
