package se.lexicon.todo_it_api.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TodoItemForm {
    private String title;
    private String description;
    private LocalDate deadLine;
    private boolean done;
}
