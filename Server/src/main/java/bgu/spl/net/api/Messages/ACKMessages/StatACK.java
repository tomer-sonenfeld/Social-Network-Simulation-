package bgu.spl.net.api.Messages.ACKMessages;

import bgu.spl.net.api.Messages.ACKMessage;

public class StatACK extends ACKMessage {

    private int age;
    private int numPosts;
    private int numFollowers;
    private int numFollowing;

    public StatACK(int messageopCode, int age, int numPosts, int numFollowers, int numFollowing) {
        super(messageopCode);
        this.age = age;
        this.numPosts = numPosts;
        this.numFollowers = numFollowers;
        this.numFollowing = numFollowing;
    }

    public String toString()
    {
        return "ACK "+ 8+ " "+ age+" "+numPosts+" "+numFollowers+" "+numFollowing;
    }
}
