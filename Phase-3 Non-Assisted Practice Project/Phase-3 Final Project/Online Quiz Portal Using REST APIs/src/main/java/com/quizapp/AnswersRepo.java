package com.quizapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswersRepo extends JpaRepository<Answers, Integer>{

}
