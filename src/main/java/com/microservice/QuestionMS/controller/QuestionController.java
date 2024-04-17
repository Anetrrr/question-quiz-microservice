package com.microservice.QuestionMS.controller;

import com.microservice.QuestionMS.model.Question;
import com.microservice.QuestionMS.model.QuestionWrapper;
import com.microservice.QuestionMS.model.Response;
import com.microservice.QuestionMS.service.QuestionService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/question")
public class QuestionController {

    public final QuestionService questionService;

    @GetMapping("/allQuestions")
    public ResponseEntity<Iterable<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }
    @GetMapping("/category/{category}")
    public ResponseEntity<Iterable<Question>> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }
    @PostMapping("/add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
    @GetMapping("/generate")
  public ResponseEntity<List<Integer>> getQuestionsForQuiz(@RequestParam String category, @RequestParam Integer numQuestions){
        return questionService.getQuestionsForQuiz(category, numQuestions);
  }

  @PostMapping("/getQuestions")
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionIds){
        return questionService.getQuestionsFromId(questionIds);
  }

  @PostMapping("/getscore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
        return questionService.getScore(responses);
  }
}
