package org.chakriya.demomybatis.service;
import org.chakriya.demomybatis.Model.entity.AuthorEntity;
import java.util.List;
public interface AuthorService{
    List<AuthorEntity> getAll();


    AuthorEntity getAuthorById(Integer authorId);

//    AuthorEntity saveAuthor();
}


