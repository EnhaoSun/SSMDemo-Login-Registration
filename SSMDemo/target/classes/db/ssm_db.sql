DROP TABLE IF EXISTS ssm_user;
CREATE TABLE ssm_user (
  user_name varchar(100) NOT NULL ,
  password varchar(100) NOT NULL ,
  email varchar(100) NOT NULL,
  PRIMARY KEY (user_name, email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;