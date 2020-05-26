------------------------------------------------COMM001------------------------------------------------
INSERT INTO COMM001
(CODE, CONTENT)
VALUES ('A001', 'ADMIN');

INSERT INTO COMM001
(CODE, CONTENT)
VALUES ('A001', 'MANAGER');

INSERT INTO COMM001
(CODE, CONTENT)
VALUES ('A001', 'USER');

------------------------------------------------USERS------------------------------------------------
INSERT INTO USERS 
(USER_NO,USER_ID,USER_PW,USER_NAME,SEX,BIRTH,EMAIL,PHONE_NO,USER_ZCODE,ADDR1,ADDR2,CREATEDATE,UPDATEDATE,LASTLOGIN,USER_USE,CART,CODE)
VALUES
(0,'admin','1234','관리자',0,'1993-10-25','admin@naver.com','010-0000-0000','0000','경기도','성남시',SYSDATE,SYSDATE,SYSDATE,1,'','A001');
----------------------------------------------PRODUCTS-----------------------------------------------
--------------------------------------------TRANSACTION----------------------------------------------
