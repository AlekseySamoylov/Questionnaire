package com.alekseysamoylov.questionnaire.test.repository;

import com.alekseysamoylov.questionnaire.entity.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * Test repository Data rest
 */
@RestResource(path = "companies", rel = "companies")
public interface CompanyRepository extends CrudRepository<Company, Long> {

    List<Company> findAll();
}
