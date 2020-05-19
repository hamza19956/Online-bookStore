package com.bookstore.onlinebookstore.Config;

import com.bookstore.onlinebookstore.Model.Book;
import com.bookstore.onlinebookstore.Model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;
import javax.swing.text.html.parser.Entity;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {
    @Autowired
    EntityManager entityManager;
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        //manual solution
            //config.exposeIdsFor(Book.class);
            //config.exposeIdsFor(Category.class);

        //or automatic for all new created entity
        config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType).toArray(Class[]::new));
        config.getCorsRegistry().addMapping("/**").allowedOrigins("http://localhost:4200");
    }
}
