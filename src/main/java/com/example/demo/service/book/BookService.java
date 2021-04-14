package com.example.demo.service.book;

import com.example.demo.model.Book;
import com.example.demo.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService {

    @Autowired
    IBookRepository IBookRepository;

    @Override
    public List<Book> findAll() {
        return (List<Book>) IBookRepository.findAll();
    }

    @Override
    public Book findById(Long id) {
        return IBookRepository.findById(id).get();
    }

    @Override
    public Book save(Book book) {
        return IBookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        IBookRepository.deleteById(id);
    }

}
