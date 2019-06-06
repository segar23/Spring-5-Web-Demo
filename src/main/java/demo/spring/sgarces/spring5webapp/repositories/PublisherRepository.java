package demo.spring.sgarces.spring5webapp.repositories;

import demo.spring.sgarces.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
