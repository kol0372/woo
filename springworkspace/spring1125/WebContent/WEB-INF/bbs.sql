CREATE TABLE bbs1(
num NUMBER CONSTRAINT bbs1_num_pk PRIMARY key,
sub VARCHAR2(50),
writer VARCHAR2(34),
pwd VARCHAR2(10),
cont VARCHAR2(400),
reip VARCHAR2(34),
hit NUMBER(3),
regdate date);