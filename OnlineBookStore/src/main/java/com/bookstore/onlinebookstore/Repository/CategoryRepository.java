package com.bookstore.onlinebookstore.Repository;

import com.bookstore.onlinebookstore.Model.Category;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin("http://localhost:4200") or auto config in configuration folder
@RepositoryRestResource(collectionResourceRel = "categories" , path = "book-category")
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
