package net.guillaume.feedback.domain;

public class Vote {

    public final int value;
    public final String owner;

    public Vote(int value, String owner) {
        this.value = value;
        this.owner = owner;
    }
}
