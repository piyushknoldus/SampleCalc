This is the Test Sample Calculator App that accepts inputs
from user and do the general stuff.

The aim is to run the application via creating jar.

------------------------------------------------------------------------------------------------------------------------

1) To create Jar file -

Go to the project directory (in my case - /workstations/SampleCalc) and type - sbt assembly

This will create a jar file in your ../target/scala-2.12 folder with named as SampleCalc-assembly-1.0.jar.

2) To execute the app with jar file -

java -jar /path-to-your-jar

e.g - java -jar /home/knoldus/workstation/SampleCalc/target/scala-2.12/SampleCalc-assembly-1.0.jar


