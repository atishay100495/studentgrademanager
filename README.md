#StudentGradeManager
This is simple application for educational purpose and covers use of the following:
- Java
- JDBC
- JSP
- JSF
- JNDI (commented out but can be used)
- Sessions
- Cookies
- REST Endpoints (A REST client like Postman(Google Chrome) can be used to test the endpoints)
- DAO and Facade Pattern
- Using resource bundles
- Creating tables using sql scripts
- Using selenium and JUnit for writing simple tests
- Creating xslt report for the test
- Using Apache Ant to create targets for running the test
- using bootstrap

Steps for Use:
1. Install JDeveloper.
2. Install SQLDeveloper. Create a user for the database.
3. Run CreateAdminDetailTable.sql and CreateStudentDetailTable.sql to create the required tables.
4. Fill in the database info in db.properties file.
5. Run the WelcomePage.jsp from JDeveloper.
6. Run the test by going to the test directory and running 'ant run'