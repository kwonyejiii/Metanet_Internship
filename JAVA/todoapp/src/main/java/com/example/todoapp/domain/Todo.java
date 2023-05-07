package com.example.todoapp.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "todo") //todo"테이블과 연관시키겠다
@AllArgsConstructor //lombok//자동생성자(모든 매개변수)
@NoArgsConstructor
@Setter
@Getter
public class Todo { //2가지필드를 가진 테이블
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private String todo;
}
