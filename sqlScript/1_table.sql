CREATE TABLE corner.tblsitecontent
(
  content      VARCHAR(20) NOT NULL,
  contentorder INT(11)     NOT NULL,
  value        VARCHAR(1000),
  title        VARCHAR(100),
  memo         VARCHAR(200),
  CONSTRAINT `PRIMARY` PRIMARY KEY (content, contentorder)
)
  DEFAULT CHARSET = utf8;

CREATE TABLE corner.tbluser
(
  account        INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  username       VARCHAR(20),
  userId         VARCHAR(10)         NOT NULL,
  password       VARCHAR(50)         NOT NULL,
  gender         VARCHAR(10),
  phone          VARCHAR(20),
  mobile         VARCHAR(20),
  address        VARCHAR(100),
  home           VARCHAR(100),
  birthday       DATE,
  height         INT(11),
  weight         INT(11),
  bloodtype      VARCHAR(20),
  issmoking      TINYINT(1),
  isvegetarian   TINYINT(1),
  isdrinking     TINYINT(1),
  zodiac         VARCHAR(20),
  religion       VARCHAR(20),
  education      VARCHAR(20),
  graduateschool VARCHAR(30),
  graduatedepart VARCHAR(30),
  career         VARCHAR(20),
  workcity       VARCHAR(20),
  company        VARCHAR(30),
  position       VARCHAR(30),
  islivetogether TINYINT(1),
  lineid         VARCHAR(30),
  email          VARCHAR(50),
  hobbies        VARCHAR(100)
)
  DEFAULT CHARSET = utf8;
CREATE UNIQUE INDEX unique_account
  ON corner.tbluser (account);