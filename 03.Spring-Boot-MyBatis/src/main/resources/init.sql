show databases;
create database test;
use test;
CREATE TABLE STUDENT (
    SNO VARCHAR(3) NOT NULL ,
    SNAME VARCHAR(9) NOT NULL ,
    SSEX CHAR(2) NOT NULL
);
INSERT INTO STUDENT VALUES ('001', 'KangKang', 'M ');
INSERT INTO STUDENT VALUES ('002', 'Mike', 'M ');
INSERT INTO STUDENT VALUES ('003', 'Jane', 'F ');