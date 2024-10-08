# Spring Mockito Project

## Overview

This project demonstrates how to use Spring Boot with Mockito for unit testing. It includes examples of how to mock dependencies and test your Spring application effectively.

## Technologies Used

- **Java 11**
- **Spring Boot 2.7.x**
- **Mockito**
- **Maven**
- **JUnit 5**

## Project Structure

```plaintext
spring-mockito/
├── .mvn/                      # Maven Wrapper
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/spring_mockito/
│   │   │       ├── SpringMockitoApplication.java  # Main application class
│   │   │       ├── controller/
│   │   │       │   └── EmployeeController.java    # REST controller
│   │   │       ├── dao/
│   │   │       │   └── EmployeeRepository.java    # Data access object
│   │   │       ├── model/
│   │   │       │   ├── Employee.java              # Employee entity
│   │   │       │   └── Response.java              # Response model
│   └── test/
│       ├── java/
│       │   └── com/example/spring_mockito/
│       │       └── SpringMockitoApplicationTests.java  # Unit tests with Mockito
├── pom.xml                    # Project configuration file
└── README.md                  # Project documentation
Setup
Prerequisites
Java 11
Maven 3.6.3 or later
Installation
Clone the repository:

bash
Copy code
git clone https://github.com/rutujmirzapure/springMockito.git
Navigate to the project directory:

bash
Copy code
cd spring-mockito
Build the project using Maven:

bash
Copy code
mvn clean install
Running the Application
You can run the Spring Boot application using the following command:

bash
Copy code
mvn spring-boot:run
Testing
This project uses JUnit 5 and Mockito for unit testing. You can run the tests using:

bash
Copy code
mvn test
Example Endpoints
The project includes a simple EmployeeController with basic CRUD operations.

GET /employees - Retrieves a list of employees.
POST /employees - Adds a new employee.
PUT /employees/{id} - Updates an existing employee.
DELETE /employees/{id} - Deletes an employee.
Contributing
Feel free to fork this repository, make changes, and submit a pull request.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
If you have any questions, feel free to contact me at rutujmirzapure@gmail.com.
