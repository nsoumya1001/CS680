package edu.umb.cs680.hw09;

import edu.umb.cs680.hw09.fs.FileSystem;
import edu.umb.cs680.hw09.fs.util.FileCrawlingVisitor;
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
    public void VerifyFileAJavaFromCrawling(){
        FileCrawlingVisitor filecrawlingvisitor = new FileCrawlingVisitor ();
        fs.getRootDirs().getFirst().accept(filecrawlingvisitor);
        assertEquals("A.java",filecrawlingvisitor.getFilesFromCrawling ().getFirst ().getName ());
    }

    @Test
    public void VerifyFileBJavaFromCrawling(){
        FileCrawlingVisitor filecrawlingvisitor = new FileCrawlingVisitor ();
        fs.getRootDirs().getFirst().accept(filecrawlingvisitor);
        assertEquals("B.java",filecrawlingvisitor.getFilesFromCrawling ().get (1).getName ());
    }

    @Test
    public void VerifyFileReadmeFromCrawling(){
        FileCrawlingVisitor filecrawlingvisitor = new FileCrawlingVisitor ();
        fs.getRootDirs().getFirst().accept(filecrawlingvisitor);
        assertEquals("readme.md",filecrawlingvisitor.getFilesFromCrawling ().get (4).getName ());
    }
}
