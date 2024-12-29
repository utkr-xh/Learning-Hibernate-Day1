# Learning-Hibernate-Day1
This Java code demonstrates using Hibernate to manage multiple systems such as inventory, books, orders, etc. The code breakdown is given below

## Annotations:

@Entity: This annotation marks a class as a JPA entity. An entity is a class that represents a table in a database. <br/>
@Id: This annotation marks a property of an entity as the primary key. The primary key is a unique identifier for each entity.

## XML File (hibernate.cfg.xml):

The hibernate.cfg.xml file is a configuration file for Hibernate. It specifies the database connection details, the dialect to use, and other settings. Here's a breakdown of the important properties in the provided configuration file:

+ hibernate.connection.driver_class: This property specifies the JDBC driver class to use for connecting to the database.<br/>
+ hibernate.connection.url: This property specifies the URL of the database.<br/>
+ hibernate.connection.username: This property specifies the username to connect to the database.<br/>
+ hibernate.connection.password: This property specifies the password to connect to the database.<br/>
+ hibernate.dialect: This property specifies the dialect to use for the database. The dialect maps Hibernate data types to the data types of the specific database.<br/>
+ show_sql: This property specifies whether to log the SQL statements generated by Hibernate. Setting it to true can be helpful for debugging purposes.<br/>
+ hibernate.hbm2ddl.auto: This property specifies how Hibernate should automatically update the database schema to reflect changes in the entity classes. In this case, it's set to update, which means Hibernate will + update the schema if the entity classes change.

## JAR Files:

The following JAR files are typically required for using JPA with Hibernate:

+ hibernate-core.jar: This JAR file contains the core Hibernate classes.<br/>
+ jakarta.persistence-api.jar: This JAR file contains the JPA annotations.<br/>
+ jakarta.transaction.api.jar: This JAR file contains the JTA annotations (optional, depending on your transaction management approach).<br/>
+ mysql-connector-java.jar: This JAR file is the JDBC driver for MySQL.

## Code Breakdown (using "Employee"):

+ Configuration:
A Configuration object is created to configure Hibernate.<br/>
The configure method is called on the Configuration object, specifying the path to the hibernate.cfg.xml file.<br/>
The addAnnotatedClass method is called on the Configuration object to specify the entity class (Employee in this case).<br/>
+ Session Factory:
A SessionFactory object is created using the buildSessionFactory method on the Configuration object. The SessionFactory is a heavyweight object that is used to create Session objects.<br/>
Session:
A Session object is created from the SessionFactory. The Session object represents a unit of work and is used to interact with the database.<br/>
+ Transaction:
A Transaction object is created from the Session. The Transaction object is used to manage database transactions.<br/>
+ Entity Creation (commented out):
An Employee entity object is created (commented out in the provided code).<br/>
+ Printing Success Message (commented out):
A message indicating successful table creation is printed (commented out in the provided code). This message likely needs to be replaced with actual entity persistence logic.<br/>
+ Transaction Commit (commented out):
The commit method is called on the Transaction object to commit the transaction (commented out in the provided code). This would typically be done after persisting the entity object.<br/>
+ Session Close:
The close method is called on the Session object to close the session.<br/>
+ Session Factory Close:
The close method is called on the SessionFactory object to close the session factory (not shown in the provided code, but recommended to close resources properly).


## Results:
![image](https://github.com/user-attachments/assets/0fde5b98-ba1f-4f30-b6a8-bc6506490c7e)



