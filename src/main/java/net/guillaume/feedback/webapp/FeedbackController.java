package net.guillaume.feedback.webapp;

import net.guillaume.feedback.dev.FeedbackMother;
import net.guillaume.feedback.domain.FeedBacks;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FeedbackController {

    @RequestMapping("/feedbacks")
    public FeedBacks feedbacks() {
        FeedBacks feedBack = new FeedBacks();
        feedBack.add(FeedbackMother.NORMAL);
        feedBack.add(FeedbackMother.BASIC);
        return feedBack;
    }

}