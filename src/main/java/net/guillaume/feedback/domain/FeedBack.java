package net.guillaume.feedback.domain;

import java.util.*;

public class FeedBack {

    public final String text;
    public final String owner;

    private final Map<String, Vote> positive;
    private final Map<String, Vote> negative;
    private final List<FeedBack> childs;

    public FeedBack(String text, String owner) {
        this.text = text;
        this.owner = owner;
        positive = new HashMap<>();
        negative = new HashMap<>();
        childs = new ArrayList<>();
    }

    public int getPositive() {
        return getVotesValue(positive);
    }

    public int getNegative() {
        return getVotesValue(negative);
    }

    private int getVotesValue(Map<String, Vote> votes) {
        int count = 0;
        for (Vote vote : votes.values()){
            count += vote.value;
        }
        return count;
    }

    public void plus(int value, String owner) {
        vote(value, owner, positive);
    }

    public void minus(int value, String owner) {
        vote(value, owner, negative);
    }

    private void vote(int value, String owner, Map<String, Vote> votes) {
        if (votes.keySet().contains(owner)) {
            votes.remove(owner);
        }
        votes.put(owner, new Vote(value, owner));
    }

    public List<FeedBack> getChilds() {
        return Collections.unmodifiableList(childs);
    }

    public void add(FeedBack feedBack) {
        childs.add(feedBack);
    }
}
