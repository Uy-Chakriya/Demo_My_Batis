package org.chakriya.demomybatis.repository;
import org.apache.ibatis.annotations.*;
import org.chakriya.demomybatis.Model.entity.AuthorEntity;
import java.util.List;

@Mapper
public interface AuthorRepository {

    @Results(id = "authorMapper" , value = {
            @Result(property = "authorId" , column = "author_id"),
            @Result(property = "authorName" , column = "author_name"),
            @Result(property = "authorGender" , column = "author_gender")
    })
    @Select("""
    select * from author;""")
    public List<AuthorEntity> getAll();


    @ResultMap("authorMapper")
    @Select("""
        select * from author where author_id = #{authorId} ;
        """)
    public AuthorEntity getAuthorById(Integer authorId);

//    @Select("""
//        insert into author value(default,#{authorName}, #{authorGender} );
//        """
//    )
//    public List<AuthorEntity> saveAuthor(AuthorEntity author);

}




