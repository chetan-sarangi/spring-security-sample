# spring-security-sample

Basic technologies for this project:<br>

spring security - for security <br>
spring web: For developing rest apis <br>
javascript/Ajax: for calling rest apis<br>
html: to show response ui.<br>

<br>
This project has rest API:
http://localhost:8080/greeting
which needs basic auth to access.

http://localhost:8080/index.html file can be accessed without any authentication, as in the security configuration we have mentioned
this file to be skipped for authenticaion.
By default, all files/apis are secured if we included spring-boot-starter-security artifact in pom.

<br>
Usage:
1) run the project
#mvn spring-boot:run
<br>
2) browser:
   http://localhost:8080/index.html 
   Observation: The page is loaded withou any authentication.
<br>
3) click on "Call API" button.
   Obeservation: we get pop showing the rest api response. 
   In the html file where ajax call is made to call rest api, we are passing authorization header with basic auth.
   If basic auth header is not passed, the we get a pop-up asking username/password when we click button.
   Then enter "user" username, password as password.
   
   
