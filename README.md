flight-status-application is a fullstack demo application designed to provide real-time flight status updates for Indigo airlines. This application showcases a seamless integration of a modern backend and frontend stack to deliver dynamic flight information.

Note: For accessing the complete codebase, please switch to the main branch. (Important)

Overview
The application offers real-time tracking of flight statuses, including departure and arrival times, delays, and cancellations. It is designed to demonstrate effective use of contemporary technologies for building robust and responsive web applications.

Technology Stack
Backend
Language: Java
Framework: Spring Boot
Utilizes Spring Boot for creating stand-alone, production-grade Spring-based applications.
Provides RESTful APIs for interacting with flight status data.
Database: MongoDB
Employs MongoDB for flexible, document-oriented storage of flight data.
Facilitates efficient querying and updating of flight status information.
Frontend
Library: React.js
Leverages React.js for building a dynamic and interactive user interface.
Implements component-based architecture for modular and reusable UI elements.
Uses state management for real-time updates and user interactions.
Project Structure
The project is organized into two main components:

Backend:

Located in the backend directory.
Contains Spring Boot application code, REST API endpoints, and MongoDB integration.
Implements business logic and data access layers, ensuring the application’s core functionality.
Frontend:

Located in the frontend directory.
Includes React.js components, state management, and UI/UX design.
Connects to the backend via REST APIs to fetch and display real-time flight status information.
Both components are developed independently but are integrated during runtime to provide a cohesive user experience.

Architectural Design
The application adheres to the Model-View-Controller (MVC) design pattern, promoting a clear separation of concerns:

Model: Represents the data layer, handling business logic and data access.
View: Manages the user interface and presentation logic, ensuring a responsive and intuitive experience.
Controller: Acts as an intermediary between the model and view, processing user inputs and updating the view accordingly.
This architecture not only enhances maintainability and scalability but also ensures that each component of the application is well-defined and manageable.

How to Run
Backend:

Navigate to the backend directory.
Run mvn spring-boot:run to start the Spring Boot application.
Frontend:

Navigate to the frontend directory.
Run npm install to install dependencies.
Run npm start to launch the React application.
Ensure that both the backend and frontend are running concurrently for full functionality.

Contribution
Feel free to contribute to this project by submitting issues, feature requests, or pull requests. Please refer to the contributing guidelines for more information.

