# Registration Form Project

## Introduction

This project is a simple registration form that allows users to register their information, including their title, name, email, address, and phone number. The project is built using the Spring Framework and follows the Model-View-Controller (MVC) design pattern.

Note that the table has been exported and can be found in the repository as 'table.csv' and the schema has been exported as 'aeroparker_customer_schema.sql'.

## MVC Design Pattern

The MVC design pattern is used to separate the concerns of the application into three distinct layers. 
- The Model represents the data and business logic of the application. 
- The View represents the user interface. 
- The Controller handles user input and manages communication between the Model and View.

## How to Run

1. Clone the repository to your local machine.
2. Update the application.properties file with your own database name and password or create a .env file using the dotenv package in the pom.xml file.
3. Build the project using Maven by running the command mvn clean install.
4. Run the project by executing the main method in the RegistrationFormApplication class.
5. Open your web browser and navigate to http://localhost:8080/registration

## Key Features

- **Validation before insertion into database:** The form validates user input before inserting it into the database. It checks if all the required fields are filled and the input format is correct. If there are any errors, the form returns a validation error message and prompts the user to correct the input.
- **Remove case sensitivity of email:** The email address entered by the user is automatically converted to lowercase before inserting into the database. This ensures that emails are case insensitive and avoids duplication of emails in different cases.
- **Ensuring unique emails in the database:** The email field has a unique constraint set in the database schema, which ensures that there are no duplicate email addresses in the database. If a duplicate email is detected during form submission, the form returns an error message and prompts the user to enter a different email address.
- **Client-side part HTML validation with unable to submit field unless required field filled within max length:** The form has HTML validation for required fields, ensuring that the user fills in all the required fields before submitting the form. It also has max length validation for fields that have a maximum character limit. The form cannot be submitted until all required fields are filled and the input is within the maximum limit. This improves the user experience and ensures that the form data is correct and complete before submission.

## Future Improvements

If there was more time, the following improvements could be implemented:

- Unit and integration tests using the Spring Boot testing library to ensure the code functions correctly and to catch any potential errors.
- Cleaning up the HTML/CSS code to improve the user interface and make it more user-friendly.
- Improve error handling to show more descriptive errors.
