DROP TABLE USERS;	

CREATE TABLE USERS 
(	    
	USER_NO		NUMBER(10)		NOT NULL,
    USER_ID 	VARCHAR2(50) 	NOT NULL,
    USER_PW 	VARCHAR2(6) 	NOT NULL,
    USER_NAME 	VARCHAR2(20) 	NOT NULL,
    USER_GEN 	VARCHAR2(6) 	NOT NULL,
    USER_BIR 	DATE 			NOT NULL,
    USER_MAIL 	VARCHAR2(20) 	NOT NULL,
    USER_PNUM 	VARCHAR2(20) 	NOT NULL,
    USER_ZCODE 	VARCHAR2(20) 	NOT NULL,
    USER_ADDR1 	VARCHAR2(50) 	NOT NULL,
    USER_ADDR2 	VARCHAR2(50) 	NOT NULL,
    USER_CREATEDATE DATE 		NOT NULL,
    USER_UPDATEDATE DATE 		NOT NULL,
    USER_LASTLOGINDATE DATE 	NOT NULL,
    USER_USE CHAR(1) 			NOT NULL,
    
  	CONSTRAINT USER_PK PRIMARY KEY (USER_NO,USER_ID)
); 
	
COMMENT ON COLUMN USERS.USER_NO IS '회원 NO';
COMMENT ON COLUMN USERS.USER_ID IS '회원 ID';
COMMENT ON COLUMN USERS.USER_PW IS '회원 PASSWORD';
COMMENT ON COLUMN USERS.USER_NAME IS '회원 이름';
	
INSERT INTO USERS 
(USER_ID,USER_PW,USER_NAME,USER_GEN,USER_BIR,USER_MAIL,USER_PNUM,USER_ZCODE,USER_ADDR1,USER_ADDR2,USER_CREATEDATE,USER_UPDATEDATE,USER_LASTLOGINDATE,USER_USE)
VALUES
(3,'1','1','1',SYSDATE,'THEMAPISTO@NAVER.COM','010-4843-6130',1234,'경기도','성남시',SYSDATE,SYSDATE,SYSDATE,'N');
  
CREATE TABLE products
(
	PRODUCT_NO	NUMBER(10)	NOT NULL,
	PRODUCT_ID	VARCHAR2(20)	NOT NULL,
	
);
COMMIT;