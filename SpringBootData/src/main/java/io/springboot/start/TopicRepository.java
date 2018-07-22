package io.springboot.start;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface TopicRepository extends JpaRepository<Topic, Integer> {

}
