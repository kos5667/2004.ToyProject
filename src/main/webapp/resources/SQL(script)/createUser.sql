/*[sqlpus ������Ʈ���� �Ʒ��� ���� �ۼ��Ͽ� ������ ������ �ش�.]*/
ALTER SESSION SET "_ORACLE_SCRIPT"=TRUE;

/* CREATE USER */
CREATE USER TP IDENTIFIED BY 1234;

/* ���Ѻο� */
GRANT CREATE SESSION, CONNECT RESOURCE, DBA TO TP;

/* �ش� ���̺� �����̽��� �뷮 ���Ѿ��� ��� ���� */
--ALTER USER TP DEFAULT TABLESPACE USERS QUOTA UNLIMITED ON USERS;