package se.lexicon.todo_it_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.lexicon.todo_it_api.converter.PersonConverter;
import se.lexicon.todo_it_api.data.PersonDAO;
import se.lexicon.todo_it_api.dto.PersonDto;
import se.lexicon.todo_it_api.form.PersonForm;
import se.lexicon.todo_it_api.model.entity.Person;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonDAO pDao;

    PersonConverter pConv = new PersonConverter();

    @Override
    public PersonDto create(PersonForm p) {
        Person person = pConv.toEntity(p);
        pDao.save(person);
        PersonDto pDto = pConv.toDto(person);
        return pDto;
    }
    @Override
    public PersonDto findById(Integer id) {
        PersonDto p = new PersonDto();
        Optional<Person> foundPerson = pDao.findById(id);
        if (foundPerson.isPresent()) {
            pConv.toDto(foundPerson.get());
            return p;
        } else {
            return null;
        }
    }

    @Override
    public List<PersonDto> findAll() {
        List<Person> found = pDao.findAll();
        List<PersonDto> listOfFound = pConv.toDto(found);
        return listOfFound;
    }
    @Override
    public List<PersonDto> findIdlePeople() {
        List<Person> found = pDao.findIdlePeople();
        List<PersonDto> listOfIdle = pConv.toDto(found);
        return listOfIdle;
    }
    @Override
    public PersonDto update(Integer id, PersonForm pForm) {
        Optional<Person> found = pDao.findById(id);
        if(found.isPresent()) {
            Person p = found.get();
            p.setFirstName(pForm.getFirstName());
            p.setLastName(pForm.getLastName());
            p.setBirthDate(pForm.getBirthDate());
            Person pSaved = pDao.save(p);
            PersonDto pDto = pConv.toDto(pSaved);
            return pDto;
        } else {
            return null;
        }
    }
    @Override
    public boolean delete(Integer id) {
        return false;
    }
    @Override
    PersonDto addTodoItem(Integer id, Integer num);
    @Override
    PersonDto removeTodoItem(Integer id);
}




}
