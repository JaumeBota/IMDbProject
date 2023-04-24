DROP TABLE IF EXISTS MOVIES;
DROP TABLE IF EXISTS SEARCH;

CREATE TABLE MOVIES(
    SearchType TEXT,
    Expression TEXT,
    ErrorMessage TEXT,
    PRIMARY KEY (SearchType, Expression)
);
CREATE TABLE SEARCH(
    Id varchar(10),
    ResultType TEXT,
    Image varbinary(max),
    Title TEXT,
    Description TEXT,
    SearchType TEXT,
    Expression TEXT,
    PRIMARY KEY (Id),
    FOREIGN KEY (SearchType, Expression) REFERENCES MOVIES (SearchType, Expression) ON DELETE CASCADE
);