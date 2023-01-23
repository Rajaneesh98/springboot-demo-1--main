# springboot-demo-1-
SpringBoot Employee data implementation.

1. Clone the repo or download the zip to start using it.

2. Extract it if you donwloaded the zip, and open it in you IDE(IntelliJ Preferred).

3. Head over to application.properties file here in order to connect to your db you need to change few things
   a.Change the url to your mysql server url along with new db of your choice.
   b.Give it the username and password of your mysql.
   
4. Open springbootDemoApplication.java file and run the main method.

### How to use it.

1. Access the url - http://localhost:8082 from your Browser or Postman.

2. You can use Get - http://localhost:8082/employees to get all employees data from db.

3. You can use Post - http://localhost:8082/employees to post a employee data to db.

4. You can use Get - http://localhost:8082/employees/{id} to get a specific employee by id.

5. You can use Get - http://localhost:8082/employees/email/{email} to get a specific employee by email.
