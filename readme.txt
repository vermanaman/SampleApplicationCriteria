Steps to run the appllication: 
1: run the following queries in mysql:
1.a: create database test;
1.b: use test;
1.c: CREATE TABLE ItemsMaster (item_code int NOT NULL AUTO_INCREMENT PRIMARY KEY, item_name varchar(50) NOT NULL, price decimal NOT NULL, qty int NOT NULL, createdOn timestamp);

2: edit bean id = "data source" in inventory-servlet.xml present in WEB-INF
3: add a server runtime to the project ( preferable tomcat)
4: run the project by click run as, Run on server
5: access the following link: http://localhost:8080/SampleApplicationCriteria/loadAddForm.do
