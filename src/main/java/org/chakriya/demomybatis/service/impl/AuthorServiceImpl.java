package org.chakriya.demomybatis.service.impl;
import org.chakriya.demomybatis.Model.entity.AuthorEntity;
import org.chakriya.demomybatis.repository.AuthorRepository;
import org.chakriya.demomybatis.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<AuthorEntity> getAll() {
        return  authorRepository.getAll();
    }

    @Override
    public AuthorEntity getAuthorById(Integer authorId) {
        return authorRepository.getAuthorById(authorId);
    }

//    @Override
//    public AuthorEntity saveAuthor(@RequestBody AuthorRequest authorRequest) {
//        return authorRepository.saveAuthor(authorRequest);
//    }


}
