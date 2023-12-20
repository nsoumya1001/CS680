package edu.umb.cs680.hw10;

import edu.umb.cs680.hw10.fs.FileSearch;
import edu.umb.cs680.hw10.fs.FileSystem;
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
    public void searchFileAJavaFromFileSearch() {
        FileSearch fileSearchCommand = new FileSearch(fs.getRootDirs().getFirst(), "A.java");
        fileSearchCommand.execute();
        assertEquals("A.java", fileSearchCommand.getFoundFiles().getFirst().getName());
    }

    @Test
    public void searchFileBTestJavaFromFileSearch() {
        FileSearch fileSearchCommand = new FileSearch(fs.getRootDirs().getFirst(), "BTest.java");
        fileSearchCommand.execute();
        assertEquals("BTest.java", fileSearchCommand.getFoundFiles().getFirst().getName());
    }

}
