**This README provides instructions for building a WAR file of a Spring Boot application and deploying it on an external Tomcat server.**

**Prerequisites:**
- Java Development Kit (JDK)
- Apache Maven
- Apache Tomcat Server
- Spring Boot Application

**Step 1:** Build WAR file
- Open a terminal or command prompt.
- Navigate to the root directory of your Spring Boot application.
- Run the following Maven command to build the WAR file:
- mvn clean package

**Step 2:** Deploy WAR file on Tomcat Server
- copy the generated WAR file (your-application-name.war) from the target directory of your Spring Boot project.
- Paste the WAR file into the webapps directory of your Tomcat server.

**Step 3:** Configure Tomcat Server
- Ensure that Tomcat is configured to run on an appropriate port and context path.

**Step 4:** Start Tomcat Server
- Navigate to the bin directory of your Tomcat installation.
- Run the appropriate startup script for your operating system:
- For Unix/Linux: ./startup.sh
- For Windows: startup.bat

**Step 5:** Access Your Application
- Once Tomcat is running, open a web browser.
- Navigate to the URL where Tomcat is hosted, followed by the context path of your deployed application (e.g., http://localhost:8080/your-application-name).

**Step 6:** Verify Deployment
- Verify that your Spring Boot application is accessible and functioning correctly on the Tomcat server.
- Test various endpoints and functionalities to ensure everything works as expected.
