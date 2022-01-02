package com.firesolution.sweater.repo;

import com.firesolution.sweater.domain.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    Page<Message> findByTagContainsIgnoreCase(String tag, Pageable pageable);

    Page<Message> findAll(Pageable pageable);
}
