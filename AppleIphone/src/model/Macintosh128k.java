package model;

import interfaces.InternetBrowser;

public class Macintosh128k implements InternetBrowser {

    @Override
    public void displayPage() {
        System.out.println("Displaying page on the Macintosh 128k");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adding new tab on the Macintosh 128k");
    }

    @Override
    public void updatePage() {
        System.out.println("Updating page on the Macintosh 128k");
    }

}