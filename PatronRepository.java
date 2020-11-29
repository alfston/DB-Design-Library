
package com.example.wap.repositories;

import com.example.wap.models.Patron;
import org.springframework.data.repository.CrudRepository;

public interface PatronRepository
        extends CrudRepository<Patron, Integer> {
}
