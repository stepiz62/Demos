CREATE DATABASE MarsExplorersDB
GO

CREATE LOGIN [Admin] WITH PASSWORD='JotyAdmin', DEFAULT_DATABASE=[MarsExplorersDB]; 
GO

EXEC sys.sp_addsrvrolemember @loginame = N'Admin', @rolename = N'sysadmin'
GO

USE [MarsExplorersDB]
GO

CREATE USER [Admin] FOR LOGIN [Admin] WITH DEFAULT_SCHEMA=[dbo]; 
GO

GRANT SELECT, INSERT, UPDATE, DELETE ON SCHEMA :: dbo TO [Admin]  WITH GRANT OPTION;

GO

CREATE LOGIN [user1] WITH PASSWORD='JotyUser1', DEFAULT_DATABASE=[MarsExplorersDB]; CREATE USER [user1] FOR LOGIN [user1] WITH DEFAULT_SCHEMA=[dbo];

GO
CREATE LOGIN [user2] WITH PASSWORD='JotyUser2', DEFAULT_DATABASE=[MarsExplorersDB]; CREATE USER [user2] FOR LOGIN [user2] WITH DEFAULT_SCHEMA=[dbo];
GO

GRANT SELECT, INSERT, UPDATE, DELETE  ON SCHEMA :: dbo  TO user1;
GO
GRANT SELECT, INSERT, UPDATE, DELETE  ON SCHEMA :: dbo  TO user2;
GO

CREATE TABLE [AppUser]
  (
    userName       VARCHAR(30),
    lastName       VARCHAR(20),
    firstName      VARCHAR(20),
    forcePwdChange SMALLINT DEFAULT 1,
    updatePwdDate  DATE,
    password VARCHAR(50),
    ID INTEGER not null IDENTITY,
    PRIMARY KEY (id)
  );
 GO 
  
CREATE TABLE [Role]
  (
    ID INTEGER not null IDENTITY,
    PRIMARY KEY (id),
    name               VARCHAR(30),
    Description       VARCHAR(50)
 );
GO 
  
CREATE TABLE [UserRole]
  (
    userID INTEGER not null,
    roleID INTEGER
  );
GO

SET IDENTITY_INSERT [AppUser] ON;
Insert into AppUser (USERNAME,LASTNAME,FIRSTNAME,FORCEPWDCHANGE,UPDATEPWDDATE,PASSWORD,ID) values ('admin','admin','admin',0,GETDATE(),'9a590183c06bd2a855dcdfda4d46b5cf',1);
Insert into AppUser (USERNAME,LASTNAME,FIRSTNAME,FORCEPWDCHANGE,UPDATEPWDDATE,PASSWORD,ID) values ('user1',null,null,0,GETDATE(),'43aaf24bb96430f4f570e6b2d0c4398c',2);
Insert into AppUser (USERNAME,LASTNAME,FIRSTNAME,FORCEPWDCHANGE,UPDATEPWDDATE,PASSWORD,ID) values ('user2',null,null,0,GETDATE(),'dce3a4a848d3258fc3e69c35062adf7b',3);
SET IDENTITY_INSERT [AppUser] OFF;
GO
SET IDENTITY_INSERT [Role] ON;
INSERT INTO Role ( name, Description , ID ) VALUES ('Administrators', 'Application user administrators', 1);
INSERT INTO Role ( name, Description , ID ) VALUES ('Powered Users', 'Application writers', 2);
INSERT INTO Role ( name, Description , ID ) VALUES ('Limited Users', 'Application readers', 3);
SET IDENTITY_INSERT [Role] OFF;
GO  
INSERT INTO UserRole ( USERID, ROLEID ) VALUES ( 1, 1 ); 
INSERT INTO UserRole ( USERID, ROLEID ) VALUES ( 2, 2 ); 
INSERT INTO UserRole ( USERID, ROLEID ) VALUES ( 3, 3 ); 
GO

CREATE TABLE [Candidate]
  (
      ID INTEGER not null IDENTITY,
      PRIMARY KEY (ID),
      FirstName  VARCHAR(32),
      LastName  VARCHAR(32),
      MobilePhone  VARCHAR(32),
      City  VARCHAR(32),
      Children  SMALLINT,
	  DocObj varbinary(max) NULL,
	  Image varbinary(max) NULL,
	  ImagePreview varbinary(max) NULL,
	  Image2 varbinary(max) NULL,
	  ImagePreview2 varbinary(max) NULL,
	  DateOfBirth Date,
	  NextEvent DateTime
	  );
 GO
SET IDENTITY_INSERT [Candidate] ON;
GO

INSERT INTO Candidate (ID,FIRSTNAME,LASTNAME,MOBILEPHONE,CITY,CHILDREN) VALUES (1,'Sebastian','Brinkerhoff','866-777-7217','Syracuse',2);
INSERT INTO Candidate (ID,FIRSTNAME,LASTNAME,MOBILEPHONE,CITY,CHILDREN) VALUES (2,'Alexandros','Erasmus','866-777-7717','Syracuse',0);
INSERT INTO Candidate (ID,FIRSTNAME,LASTNAME,MOBILEPHONE,CITY,CHILDREN) VALUES (3,'Carmen','Fernandez','866-777-7737','Auburn',2);
GO
SET IDENTITY_INSERT [Candidate] OFF;
GO

CREATE TABLE ShipSeat
  (
	ID INTEGER not null IDENTITY,
	PRIMARY KEY (ID),
	CandidateID Integer
  );
 GO
SET IDENTITY_INSERT [ShipSeat] ON;
GO
  
INSERT INTO ShipSeat (ID, CandidateID) VALUES (1, null);
INSERT INTO ShipSeat (ID, CandidateID) VALUES (2, null);
INSERT INTO ShipSeat (ID, CandidateID) VALUES (3, null);
INSERT INTO ShipSeat (ID, CandidateID) VALUES (4, null);
 GO
SET IDENTITY_INSERT [ShipSeat] OFF;
GO

CREATE TABLE Employed
  (
	CandidateID Integer
  );
GO

CREATE TABLE [dbo].[Valuedcandidate] (
	[ExtID] [int] NOT NULL,
	[PreviousID] [int]  NULL,
	[NextID] [int]  NULL
);
