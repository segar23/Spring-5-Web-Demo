package demo.spring.sgarces.spring5webapp.controllers;

import demo.spring.sgarces.spring5webapp.repositories.BookRespository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private BookRespository bookRespository;

    public BookController(BookRespository bookRespository) {
        this.bookRespository = bookRespository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRespository.findAll());

        return "books";
    }
}
