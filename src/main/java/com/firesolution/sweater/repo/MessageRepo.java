package com.firesolution.sweater.repo;

import com.firesolution.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTagContainsIgnoreCase(String tag);
}
