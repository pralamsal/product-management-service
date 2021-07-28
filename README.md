# product-management-service

This is a microservice implemented using Spring Boot. It uses Spring Data JPA to store and retrieve data in a relational database (H2 Database).

To run the application, run the following command in a terminal window in the project directory

####  `./mvnw spring-boot:run`
  
Once this application starts, the front-end application can be run to fetch the data. 

Product and category data get loaded to in-memory DB when the application starts. Only a few products have been added for test purpose. Data loading can be 
improved by updating the application to load data from csv file. 

REST APIs have been exposed that can be called by the client to obtain product and category data.
