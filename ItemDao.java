package com.example.wap.daos;
import com.example.wap.models.Item;
import com.example.wap.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemDao {
  @Autowired
  ItemRepository itemRepository;
  @GetMapping("/findAllItems")
  public Iterable<Item> findAllItems() {
    return itemRepository.findAll();
  }
  @GetMapping("/findItemById/{id}")
  public Item findItemById(@PathVariable("id") Integer id) {
    return itemRepository.findById(id).get();
  }
  @GetMapping("/deleteItem/{id}")
  public void deleteItem(@PathVariable("id") Integer id) {
    itemRepository.deleteById(id);
  }
  @GetMapping("/createItem")
  public Item createItem() {
    Item item = new Item();
    item.setISBN("New Item");
    return itemRepository.save(item);
  }
  @GetMapping("/renameItem/{id}/{newTitle}")
  public Item renameItem(@PathVariable("id")
                                   Integer id, @PathVariable("newTitle") String newTitle) {
    Item item = itemRepository.findById(id).get();
    item.setISBN(newTitle);
    return itemRepository.save(item);
  }

}

