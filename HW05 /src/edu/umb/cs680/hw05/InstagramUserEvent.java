package edu.umb.cs680.hw05;

public class InstagramUserEvent {

    private static String accountupdate;

    public InstagramUserEvent(String update){
        accountupdate=update;
    }

    public String getUpdate(){
        return accountupdate;
    }

    public static void main (String[] args) {
        System.out.println ("Welcome to Observer Design pattern");
    }
 }
