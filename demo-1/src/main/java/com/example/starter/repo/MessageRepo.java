package com.example.starter.repo;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

import com.example.starter.db.Message;

public interface MessageRepo extends CrudRepository<Message, Long> {

	List<Message> findByTag(String tag);
	
}
