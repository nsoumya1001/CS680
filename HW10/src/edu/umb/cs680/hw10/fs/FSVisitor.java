package edu.umb.cs680.hw10.fs;

public interface FSVisitor {
    void visit(Link link);
    void visit(File file);
    void visit(Directory directory);
}
