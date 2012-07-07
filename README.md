
### Introduction
-
Grid allows you to : 

- scale by distributing tests on several machines ( parallel execution )
- manage multiple environments from a central point, making it easy to run the tests against a vast combination of browsers / OS.
- minimize the maintenance time for the grid by allowing you to implement custom hooks to leverage virtual infrastructure for instance. 

## Quick Start
This example will show you how to start the Selenium 2 Hub, and register both a WebDriver node and a Selenium 1 RC legacy node. We’ll also show you how to call the grid from Java. The hub and nodes are shown here running on the same machine, but of course you can copy the selenium-server-standalone to multiple machines. 


##### Step 1: Start the hub 
The Hub is the central point that will receive all the test request and distribute them the the right nodes.

Open a command prompt and navigate to the directory where you copied the selenium-server-standalone file. Type the following command: 

**Step 1: Start the hub ** 

``` java
java -jar selenium-server-standalone-2.14.0.jar -role hub
``` 



## Important Links

[Official Website](http://selenium-grid.seleniumhq.org)

[Selenium Documentation](http://seleniumhq.org/docs/)

[Selenium WebDriver](http://seleniumhq.org/projects/webdriver/)

[Selenium Download Page](http://seleniumhq.org/download/)

[Selenium Support Page](http://seleniumhq.org/support/)

[Platforms Supports](http://seleniumhq.org/about/platforms.html)

[Language Supports](http://seleniumhq.org/about/platforms.html#programming-languages)

[Testing Frameworks](http://seleniumhq.org/about/platforms.html#testing-frameworks)

[Test Design Considerations](http://seleniumhq.org/docs/06_test_design_considerations.html)

[UI Mapping](http://seleniumhq.org/docs/06_test_design_considerations.html#ui-mapping)

[Page Object Design Pattern](http://seleniumhq.org/docs/06_test_design_considerations.html#page-object-design-pattern)

[Data Driven Testing](http://seleniumhq.org/docs/06_test_design_considerations.html#data-driven-testing)

[Database Validation](http://seleniumhq.org/docs/06_test_design_considerations.html#database-validation)

[Selenium Grid](http://selenium-grid.seleniumhq.org/)

[Java Documentatuin](http://selenium.googlecode.com/svn/trunk/docs/api/java/index.html)







