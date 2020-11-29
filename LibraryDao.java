package com.example.wap.daos;
import com.example.wap.models.Item;
import com.example.wap.models.Library;
import com.example.wap.repositories.ItemRepository;
import com.example.wap.repositories.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryDao {
  @Autowired
  LibraryRepository libraryRepository;
  @GetMapping("/findAllLibraries")
  public Iterable<Library> findAllLibraries() {
    return libraryRepository.findAll();
  }
  @GetMapping("/findLibraryById/{id}")
  public Library findLibraryById(@PathVariable("id") Integer id) {
    return libraryRepository.findById(id).get();
  }
  @GetMapping("/deleteLibrary/{id}")
  public void deleteLibrary(@PathVariable("id") Integer id) {
    libraryRepository.deleteById(id);
  }
  @GetMapping("/createLibrary")
  public Library createLibrary() {
    Library library = new Library();
    library.setName("New Library");
    return libraryRepository.save(library);
  }
  @GetMapping("/renameLibrary/{id}/{newTitle}")
  public Library renameLibrary(@PathVariable("id")
                                 Integer id, @PathVariable("newTitle") String newTitle) {
    Library library = libraryRepository.findById(id).get();
    library.setName(newTitle);
    return libraryRepository.save(library);
  }
}
