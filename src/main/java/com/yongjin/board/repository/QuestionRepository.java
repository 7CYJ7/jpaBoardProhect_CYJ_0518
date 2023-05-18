package com.yongjin.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yongjin.board.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

}
