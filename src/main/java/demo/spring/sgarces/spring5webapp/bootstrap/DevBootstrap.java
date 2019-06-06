package demo.spring.sgarces.spring5webapp.bootstrap;

import demo.spring.sgarces.spring5webapp.model.Author;
import demo.spring.sgarces.spring5webapp.model.Book;
import demo.spring.sgarces.spring5webapp.model.Publisher;
import demo.spring.sgarces.spring5webapp.repositories.AuthorRepository;
import demo.spring.sgarces.spring5webapp.repositories.BookRespository;
import demo.spring.sgarces.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRespository bookRespository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRespository bookRespository,
                        PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRespository = bookRespository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        //Eric
        Author eric = new Author("Eric", "Evans");
        Publisher harper = new Publisher("Harper Collins", "WL");
        Book ddd = new Book("Domain Driven Design", "1234", harper);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        publisherRepository.save(harper);
        bookRespository.save(ddd);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Publisher worx =  new Publisher("Worx", "WL");
        Book noEJB = new Book("J2EE Development without EJB", "23444", worx);
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        publisherRepository.save(worx);
        bookRespository.save(noEJB);
    }
}
