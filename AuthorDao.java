package com.example.wap.daos;

import com.example.wap.models.Author;
import com.example.wap.models.Book;
import com.example.wap.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@Component
@RestController
public class AuthorDao {
  @Autowired
  AuthorRepository authorRepository;
  @GetMapping("/findAllAuthors")
  public Iterable<Author> findAllAuthors() {
    return authorRepository.findAll();
  }
  @GetMapping("/findAuthorById/{id}")
  public Author findAuthorById(
          @PathVariable("id") Integer id) {
    return authorRepository.findById(id).get();
  }
  @GetMapping("/deleteAuthor/{id}")
  public void deleteAccount(
          @PathVariable("id") Integer id) {
    authorRepository.deleteById(id);
  }
  @GetMapping("/createAuthor")
  public Author createAuthor() {
    Author author = new Author();
    author.setName("New Name");
    return authorRepository.save(author);
  }
  @GetMapping("/renameAuthor/{id}/{newName}")
  public  Author renameAuthor(
          @PathVariable("id") Integer id,
          @PathVariable("newName") String newName) {
    Author author = authorRepository.findById(id).get();
    author.setName(newName);
    return authorRepository.save(author);
  }
}
