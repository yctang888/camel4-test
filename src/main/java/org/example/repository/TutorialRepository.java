package org.example.repository;

import org.example.model.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Anthony Tang
 * <p>
 * Lenovo PCCW Solutions Limited
 * @created 01/12/2023 - 12:11 pm
 * @project camel4-test
 */
public interface TutorialRepository extends MongoRepository<Tutorial, String> {
    List<Tutorial> findByTitleContaining(String title);
    List<Tutorial> findByPublished(boolean published);
}