package net.guillaume.feedback.dev;

import net.guillaume.feedback.domain.FeedBack;


public class FeedbackMother {

    public static final FeedBack NORMAL;
    public static final FeedBack BASIC;

    static {

        NORMAL = new FeedBack("this is wonderful", "guillaume");
        NORMAL.plus(3, "guillaume");
        NORMAL.plus(3, "pedro");
        NORMAL.plus(3, "raoul");
        NORMAL.minus(1, "peniblo");
        NORMAL.add(new FeedBack("mouais surement", "pipo"));
        NORMAL.add(new FeedBack("vraiment", "pipo"));

        BASIC = new FeedBack("this is wonderful", "guillaume");
        BASIC.plus(3, "guillaume");
        BASIC.plus(3, "pedro");
        NORMAL.minus(1, "peniblo");

    }

}
