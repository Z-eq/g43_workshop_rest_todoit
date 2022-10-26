package se.lexicon.todo_it_api.converter;

import se.lexicon.todo_it_api.dto.PersonDto;
import se.lexicon.todo_it_api.form.PersonForm;
import se.lexicon.todo_it_api.model.entity.Person;

import java.util.List;
import java.util.stream.Collectors;

public class PersonConverter  implements Converter <Person, PersonDto, PersonForm> {

    @Override
    public PersonDto toDto(Person entity) {
        return new PersonDto(entity.getFirstName(), entity.getLastName(), entity.getBirthDate());
    }

    @Override
    public Person toEntity(PersonForm form) {
        return new Person(form.getFirstName(), form.getLastName(),form.getBirthDate());
    }

    @Override
    public List<PersonDto> toDto(List<Person> entities) {
        return entities.stream().map(this::toDto).collect(Collectors.toList());
    }

    @Override
    public List<Person> toEntities(List<PersonForm> form) {
        return form.stream().map(this::toEntity).collect(Collectors.toList());
    }
}
