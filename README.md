# Air Water Tracker
### Distributed System, Ca Project
---


> DomainDescription
The project is a software application designed for monitoring water and air pollution, developed using a server-client architecture. 
A service has been implemented to provide users with information about the pollution levels using scientific metrics derived from sensors installed in different locations.
The service retrieves data from a database and presents it to clients. Municipalities, government officials, and city planners can use this service for their projects and to inform the public.
The project focuses on measuring the levels of carbon monoxide in the air, the percentage of coli bacillus in the water, and the level of radiation in the air.
The service communicates with clients using the gRPC protocol. Three gRPC services have been developed to provide data on the specified topics. Overall, the project has three services to serve data to clients.


Services Structure 
1. Login Service 
  * rpc login    - (Simple Rpc)
  * rpc logout   - (Simple Rpc)
  * rpc getUserInformation  - (Simple Rpc)
2. Air Information Service
  * rpc getCarbonMonoxideLevel - (Bidirectional Stream)
  * rpc activateFilter -  (Server-Side Stream)
3. Water Information Service
  * rpc getWaterInformation - (Simple Rpc)
  * rpc getWaterPhValue  - (Client-Side Stream)
4. Radiation Information Service
  * rpc getRadiationLevel - (Server-Side Stream)


