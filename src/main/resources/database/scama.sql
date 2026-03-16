create table if not exists author(
                                     author_id serial primary key not null ,
                                     author_name varchar(100),
                                     author_gender varchar(10)

);
