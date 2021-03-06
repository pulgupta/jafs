# JAFS
Just Another False Server. 
	A Spring Cloud integrated service virtualisation server.
=====================================================================================
  - [Usage](#usage)
  - [Features](#features)
  - [Missing features](#missing-features)
  - [License](#license)


## Spring cloud features and Patterns and where JAFS fits in the whole picture
I have created a separate project to demonstrate the capabilities of the Spring cloud. This project is an attempt to make Spring cloud more enriching for an enterprise with some legacy services.
 We mostly work on projects which invlove many services and sometimes they belong to different teams within the same organisation. These teams may have different goals or governing body. In such cases we have little or no control on these services. Many a times we have faced situations where there is a downtime for a single service and the whole dev shop is waiting for that service to complete their unit tests or integration tests.
 
To overcome such situations one may create a dummy service of their own so that they can carry on their work and can switch to the original service once it is available.
This is the place where JAFS fits in the whole picture. Using JAFS you can easily and without any code spring up a dummy serive returning the sample JSON you will provide. All this can be controlled using a single web form. This helps the team in coming up with any virtual service and once it is created anyone can use those services. For this execute this tool on a server accessable to all the developers(ex. a local dev server) and not on some local box. 

### Why should I care?
Whatever may be the political or technical issue involved in your service provider or services you can ensure zero downtime for your developers.

## Usage
The executable jar will be made available. Just run the jar and access the web form to manage your virtual end points. 
	
## Features
The project has below features
#### 1. Add an end point
#### 2. Remove an end point
#### 3. Update an end point


## Missing features
  The server will be integrated with the existing spring cloud offerings so as to make the overall experience more enriching.
  
## License
This software is released under the [MIT License](http://www.opensource.org/licenses/MIT).

