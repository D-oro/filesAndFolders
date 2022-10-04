package com.example.codeclan.FilesAndFolders.repositories;

import com.example.codeclan.FilesAndFolders.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}