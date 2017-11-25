DROP TABLE IF EXISTS `candidate`;
CREATE TABLE `candidate` (
  `ID` int(11) NOT NULL,
  `FirstName` varchar(32) DEFAULT NULL,
  `LastName` varchar(32) DEFAULT NULL,
  `MobilePhone` varchar(32) DEFAULT NULL,
  `City` varchar(32) DEFAULT NULL,
  `Children` smallint(6) DEFAULT NULL,
  `DocObj` mediumblob,
  `Image` mediumblob,
  `ImagePreview` blob,
  `DateOfBirth` date DEFAULT NULL,
  `NextEvent` datetime DEFAULT NULL,
  `Image2` mediumblob,
  `ImagePreview2` blob,
  PRIMARY KEY (`ID`)
);

DROP TABLE IF EXISTS `employed`;
CREATE TABLE `employed` (
  `CandidateID` int(11) DEFAULT NULL,
  KEY `idx_employed_CandidateID` (`CandidateID`),
  CONSTRAINT `fk_employed_candidate_id` FOREIGN KEY (`CandidateID`) REFERENCES `candidate` (`ID`) ON DELETE CASCADE
);

DROP TABLE IF EXISTS `valuedcandidate`;
CREATE TABLE `valuedcandidate` (
  `ExtID` int(11) DEFAULT NULL,
  `PreviousID` int(11) DEFAULT NULL,
  `NextID` int(11) DEFAULT NULL,
  KEY `fk_valuedcandidate_candite_id` (`ExtID`),
  CONSTRAINT `fk_valuedcandidate_candite_id` FOREIGN KEY (`ExtID`) REFERENCES `candidate` (`ID`)
);

DROP TABLE IF EXISTS `shipseat`;
CREATE TABLE `shipseat` (
  `ID` int(11) NOT NULL,
  `CandidateID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `fk_shipseat_candite_id` (`CandidateID`),
  CONSTRAINT `fk_shipseat_candite_id` FOREIGN KEY (`CandidateID`) REFERENCES `candidate` (`ID`)
);

DROP TABLE IF EXISTS `appuser`;
CREATE TABLE `appuser` (
  `userName` varchar(30) DEFAULT NULL,
  `lastName` varchar(20) DEFAULT NULL,
  `firstName` varchar(20) DEFAULT NULL,
  `forcePwdChange` smallint(6) DEFAULT '1',
  `updatePwdDate` date DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
);

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `ID` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `Description` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
);

DROP TABLE IF EXISTS `userrole`;
CREATE TABLE `userrole` (
  `ID` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `roleID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
);

