package com.example.RUBABKHALID_QUIZ_APP;
RUBABKHALID_QUIZ_APP.APP

import com.example.RUBABKHALID_QUIZ_APP.APP.RUBAB_QUESTION_REPOSITORY
import com.example.RUBABKHALID_QUIZ_APP.APP.RUBAB_QUIZAPP_REPOSITORY
import com.example.RUBABKHALID_QUIZ_APP.APP_ENTITIES_RUBAB_QUIZ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.App_Control
@RequestMapping(value = "/rest/quiz")
public class App_Control {
    @Autowired
  RUBAB_QUIZAPP_REPOSITORY R_quizRepository;
    @Autowired
   RUBAB_QUESTION_REPOSITORY rubab_question_repository;
    @GetMapping(value = "/all")
    public List<Quiz> total_data(){
        return (List<Quiz>) R_quizRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Quiz> persist(@RequestBody Quiz quiz){
        quizRepository.save(quiz);
        return (List<Quiz>) R_quizRepository.findAll();
    }
    @PostMapping(value = "/questionload")
    public List<Quiz> question(@RequestBody Quiz quiz){
        R_quizRepository.save(quiz);
        return (List<Quiz>) R_quizRepository.findAll();
    }
}
