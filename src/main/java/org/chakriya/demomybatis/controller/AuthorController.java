//Me

package org.chakriya.demomybatis.controller;

import org.chakriya.demomybatis.Model.entity.AuthorEntity;
import org.chakriya.demomybatis.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/api/author")
public class AuthorController {

    private final AuthorService authorService;
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public List<AuthorEntity> getAll(){
        return authorService.getAll();
    }

    @GetMapping("{author_id}")
    public AuthorEntity getAuthorById(@PathVariable("author_id") Integer id){
        return authorService.getAuthorById(id);
    }
}
