# Smart Home Controller Challenge
The Smart Home Controller challenge involves playing the role of "Smart Builders" - developers who develop custom smart homes by combining various components - temperature sensors, furnaces, etc. 

The challenge is divided into three components (Ex1, Ex2, Ex3). Each component must follow Smart Device Collaboration (SSDCS) standards - using design patterns.

## Ex1 - Adapting an Old Sensor
Temperature sensor driver is given, but adapter pattern must be used.
Video demonstration: https://youtu.be/svJXQlnkKyQ

## Ex2 - Adapting a Sensor with inverted control.
Temperature sensor driver that is capable of generating messages based on temperature events is given, but observer and adapter patterns must be combined to use in the project.

## Ex3 - Customizable Furnace
Based on SSDCS standards, furnaces should have extra features i.e., Wi-Fi and Humidifier addons. A decorator pattern must be used to ensure appropriate components are initialized when turned on.

## Main.java
Test file where various sensors can be created and controlled/tested. Consists of 3 scenarios dedicated to Ex1, Ex2, and Ex3 respectively. Only 1 scenario should be active at a time, so if Scenario 1 will be used at runtime, comment Scenario 2 and 3.

## Standards.jar
Java interfaces which allow components of SSDCS to work together. Check links.txt for documentation on Standards.jar.
