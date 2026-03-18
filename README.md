Adactin Hotel Booking Automation Framework
A robust end-to-end test automation framework built to validate the **Adactin Hotel Booking Application** using modern industry practices.
---
Project Overview
This framework automates the complete hotel booking workflow:
Login → Search Hotel → Select Hotel → Book Hotel → Booking Confirmation
It ensures seamless validation of user actions, data integrity, and system behavior across all modules.
---

Tech Stack

| Technology | Usage |
|-----------|------|
| Java | Programming Language |
| Selenium WebDriver | UI Automation |
| Cucumber (BDD) | Behavior Driven Development |
| TestNG | Test Execution |
| Maven | Build Management |
| POM | Design Pattern |

---

Framework Features

- Cucumber BDD implementation  
- Page Object Model (POM) structure  
- Reusable Base class methods  
- End-to-End test automation  
- TestNG integration  
- HTML & Extent Reporting  
- Modular and scalable design  
- Easy maintenance and readability  

---

Project Structure

AdactinHotelBookingApp
│
├── src/test/java
│ ├── base # WebDriver setup & reusable methods
│ ├── pages # Page Object classes
│ ├── stepdefinitions # Step Definitions
│ ├── runner # Test Runner (TestNG)
│
├── src/test/resources
│ ├── FeatureFile # Cucumber Feature files
│ ├── extent.properties # Reporting config
│
├── pom.xml # Dependencies

---

Test Coverage

### Modules Automated:

- Login Page  
- Search Hotel  
- Select Hotel  
- Book Hotel  
- Booking Confirmation  

---
##  Test Documentation

As part of this project, comprehensive manual testing artifacts are maintained to ensure complete test coverage beyond automation.

###  Test Assets

-  [Smoke Test Cases and Test Plan] https://docs.google.com/spreadsheets/d/1LO68ckep9PZ7nVCNmNnCjCFcTfYkbcCOk_VYyuZFBRU/edit?gid=1966987010#gid=1966987010
  Covers critical end-to-end flow (Login → Booking) to validate build stability.

-  [Manual Test Cases] https://docs.google.com/spreadsheets/d/1LO68ckep9PZ7nVCNmNnCjCFcTfYkbcCOk_VYyuZFBRU/edit?gid=122815184#gid=122815184
  Includes detailed functional test scenarios for all modules such as Login, Search Hotel, Select Hotel, Book Hotel, and Booking Confirmation.

-  [Exploratory Testing] https://docs.google.com/spreadsheets/d/1LO68ckep9PZ7nVCNmNnCjCFcTfYkbcCOk_VYyuZFBRU/edit?gid=303485951#gid=303485951  
  Contains observations, edge cases, and usability findings identified during unscripted testing.

---

### Testing Strategy

This project follows a layered QA approach:

Manual Testing → Exploratory Testing → Automation

This ensures:
- Early defect detection  
- Broader test coverage  
- Reliable and maintainable automation  

---
Author

Suwathi
Automation Tester | QA Enthusiast
