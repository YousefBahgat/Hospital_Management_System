# General idea: 

The hospital management system isn’t  the complete system of the hospital, it covers the entire data of the employees, 

patients' details, and booking appointments for the patients.

# Project details:

There are two ways for accessing the system, as an admin and as a receptionist.

- The admin can insert, update, and delete the data of a specific employee, such as doctors, nurses, and receptionists, also editing salary details,
An admin can also access the indoor patient's details, and edit or delete the data.

- The second way to access the system is as a receptionist, a receptionist can see his profile, access the indoor patient details like the admin,
View doctor appointments and generate the bills, a feature for the receptionist is the capability of changing his password.


## Notes:
- The database used is Microsoft Access 2007.

- All the data of the system is modified  in  the database.

- the project contains 11 main classes(without controllers).

- the controllers are omitted in the UML diagram.

- the getters and setters are omitted in the UML diagram.

- The ucanaccess folder contains  jar files  for Microsoft access connection(not available in  JDK).

## Libraries used for database connection:
- import java.sql.Connection;

- import java.sql.DriverManager;

- import java.sql.PreparedStatement;

- import java.sql.ResultSet;
  
- import java.sql.Statement;


## UML Diagram:

![project uml](https://github.com/user-attachments/assets/9f2a7a93-0f2b-4b74-ac0b-1feb329caac1)






