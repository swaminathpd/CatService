# CatService
repo for the project category service
1) Build the services with maven  from DOS Prompt

   The maven commands for building the projects are as follows

 mvn clean
 mvn dependency:copy-dependencies
 mvn install -Dmaven.test.skip=true

  Database Design 

   Database name - goodsservice
  table name - category

   mysql> DESC category;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| catNo   | varchar(20) | YES  |     | NULL    |       |
| catName | varchar(20) | YES  |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
2 rows in set (0.03 sec)

mysql> select * from category;
+-------+------------+
| catNo | catName    |
+-------+------------+
| C101  | Crockery   |
| C102  | Stationary |
+-------+------------+
2 rows in set (0.00 sec)
