package com.example.wap.daos;
import com.example.wap.models.Librarian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.wap.repositories.LibrarianRepository;

@RestController
public class LibrarianDao {
  @Autowired
  LibrarianRepository librarianRepository;
  @GetMapping("/findAllLibrarians")
  public Iterable<Librarian> findAllLibrarians() {
    return librarianRepository.findAll();
  }
  @GetMapping("/findLibrarianById/{id}")
  public Librarian findLibrarianById(
          @PathVariable("id")Integer id) {
    return librarianRepository.findById(id).get();
  }
  @GetMapping("/deleteLibrarian/{id}")
  public void deleteLibrarian(
          @PathVariable("id")Integer id) {
    librarianRepository.deleteById(id);
  }

  @GetMapping("/renameLibrarianPosition/{id}/{newPosition}")
  public Librarian renameLibrarianPosition(
          @PathVariable("id") Integer id,
          @PathVariable("newPosition") String newPosition) {
    Librarian librarian = librarianRepository.findById(id).get();
    librarian.setPosition(newPosition);
    return librarianRepository.save(librarian);
  }

}

