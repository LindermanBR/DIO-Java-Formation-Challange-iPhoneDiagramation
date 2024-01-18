package model;

import interfaces.MusicPlayer;

public class IPod implements MusicPlayer {

    @Override
    public void play() {
        System.out.println("Playing music on the iPod");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music on the iPod");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecting music on the iPod");
    }

}
