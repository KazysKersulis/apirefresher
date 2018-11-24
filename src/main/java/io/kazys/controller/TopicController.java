package io.kazys.controller;

import io.kazys.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("java", "Java basics", "An introductory course on JAVA"),
                new Topic("javascript", "Javascript fundamentals", "Intro to JavaScript"),
                new Topic("spring", "Spring Framework", "Spring Framework introduction")
        );
    }

}
