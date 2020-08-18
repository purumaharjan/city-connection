The program is developed using Spring Boot & Java (1.8 or above) which determines if two cities are connected. Two cities are considered connected if there’s a series of roads that can be traveled from one city to another.

The Cities connection logic have implemented reading the city.txt file from classpath and adding the cities using Map<String, Set<String>> where the data structure for storing the connected data for the network relationships between the cities roads.

It is Restful API to retrieve the status as YES/NO between connected cities which are taking as the http query parameters(i.e origin and destination). It is standalone Spring based application.

The Endpoint URL for the API is http://localhost:8081/connected, where context path is specified in application .properties.

Similary, Mocikto and Junit framework is used for Unit testing code and Rest Template for integration testing. 

Description

GET : http://localhost:8080/connected?origin=city1&destination=city2 is used to fetch the status whether the cites between origin and destination are connected or not.

Also, swagger documentation are also configured by : http://localhost:8080/swagger-ui.html#
