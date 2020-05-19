package com.bookstore.onlinebookstore.Repository;

import com.bookstore.onlinebookstore.Model.Book;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

//Changing default rest repository path
//@RepositoryRestResource(collectionResourceRel = "categories",path = "Enter your path")
//@CrossOrigin ("http://localhost:4200") spec our host ,or for real time project ("*") for multiple host

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    @RestResource(path = "categoryId")
    Page<Book> findBooksByBookCategoryId(@Param("id") Long id, Pageable pageable);
}
