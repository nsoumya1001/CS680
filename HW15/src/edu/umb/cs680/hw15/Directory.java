package edu.umb.cs680.hw15;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Directory extends FSElement {
    protected Directory Parent;
    protected LinkedList<FSElement> children = new LinkedList<FSElement> ();



    public Directory (Directory Parent, String name, int size, LocalDateTime creationTime) {
        super (Parent, name, size, creationTime);
        this.Parent = Parent;

    }

    @Override
    public String getName() {
        return super.getName();
    }

    public LinkedList<FSElement> getChildren () {
        Collections.sort(this.children, Comparator.comparing((FSElement f) -> f.getName()));
        return this.children;
    }

    public LinkedList<FSElement> getChildren (Comparator <FSElement> comparator) {
        Collections.sort (this.children,comparator);
        return this.children;
    }

    public void appendChild (FSElement child) {

        if ( !(child instanceof Directory || child instanceof File || child instanceof Link) ) {
            throw new IllegalArgumentException ("Child must be a directory or a file.");
        }
        children.add (child);
        child.setParent (this);
        Collections.sort(children,Comparator.comparing((FSElement f) -> f.getName()));

    }



    public int countChildren () {
        return this.children.size ();
    }

    public LinkedList<Directory> getSubDirectories () {
        LinkedList<Directory> directories = new LinkedList<> ();
        for (FSElement element : children) {
            if ( element instanceof Directory ) {
                directories.add ((Directory) element);
            }
        }
        Collections.sort(directories,Comparator.comparing((FSElement f) -> f.getName()));
        return directories;
    }



    public LinkedList<Directory> getSubDirectories (Comparator <FSElement> comparator) {
        LinkedList<Directory> directories = new LinkedList<> ();
        for (FSElement element : children) {
            if ( element instanceof Directory ) {
                directories.add ((Directory) element);
            }
        }
        Collections.sort(directories,comparator);
        return directories;
    }

    public Directory getParent () {
        return this.Parent;
    }

    public LinkedList<File> getFiles () {

        LinkedList<File> files = new LinkedList<> ();
        for (FSElement element : children) {
            if ( element instanceof File ) {
                files.add ((File) element);
            }
        }
        Collections.sort( files,Comparator.comparing((FSElement f) -> f.getName()));
        return files;
    }

    public LinkedList<File> getFiles (Comparator <FSElement> comparator) {

        LinkedList<File> files = new LinkedList<> ();
        for (FSElement element : children) {
            if ( element instanceof File ) {
                files.add ((File) element);
            }
        }
        Collections.sort( files,comparator);
        return files;
    }

    public int getTotalSize () {

        int totalSizeOfFiles = 0;
        for (FSElement child : children) {
            if ( child instanceof File ) {
                totalSizeOfFiles = totalSizeOfFiles + ((File) child).getSize ();

            } else if ( child instanceof Directory ) {
                totalSizeOfFiles = totalSizeOfFiles + ((Directory) child).getTotalSize ();
            }
        }
        return totalSizeOfFiles;

    }

    @Override
    public boolean isDirectory () {
        return true;

    }

    @Override
    public boolean isFile () {
        return false;
    }

    @Override
    protected boolean isLink() {
        return false;
    }


    public LinkedList<Link> getLink () {

        LinkedList<Link> links = new LinkedList<> ();
        for (FSElement element : children) {
            if ( element instanceof Link ) {
                links.add ((Link) element);
            }
        }
        Collections.sort(links,Comparator.comparing((FSElement f) -> f.getName()));
        return links;
    }

    public LinkedList<Link> getLink (Comparator <FSElement> comparator) {

        LinkedList<Link> links = new LinkedList<> ();
        for (FSElement element : children) {
            if ( element instanceof Link ) {
                links.add ((Link) element);
            }
        }
        Collections.sort(links,comparator);
        return links;
    }
}