--OLD SCRIPTS
    --DDL
        DROP TABLE CUSTOMER;
        CREATE TABLE CUSTOMER (
        ID NUMBER(11) NOT NULL,
        FIRST_NAME VARCHAR(45) DEFAULT NULL,
        LAST_NAME VARCHAR(45) DEFAULT NULL,
        EMAIL VARCHAR(45) DEFAULT NULL,
        PRIMARY KEY (ID)
        );
    --SEQUENCE    
        DROP SEQUENCE CUSTOMER_ID_SEQ;
        CREATE SEQUENCE CUSTOMER_ID_SEQ;
        
    --DML
        DELETE  FROM CUSTOMER;
        INSERT INTO CUSTOMER (ID,FIRST_NAME,LAST_NAME, EMAIL) VALUES (CUSTOMER_ID_SEQ.NEXTVAL, 'David','Goggins','d@g.com');
        INSERT INTO CUSTOMER (ID,FIRST_NAME,LAST_NAME, EMAIL) VALUES (CUSTOMER_ID_SEQ.NEXTVAL,'Ekhart','Tolle','e@t.com');
--        INSERT INTO CUSTOMER VALUES (1,'David','Goggins','d@g.com');
--        INSERT INTO CUSTOMER VALUES (2,'Ekhart','Tolle','e@t.com');  
        COMMIT;
    --QUERY
        SELECT * FROM CUSTOMER;
