package model;

import interfaces.Phone;

public class StarTAC338 implements Phone {

    @Override
    public void call() {
        System.out.println("Calling on the StarTAC 338");
    }

    @Override
    public void answer() {
        System.out.println("Answering on the StarTAC 338");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voice mail on the StarTAC 338");
    }

}
