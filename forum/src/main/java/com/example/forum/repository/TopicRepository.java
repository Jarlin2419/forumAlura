package com.example.forum.repository;

import com.example.forum.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    boolean existsByTitleAndMessage(String title, String message);

    List<Topic> findTop10ByOrderByCreatedAtAsc();

    @Query("SELECT t FROM Topic t WHERE t.courseName = :courseName AND t.year = :year")
    List<Topic> findByCourseNameAndYear(String courseName, int year);
}
