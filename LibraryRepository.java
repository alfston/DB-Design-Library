package com.example.wap.repositories;

import com.example.wap.models.Item;
import com.example.wap.models.Library;
import org.springframework.data.repository.CrudRepository;

public interface LibraryRepository extends CrudRepository<Library, Integer> {
}
