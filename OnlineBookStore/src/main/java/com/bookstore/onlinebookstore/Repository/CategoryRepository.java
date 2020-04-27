package com.bookstore.onlinebookstore.Repository;

import com.bookstore.onlinebookstore.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
