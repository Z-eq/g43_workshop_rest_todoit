package se.lexicon.todo_it_api.service;

import se.lexicon.todo_it_api.data.TodoItemDAO;
import se.lexicon.todo_it_api.form.TodoItemForm;
import se.lexicon.todo_it_api.dto.TodoItemDto;


import java.time.LocalDate;
import java.util.List;

public interface TodoItemService {

  TodoItemDAO create (TodoItemForm);
  TodoItemDto findById (Integer id);
  List<TodoItemDto> findAll();
  List<TodoItemDto> findByTitle (String);
  List<TodoItemDto> findAllUnassigned ();
  List<TodoItemDto> findAllUnfinishedAndOverdue();
  List<TodoItemDto> findAllByPersonId(Integer id);
  List<TodoItemDto> findByDOneStatus (Boolean);
  List<TodoItemDto> findBYDeadLineBetween (LocalDate LocalDate);
  List<TodoItemDto> findBYDeadLineBefore (LocalDate);
  List<TodoItemDto> findByDeadLineAfter (LocalDate);
  TodoItemDto update (Integer, TodoItemForm);
  Boolean delete (Integer id);

}
