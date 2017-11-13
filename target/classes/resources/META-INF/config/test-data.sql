insert into contact (first_name, last_name, birth_date) values
    ('Chris', 'Schaefer', '1981-05-03');
insert into contact (first_name, last_name, birth_date) values
    ('Scott', 'Tiger', '1990-11-02');
insert into contact (first_name, last_name, birth_date) values
    ('John', 'Smith', '1964-02-28');

    
insert into BOOK (category_name, isbn, title, publisher, price) values ('Design Patters', '0201633612', 'Design Patterns: Elements of Reusable Object-Oriented Software', 'Addison-Wesley', '48.31');
insert into BOOK (category_name, isbn, title, publisher, price) values ('Design Patters', '1449331491', 'Head First Design Patterns: A Brain-Friendly Guide', 'O'Reilly Media, Inc', '40.79');
insert into BOOK (category_name, isbn, title, publisher, price) values ('Java', '0596552440', 'Hardcore Java', '17.27');
insert into BOOK (category_name, isbn, title, publisher, price) values ('Java', '0071808566', 'Java: The Complete Reference, Ninth Edition', '36.14');
insert into BOOK (category_name, isbn, title, publisher, price) values ('Scala', '1498759688', 'Introduction to the Art of Programming Using Scala', '70.36');
insert into BOOK (category_name, isbn, title, publisher, price) values ('Spring Framework', '1430265337', 'Introducing Spring Framework: A Primer', '31.72');
insert into BOOK (category_name, isbn, title, publisher, price) values ('Spring Framework', '1847195431', 'Spring Web Flow 2 Web Development', '14.59');

CREATE TABLE BOOK (
    ID INT NOT NULL AUTO_INCREMENT
    , CATEGORY_NAME VARCHAR(100) NOT NULL
    , ISBN VARCHAR(10) NOT NULL
 	, TITLE VARCHAR(200) NOT NULL
 	, PUBLISHER VARCHAR(100) NOT NULL
    , VERSION INT NOT NULL DEFAULT 0
    , PRICE DECIMAL(4,2) NOT NULL
    , UNIQUE UQ_BOOK_1 (ISBN)
    , PRIMARY KEY (ID)
);
