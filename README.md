# Spring Boot Quartz Scheduler

## Overview
This project is a Spring Boot application that demonstrates the integration of Quartz Scheduler library for scheduling and executing tasks. It provides a flexible and powerful scheduling mechanism for executing jobs at specific times or intervals within a Spring Boot application.

## Features
- **Job Scheduling**: Utilizes Quartz Scheduler to schedule and execute jobs.
- **Flexible Configuration**: Supports configuration of job scheduling parameters such as cron expressions, fixed delays, or intervals.
- **Integration with Spring Boot**: Seamlessly integrates Quartz Scheduler with Spring Boot for easy configuration and management.
- **No Database Dependency**: Operates without the need for a database, simplifying deployment and configuration.

## Technology Stack
- **Spring Boot**: Framework for building Spring applications with minimal configuration.
- **Quartz Scheduler**: Library for scheduling and executing jobs in Java applications.
- **Spring Framework**: Provides comprehensive infrastructure support for developing Java applications.

## Usage
1. **Clone Repository**:
   ```
   git clone https://github.com/yourusername/spring-boot-quartz-scheduler.git
   ```
2. **Build Project**:
   ```
   cd spring-boot-quartz-scheduler
   mvn clean install
   ```
3. **Run Application**:
   ```
   java -jar target/spring-boot-quartz-scheduler.jar
   ```
4. **View Job Schedule**:
   Access Quartz Scheduler dashboard at `http://localhost:8080/quartz` to view and manage scheduled jobs.

## Configuration
- **Job Scheduling**: Configure job scheduling parameters such as cron expressions, fixed delays, or intervals in `application.properties`.
- **Quartz Properties**: Configure Quartz Scheduler properties in `quartz.properties` file for customization.

## Contributions
Contributions are welcome! Feel free to open issues, submit pull requests, or suggest enhancements.


---

This project description provides an overview of the Spring Boot application integrating Quartz Scheduler without the usage of a database, highlighting its features, technology stack, usage instructions, configuration details, contribution guidelines, Adjustments can be made according to specific project requirements.
