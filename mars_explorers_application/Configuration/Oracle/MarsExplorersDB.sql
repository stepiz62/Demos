  CREATE USER myDbSchema IDENTIFIED BY JotyAdmin ;

-- ROLES
GRANT CREATE SESSION TO myDbSchema WITH ADMIN OPTION;
GRANT CREATE USER TO myDbSchema WITH ADMIN OPTION;
GRANT CREATE TABLE TO myDbSchema WITH ADMIN OPTION;
GRANT CREATE SEQUENCE TO myDbSchema WITH ADMIN OPTION;


GRANT UNLIMITED TABLESPACE TO myDbSchema;

CREATE USER Admin IDENTIFIED BY JotyAdmin ;
CREATE USER user1 IDENTIFIED BY JotyUser1 ;
CREATE USER user2 IDENTIFIED BY JotyUser2 ;

-- create ora role
create role schema_rw_role;
-- grant roles to admin
GRANT schema_rw_role, CONNECT, DBA TO Admin WITH ADMIN OPTION;
GRANT schema_rw_role, CONNECT TO user1;
GRANT schema_rw_role, CONNECT TO user2;

alter session set current_schema = myDbSchema;

CREATE TABLE AppUser
  (
    userName       VARCHAR2(30 BYTE),
    lastName       VARCHAR2(20 BYTE),
    firstName      VARCHAR2(20 BYTE),
    forcePwdChange NUMBER(5,0) DEFAULT 1,
    updatePwdDate  DATE,
    password VARCHAR2(50 BYTE),
    ID number not null
  );
  
CREATE TABLE Role
  (
    ID number not null,
    name               VARCHAR2(30 BYTE),
    Description       VARCHAR2(50 BYTE)
 );
 
CREATE TABLE UserRole
  (
    userID number not null,
    roleID number
  );
  
Insert into AppUser (USERNAME,LASTNAME,FIRSTNAME,FORCEPWDCHANGE,UPDATEPWDDATE,PASSWORD,ID) values ('admin','admin','admin',0,SYSDATE,'9a590183c06bd2a855dcdfda4d46b5cf',1);
Insert into AppUser (USERNAME,LASTNAME,FIRSTNAME,FORCEPWDCHANGE,UPDATEPWDDATE,PASSWORD,ID) values ('user1',null,null,0,SYSDATE,'43aaf24bb96430f4f570e6b2d0c4398c',2);
Insert into AppUser (USERNAME,LASTNAME,FIRSTNAME,FORCEPWDCHANGE,UPDATEPWDDATE,PASSWORD,ID) values ('user2',null,null,0,SYSDATE,'dce3a4a848d3258fc3e69c35062adf7b',3);
  
INSERT INTO Role ( name, Description , ID ) VALUES ('Administrators', 'Application user administrators', 1);
INSERT INTO Role ( name, Description , ID ) VALUES ('Powered Users', 'Application writers', 2);
INSERT INTO Role ( name, Description , ID ) VALUES ('Limited Users', 'Application readers', 3);
  
INSERT INTO UserRole ( USERID, ROLEID ) VALUES ( 1, 1 ); 
INSERT INTO UserRole ( USERID, ROLEID ) VALUES ( 2, 2 ); 
INSERT INTO UserRole ( USERID, ROLEID ) VALUES ( 3, 3 ); 
  
CREATE SEQUENCE mySeq MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 1065 CACHE 20 NOORDER NOCYCLE ;  
 
CREATE TABLE Candidate
  (
      ID number not null,
      FirstName  VARCHAR2(32 BYTE),
      LastName  VARCHAR2(32 BYTE),
      MobilePhone  VARCHAR2(32 BYTE),
      City  VARCHAR2(32 BYTE),
      Children  number,
      DocObj BLOB, 
      Image BLOB,
      ImagePreview BLOB,
      Image2 BLOB,
      ImagePreview2 BLOB,
      DateOfBirth DATE,
      NextEvent TIMESTAMP
      );

INSERT INTO Candidate (ID,FIRSTNAME,LASTNAME,MOBILEPHONE,CITY,CHILDREN) VALUES (1,'Sebastian','Brinkerhoff','866-777-7217','Syracuse',2);
INSERT INTO Candidate (ID,FIRSTNAME,LASTNAME,MOBILEPHONE,CITY,CHILDREN) VALUES (2,'Alexandros','Erasmus','866-777-7717','Syracuse',0);
INSERT INTO Candidate (ID,FIRSTNAME,LASTNAME,MOBILEPHONE,CITY,CHILDREN) VALUES (3,'Carmen','Fernandez','866-777-7737','Auburn',2);

CREATE TABLE ShipSeat
  (
    ID number not null,
	CandidateID number
  );
  
INSERT INTO ShipSeat (ID, CandidateID) VALUES (1, null);
INSERT INTO ShipSeat (ID, CandidateID) VALUES (2, null);
INSERT INTO ShipSeat (ID, CandidateID) VALUES (3, null);
INSERT INTO ShipSeat (ID, CandidateID) VALUES (4, null);

CREATE TABLE Employed
  (
	CandidateID number
  );

CREATE TABLE ValuedCandidate (
	ExtID NUMBER NOT NULL,
	PreviousID NUMBER,
	NextID NUMBER
);

commit;

GRANT SELECT ON mySeq TO schema_rw_role;

DECLARE
  data VARCHAR(1000);
BEGIN
  FOR dt IN (SELECT table_name FROM all_tables WHERE OWNER='MYDBSCHEMA')
  LOOP
    data := 'GRANT SELECT, INSERT, UPDATE, DELETE  ON ' || dt.table_name || ' TO schema_rw_role';
   EXECUTE immediate data;
  END LOOP;
END;  

create or replace trigger APPUSER_autoId  
   before insert on "MYDBSCHEMA"."APPUSER" 
   for each row 
begin  
   if inserting then 
      if :NEW."ID" is null then 
         select MYSEQ.nextval into :NEW."ID" from dual; 
      end if; 
   end if; 
end;

create or replace trigger CANDIDATE_autoId  
   before insert on "MYDBSCHEMA"."CANDIDATE" 
   for each row 
begin  
   if inserting then 
      if :NEW."ID" is null then 
         select MYSEQ.nextval into :NEW."ID" from dual; 
      end if; 
   end if; 
end;

create or replace trigger ROLE_autoId  
   before insert on "MYDBSCHEMA"."ROLE" 
   for each row 
begin  
   if inserting then 
      if :NEW."ID" is null then 
         select MYSEQ.nextval into :NEW."ID" from dual; 
      end if; 
   end if; 
end;

create or replace trigger SHIPSEAT_autoId  
   before insert on "MYDBSCHEMA"."SHIPSEAT" 
   for each row 
begin  
   if inserting then 
      if :NEW."ID" is null then 
         select MYSEQ.nextval into :NEW."ID" from dual; 
      end if; 
   end if; 
end;

