package se.lexicon.todo_it_api.converter;

import java.util.Collection;
import java.util.List;

public interface Converter <E, D, F>{

    D toDto(E entity);
    E toEntity (F Form);
    List<D> toDto(List<E> entities);
    List<E> toEntities(List<F> form);


}
