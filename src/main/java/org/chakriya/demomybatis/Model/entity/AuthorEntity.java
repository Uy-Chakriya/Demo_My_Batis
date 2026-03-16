package org.chakriya.demomybatis.Model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorEntity{
    int authorId;
    String authorName;
    String authorGender;

}
