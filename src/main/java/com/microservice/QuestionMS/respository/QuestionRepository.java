package com.microservice.QuestionMS.respository;

import com.microservice.QuestionMS.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {


    Iterable<Question> findByCategory(String category);

    List<Integer> findRandomQuestionsByCategory(String categoryName, Integer numQuestions);

//    List<Integer> findRandomQuestionsByCategory(String categoryName, Integer numQuestions);
//
}
