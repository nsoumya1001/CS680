package edu.umb.cs680.hw10;

import edu.umb.cs680.hw10.fs.FileSystem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import edu.umb.cs680.hw10.fs.Counting;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingVisitorTest {

    private static FileSystem fs;
    @BeforeAll
    public static void setUpFS(){
        fs = TestFixtureInitializer.createFS ();
    }

    @Test
    public void findNoOfDirectories(){
        Counting countCmd = new Counting(fs.getRootDirs().getFirst());
        countCmd.execute();
        assertEquals(4, countCmd.getNoOfDirectories ());
    }

    @Test
    public void findNoOfLinks(){
        Counting countCmd = new Counting(fs.getRootDirs().getFirst());
        countCmd.execute();
        assertEquals(1, countCmd.getNoOfLinks());
    }

    @Test
    public void findNoOfFiles(){
        Counting countCmd = new Counting(fs.getRootDirs().getFirst());
        countCmd.execute();
        assertEquals(5, countCmd.getNoOfFiles());
    }
}
