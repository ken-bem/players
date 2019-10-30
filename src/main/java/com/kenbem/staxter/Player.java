package com.kenbem.staxter;

public class Player {

    private String name;
    private int sentMessages;

    public Player(){}

    public Player(String name) {
        this.name = name;
    }

    public void sendMessage(Player otherPlayer){

        //If 10 messages where sent, exit.
        while (this.sentMessages < 10){
            this.sentMessages++;
            System.out.println("Message sent by " + this.name +" : #" + sentMessages);
            otherPlayer.sendMessage(this);
        }

    }

}
