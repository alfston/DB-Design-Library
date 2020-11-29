package com.example.wap.daos;
import com.example.wap.models.Patron;
import com.example.wap.repositories.PatronRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatronDao {
  @Autowired
  PatronRepository patronRepository;

  @GetMapping("/findAllPatrons")
  public Iterable<Patron> findAllPatrons() {
    return patronRepository.findAll();
  }

  @GetMapping("/findPatronById/{id}")
  public Patron findPatronById(
          @PathVariable("id") Integer id) {
    return patronRepository.findById(id).get();
  }

  @GetMapping("/deletePatron/{id}")
  public void deletePatron(
          @PathVariable("id") Integer id) {
    patronRepository.deleteById(id);
  }

  @GetMapping("/renameAddress/{id}/{newAddress}")
  public Patron renameAddress(
          @PathVariable("id") Integer id,
          @PathVariable("newAddress") String newAddress) {
    Patron Patron = patronRepository.findById(id).get();
    Patron.setAddress(newAddress);
    return patronRepository.save(Patron);
  }

  @GetMapping("/renamePhoneNumber/{id}/{newPhoneNumber}")
  public Patron renamePhoneNumber(
          @PathVariable("id") Integer id,
          @PathVariable("newPhoneNumber") String newPhoneNumber) {
    Patron Patron = patronRepository.findById(id).get();
    Patron.setphone_number(newPhoneNumber);
    return patronRepository.save(Patron);
  }


}