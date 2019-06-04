package demo.spring.sgarces.spring5webapp.repositories;

import demo.spring.sgarces.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
