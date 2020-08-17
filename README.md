The program is developed using Spring Boot & Java (1.8 or above) which determines if two cities are connected. Two cities are considered connected if there’s a series of roads that can be traveled from one city to another.

The available list of connected roads are read static from in memory location using Collection implementation. The Graph data structure for storing the connected data for the newtork between the roads which consists vertices as entity and relationship as edges.

It is Restful API to retrieve the status as YES/NO between connected cities which are taking as the http query parameters(i.e origin and destination). It is standloine Spring based application.

The Endpoint URL for the API is http://localhost:8081/connected, where context path is specified in application .properties.

Similary, Mocikto and Junit framework is used for testing code

Description

GET : http://localhost:8080/connected?origin=city1&destination=city2 is used to fetch the status whether the cites between origin and destination.

Also, swagger documentation are also configured by : http://localhost:8081/swagger-ui.html#
