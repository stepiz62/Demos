Create USER user1 IDENTIFIED BY 'user1'
GRANT SELECT, INSERT, UPDATE, DELETE  ON myclinicdb.* TO 'user1'@'%'
Create USER user2 IDENTIFIED BY 'user2'
GRANT SELECT, INSERT, UPDATE, DELETE  ON myclinicdb.* TO 'user2'@'%'
Create USER user3 IDENTIFIED BY 'user3'
GRANT SELECT, INSERT, UPDATE, DELETE  ON myclinicdb.* TO 'user3'@'%'