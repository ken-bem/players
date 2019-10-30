package com.kenbem.staxter;

public class Main {

    public static void main(String[] args) {

        //1) Create two players
        Player initiator = new Player("initiator");
        Player responder = new Player("responder");

        //2) Player 1 should send a message to player 2.
        initiator.sendMessage(responder);


        //Finalize the application gracefully
        System.exit(0);

    }
}
