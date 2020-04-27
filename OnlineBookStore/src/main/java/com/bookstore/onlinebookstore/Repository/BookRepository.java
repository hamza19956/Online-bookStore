package com.bookstore.onlinebookstore.Repository;

import com.bookstore.onlinebookstore.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//Changing default rest repository path
//@RepositoryRestResource(collectionResourceRel = "categories",path = "Enter your path")
public interface BookRepository extends JpaRepository<Book,Long> {
}
