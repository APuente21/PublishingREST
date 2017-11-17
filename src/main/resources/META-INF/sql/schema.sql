CREATE DATABASE PublishingREST;
USE PublishingREST;

DROP TABLE IF EXISTS BOOK;

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