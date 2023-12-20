package edu.umb.cs680.hw09;

import edu.umb.cs680.hw09.fs.FileSystem;
import edu.umb.cs680.hw09.fs.util.CountingVisitor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingVisitorTest {

    private static FileSystem fs;
    @BeforeAll
    public static void setUpFS(){
        fs = TestFixtureInitializer.createFS ();
    }

    CountingVisitor count= new CountingVisitor ();

    @Test
    public void  FindNoOfDirectories(){
        fs.getRootDirs ().getFirst().accept (count);
        assertEquals(4,count.getNoOfDirectories ());
    }

    @Test
    public void  FindNoOfLinks(){
        fs.getRootDirs ().getFirst().accept (count);
        assertEquals(1,count.getNoOfLinks ());
    }

    @Test
    public void  FindNoOfFiles(){
        fs.getRootDirs ().getFirst().accept (count);
        assertEquals(5,count.getNoOfFiles ());
    }

}
