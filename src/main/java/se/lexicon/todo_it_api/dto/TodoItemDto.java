package se.lexicon.todo_it_api.dto;

import lombok.*;
import se.lexicon.todo_it_api.model.entity.Person;

import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString


public class TodoItemDto {

    private String title;
    private String description;
    private LocalDate deadLine;
    private boolean done;



}
