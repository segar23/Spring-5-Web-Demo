package demo.spring.sgarces.spring5webapp.repositories;

import demo.spring.sgarces.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRespository extends CrudRepository<Book, Long> {
}
