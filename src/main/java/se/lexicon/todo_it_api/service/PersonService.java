package se.lexicon.todo_it_api.service;

import se.lexicon.todo_it_api.form.PersonForm;
import se.lexicon.todo_it_api.dto.PersonDto;

import java.util.List;

public interface PersonService {
    PersonDto create(PersonForm p);
    PersonDto findById(Integer id);
    List<PersonDto> findAll();
    List<PersonDto> findIdlePeople();
    PersonDto update(Integer id, PersonForm pForm);
    boolean delete(Integer id);
    PersonDto addTodoItem(Integer id, Integer num);
    PersonDto removeTodoItem(Integer id);
}
