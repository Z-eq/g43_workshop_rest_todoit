package se.lexicon.todo_it_api.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.lexicon.todo_it_api.converter.TodoItemConverter;
import se.lexicon.todo_it_api.data.TodoItemDAO;
import se.lexicon.todo_it_api.dto.TodoItemDto;
import se.lexicon.todo_it_api.form.TodoItemForm;

import java.time.LocalDate;
import java.util.List;


@Service
public class TodoItemServiceImpl implements TodoItemService {

   @Autowired
   TodoItemDAO todoItemDAO;

   TodoItemConverter TodoConv = new TodoItemConverter();

   TodoItemForm





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
