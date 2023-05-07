package com.example.todoapp;

import com.example.todoapp.domain.Todo;
import com.example.todoapp.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//spring mvc
@Controller
@RequiredArgsConstructor
public class TodoController {
 //toDoRepository를 이용해 DB에 저장가능
 private final TodoRepository toDoRepository; //@RequiredArgsConstructor가 자동으로 넣어줌
 @GetMapping("/") // 슬래시 생략가능
 public String index(Model model) {  //<< 읽어오기 (Model model로 넘겨주기)(=화면에뿌려주기,todos.html에 넘겨주기) >>
   // 1.레포지토리.findAll(): DB에 저장된 모든걸 todos라는 list(목록)로 가져와 담아서
  List<Todo> todos = toDoRepository.findAll();
  //2. 이 todos를 model객체에 "todos"란 이름으로 저장한다. //todos란 이름에 담겨서
  model.addAttribute("todos",todos);
  return "todos";  //3.todos.html에 넘긴다
 }

 @PostMapping("/addTodo")  //post방식으로 addTodo 받음
  public String addTodo (@RequestParam("todo") String todo){ // 뷰:input의 name="todo"입력된걸 받아옴
   // System.out.println(todo); 화면에서 입력받은게 콘솔에 뜸

  //<<  Database에 저장시키면 된다>>   -> domain, repository필요
    //1.엔터티 인스턴스 생성
  Todo td = new Todo();
    //2.만든 인스턴스todo에 읽어온 todo 넣기
  td.setTodo(todo);
    //3.레포지토리에 엔터트인스턴스 저장
  toDoRepository.save(td);


  return "redirect:/"; //이동

 }
}
/*<form method="post" action="/addTodo">    //post방식으로 addTodo에 보낸다
    <input type="text" name="todo"/>
    <input type="submit" value="Add todo"/>*/



