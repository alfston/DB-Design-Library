package com.example.wap.repositories;

import com.example.wap.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository
        extends CrudRepository<Author, Integer> {
}
