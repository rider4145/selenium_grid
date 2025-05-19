# selenium_grid
**cross browser testing using selenium_grid**

create a hub and node to execute the code using the below commands

-> to initialize the hub usnig cmd. This will create a hub
	java -jar selenium-server-4.31.0.jar hub
-> to initialize the node in the local system using cmd
	java -jar selenium-server-4.31.0.jar node --detect-drivers true
-> to initalize the node in other system using cmd
	java -jar selenium-server-4.31.0.jar node --detect-driver 
