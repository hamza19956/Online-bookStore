package com.bookstore.onlinebookstore.Repository;

import com.bookstore.onlinebookstore.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

//Changing default rest repository path
//@RepositoryRestResource(collectionResourceRel = "categories",path = "Enter your path")
@CrossOrigin ("http://localhost:4200") // spec our host ,or for real time project ("*") for multiple host
public interface BookRepository extends JpaRepository<Book,Long> {
}
