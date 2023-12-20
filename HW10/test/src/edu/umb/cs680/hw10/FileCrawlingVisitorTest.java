package edu.umb.cs680.hw10;

import edu.umb.cs680.hw10.fs.FileCrawling;
import edu.umb.cs680.hw10.fs.FileSystem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileCrawlingVisitorTest {

    private static FileSystem fs;
    @BeforeAll
    public static void setUpFS(){
        fs = TestFixtureInitializer.createFS ();
    }



    @Test
    public void verifyFileAJavaFromCrawling() {
        FileCrawling fileCrawlingCommand = new FileCrawling(fs.getRootDirs().getFirst());
        fileCrawlingCommand.execute();
        assertEquals("A.java", fileCrawlingCommand.getFiles().getFirst().getName());
    }

    @Test
    public void verifyFileBJavaFromCrawling() {
        FileCrawling fileCrawlingCommand = new FileCrawling(fs.getRootDirs().getFirst());
        fileCrawlingCommand.execute();
        assertEquals("B.java", fileCrawlingCommand.getFiles().get(1).getName());
    }

    @Test
    public void verifyFileReadmeFromCrawling() {
        FileCrawling fileCrawlingCommand = new FileCrawling(fs.getRootDirs().getFirst());
        fileCrawlingCommand.execute();
        assertEquals("readme.md", fileCrawlingCommand.getFiles().get(4).getName());
    }
}
