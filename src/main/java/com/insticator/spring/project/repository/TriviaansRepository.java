package com.insticator.spring.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insticator.spring.project.models.questions.Checkbox.Checkans;
import com.insticator.spring.project.models.questions.Checkbox.CheckansId;
import com.insticator.spring.project.models.questions.Trivia.Triviaans;
import com.insticator.spring.project.models.questions.Trivia.TriviaansId;

@Repository
public interface TriviaansRepository extends JpaRepository<Triviaans, TriviaansId>{
}