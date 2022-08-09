package com.techprimers.graphql.springbootgraphqlexample.resource;

import com.techprimers.graphql.springbootgraphqlexample.model.Book;
import com.techprimers.graphql.springbootgraphqlexample.model.BookDetailInput;
import com.techprimers.graphql.springbootgraphqlexample.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import org.springframework.stereotype.Controller;


import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

@Controller
//@RequestMapping("/rest/graphql")
public class BookController {

    @Autowired
    private BookRepository bookRepository;



    @QueryMapping
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    @QueryMapping
    public Book book(@Argument String isn) {
        return bookRepository.findById(isn).get();
    }

    @MutationMapping
    public Book createBook(@Argument BookDetailInput bookDetailInput) {

       // bookRepository.save(new Book(bookDetailInput.getIsn(), bookDetailInput.getTitle(), bookDetailInput.getPublisher()
        //, null, null));
       // return bookRepository.findById(bookDetailInput.getIsn()).get();
    	return new Book();
    }

    @PostConstruct
    void loadSchema() throws IOException {

        //Load Books into the Book Repository
        loadDataIntoHSQL();


    }

    private void loadDataIntoHSQL() {/*

        Stream.of(
                new Book("123", "Book of Clouds", "Kindle Edition",
                        new String[] {
                                "Chloe Aridjis"
                        }, "Nov 2017"),
                new Book("124", "Cloud Arch & Engineering", "Orielly",
                        new String[] {
                                "Peter", "Sam"
                        }, "Jan 2015"),
                new Book("125", "Java 9 Programming", "Orielly",
                        new String[] {
                                "Venkat", "Ram"
                        }, "Dec 2016")
        ).forEach(book -> {
            bookRepository.save(book);
        });
    */}
}
