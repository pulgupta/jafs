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
Whenever we are working on projects which invlove many services and that too if they belong to different teams within the organisation. In such cases we have little or no control on these services. Many a times I have faced situations where there is a downtime for a single service and the whole dev shop is waiting for that service to somplete their unit tests or integration test as they are dependent on that service. 
To overcome such situations one may create a dummy service of their own so that they can carry on their work and can switch to the original service once it is available.
This is the place where JAFS fits in the whole picture. Using JAFS you can easily and without any code spring up a dummy serive returning the sample JSON you will provide. All this can be controlled using a single web form. 
### Why should I care?
Whatever may be the political or technical issue involved in your services you can ensure zero downtime for your dev shop.

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

