package se.lexicon.todo_it_api.converter;

import se.lexicon.todo_it_api.dto.PersonDto;
import se.lexicon.todo_it_api.dto.TodoItemDto;
import se.lexicon.todo_it_api.form.PersonForm;
import se.lexicon.todo_it_api.form.TodoItemForm;
import se.lexicon.todo_it_api.model.entity.TodoItem;

import java.util.List;

public class TodoItemConverter implements Converter <TodoItem, TodoItemDto, TodoItemForm> {

    @Override

    @Override
    public TodoItemDto toDto(TodoItem entity) {
        return new
    }

    @Override
    public TodoItem toEntity(PersonForm form) {
        return new
    }

    @Override
    public List<PersonDto> toDto(List<TodoItem> entities) {
        return
    }

    @Override
    public List<TodoItem> toEntities(List<PersonForm> form) {
        return
    }
}


