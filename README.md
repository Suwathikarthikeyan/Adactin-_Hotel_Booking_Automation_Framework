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

Author

Suwathi
Automation Tester | QA Enthusiast
