package com.example.todoapp.repository;

import com.example.todoapp.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

//클래스에 db테이블과 매핑
public interface TodoRepository extends JpaRepository<Todo, Long> {  //<Entity클래스(도메인), 의 Id타입>
  //TodoRepository를 이용해 데이터베이스 입력수정삭제
}
