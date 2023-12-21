********Selenium-Cucumber-Java********
This repository contains a collection of sample projects and libraries that demonstrate how to use selenium-cucumber-java, a BDD (Behavior-Driven Development) framework with Cucumber (v 3.0.0) and Java. The projects showcase automation script development and utilize various reporters such as Allure, HTML, and JSON. Additionally, it offers the ability to capture screenshots for tests and generate error shots for failed test cases.

**Installation & Prerequisites**
JDK 1.8+ (Ensure that the Java class path is properly set)
Maven (Ensure that the .m2 class path is properly set)
Eclipse IDE
Required Eclipse Plugins:
Maven
Cucumber
Selenium
Browser driver (Ensure that you have the appropriate browser driver for your desired browser and that the classpath is correctly configured)

**Framework Setup**
To set up the framework, you can either fork or clone the repository

**Running Sample Tests**
To run features on the browser, Go to the CucumberTestOptions class and run the class with JUnit. You will see that all the test cases pass along with all the functionality can run.

**BDD Automation with Cucumber-Java and Page Objects**
In this repository, we encourage the use of Behavior-Driven Development (BDD) with Cucumber and Java to develop automation scripts.

Tests are written in the Cucumber framework using the Gherkin syntax. If you're new to Gherkin and Cucumber, you can find more information at cucumber.io/docs/reference. A typical test will have a structure similar to this:

Feature: Manage Cart
  As a user, I want to manage my cart so that I can buy the right things

  Scenario: Increase Quantity
     Given: product Sauce Labs Backpack is in the cart
     Then its price should be $29.99
     And its total should be 29.99

**The Page Object Design Pattern**
To better organize your test code and make it more maintainable, we recommend using the Page Object Design Pattern. With this pattern, the UI elements of your web application are modeled as objects within the test code. This approach reduces code duplication and allows easy updates if the UI changes. Writing and maintaining test automation can be challenging, especially when it comes to keeping selectors (classes, IDs, or XPath, etc.) up to date with the latest code changes. The Page Object pattern provides a solution by centralizing these selectors in separate .java files, where you can manage them along with the associated methods.

By using the Page Object pattern, your test files will only call the test methods, while the selectors and reusable methods reside in the corresponding Page Objects. This approach helps maintain a separation of concerns and ensures that when a test fails, it fails on an individual step. If a selector becomes invalid, updating it in the Page Object file can fix multiple failing tests that rely on the same selector.
