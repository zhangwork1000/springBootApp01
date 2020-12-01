
■データベース
mysql8.1 64bit
user:root
pwd:mytel7
■データアクセス
JPA

port:3306
■テーブル
DROP TABLE IF EXISTS tb_user;
CREATE TABLE tb_user (
  id int(11) unsigned NOT NULL AUTO_INCREMENT,
  username varchar(255) DEFAULT NULL,
  password varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO tb_user VALUES (1, 'admin', '123');

CREATE TABLE category (
  id int(11) NOT NULL,
  name varchar(255) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE book (
  id int(11) NOT NULL AUTO_INCREMENT,
  cover varchar(255) DEFAULT '',
  title varchar(255) NOT NULL DEFAULT '',
  author varchar(255) DEFAULT '',
  date varchar(20) DEFAULT '',
  press varchar(255) DEFAULT '',
  abs varchar(255) DEFAULT NULL,
  cid int(11) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY fk_book_category_on_cid (cid),
  CONSTRAINT fk_book_category_on_cid FOREIGN KEY (cid) REFERENCES category (id) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8;


■VueJs
http://localhost:8080/#/login
http://localhost:8080/index
■SpringBoot■サーバポート8443、application.propertiesに設定する
http://localhost:8443/api/login
■
■

