package edu.umb.cs680.hw17;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SizeComparatorTest {

    private static FileSystem fs;
    @BeforeAll
    public static void setupFS(){
        fs= TestFixtureInitializer.createFS();
    }

    @Test
    public void SizeSortingUnderRepoTest(){
        List<String> actual= new ArrayList<> ();
        for(FSElement e: fs.getRootDirs().getFirst().getSubDirectories((FSElement f1, FSElement f2)->f1.getSize()-f2.getSize())){
            actual.add(e.getName());}
        List<String> expected = List.of("src","test");
        assertEquals(expected,actual);
    }

    @Test
    public void SizeSortingUnderSrcTest(){
        List<String> actual= new ArrayList<> ();
        for(FSElement e: fs.getRootDirs().getFirst().getSubDirectories ().getFirst ().getFiles ((FSElement f1, FSElement f2)->f1.getSize()-f2.getSize())){
            actual.add(e.getName());}
        List<String> expected = List.of("A.java","B.java");
        assertEquals(expected,actual);
    }

}
