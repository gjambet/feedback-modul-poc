package net.guillaume.feedback.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FeedBacks {

    private final Set<FeedBack> feedbacks;

    public FeedBacks() {
        feedbacks = new HashSet<>();
    }

    public void add(FeedBack feedBack) {
        feedbacks.add(feedBack);
    }

    public List<FeedBack> getFeedbacks() {
        return new ArrayList<>(feedbacks);
    }
}
