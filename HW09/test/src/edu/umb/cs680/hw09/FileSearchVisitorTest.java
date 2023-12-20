package edu.umb.cs680.hw09;

import edu.umb.cs680.hw09.fs.FileSystem;
import edu.umb.cs680.hw09.fs.util.FileSearchVisitor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileSearchVisitorTest {

    private static FileSystem fs;
    @BeforeAll
    public static void setUpFS(){
        fs = TestFixtureInitializer.createFS ();
    }



    @Test
    public void SearchFileAJavaFromFileSearch(){
        FileSearchVisitor fileSearchVisitor=new FileSearchVisitor ("A.java");
        fs.getRootDirs().getFirst().accept(fileSearchVisitor);
        assertEquals("A.java",fileSearchVisitor.getFoundFiles ().getFirst ().getName ());
    }


    @Test
    public void SearchFileBTestJavaFromFileSearch(){
        FileSearchVisitor fileSearchVisitor=new FileSearchVisitor ("BTest.java");
        fs.getRootDirs().getFirst().accept(fileSearchVisitor);
        assertEquals("BTest.java",fileSearchVisitor.getFoundFiles ().getFirst ().getName ());
    }
}
