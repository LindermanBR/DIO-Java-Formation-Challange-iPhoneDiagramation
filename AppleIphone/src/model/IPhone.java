package model;

import interfaces.InternetBrowser;
import interfaces.MusicPlayer;
import interfaces.Phone;

public class IPhone implements Phone, InternetBrowser, MusicPlayer {

    @Override
    public void play() {
        System.out.println("Playing Music on the iPhone");
    }

    @Override
    public void pause() {
        System.out.println("Pausing Music on the iPhone");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecting Music on the iPhone");
    }

    @Override
    public void displayPage() {
        System.out.println("Displaying page on the iPhone");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adding new tab on the iPhone");
    }

    @Override
    public void updatePage() {
        System.out.println("Updating page on the iPhone");
    }

    @Override
    public void call() {
        System.out.println("Calling on the iPhone");
    }

    @Override
    public void answer() {
        System.out.println("Answering on the iPhone");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voice mail on the iPhone");
    }

}
