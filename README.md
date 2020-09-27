# Galaxy Project

![Version](https://img.shields.io/badge/Version-1.0.0-green)

Application that allows identifying the planets and astronauts registered in the space program.

## Technology

Galaxy Project uses a number of open source projects to work properly:

* Angular
* Node.js
* Spring Boot
* H2 Database

## Backend Summary
 List all endpoints:
##### POST      
        /galaxy/astronaut  -> Create new a Astronaut into the space program
        /galaxy/planet -> Create a new Planet in the galaxy
        /galaxy/planet/{astronautId}/{planteId} -> Set Astronaut Home
#### GET
        /galaxy/astronaut -> List all astronaut on the space program
        /galaxy/planet -> List all planet on the galaxy
        /galaxy/top -> TOP 3 list  of Planets and Astronauts
#### PATCH
        /galaxy/astronaut/{toAstronautId}/{fromAstronautId} -> Visit an Astronaut
        /galaxy/planet/{astronautId}/{planetId}
### Backend Installation
        $ cd Galaxy\GalaxyAPI\target
        $ java -jar Galaxy_API-1.0.0.jar
        
## Frontend Summary

### Frontend Installation
## Author
  - [Felix Moreno](https://github.com/FelixMorenoT)


