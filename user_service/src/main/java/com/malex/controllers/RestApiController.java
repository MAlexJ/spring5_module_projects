package com.malex.controllers;

import com.malex.exceptions.UserServiceException;
import com.open.api.LibraryApi;
import com.open.models.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestApiController implements LibraryApi {

    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary() {
        Book b = new Book();
        b.name("name");
        b.bookAuthor("Malex");
        ArrayList<Book> books = new ArrayList<>();
        books.add(b);

        if(true) throw new UserServiceException("Errorrr");
        return ResponseEntity.ok(books);
    }
}
