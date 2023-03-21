# **V1 Java version** - Société Générale

### Author : *Edouard Mignien*

This project is an exercise provided by *Société Générale*. 

This `V1` project is the Java version with a console interface of the exercise. Only `Java 17` is required.

## **Folder Structure**

The project contains:

- `/src`: this folder contains the sources files .java
- `/bin`: this folder contains the compiled ouput files .class
- `bankend.jar`: is the executable that you can run with the commands below

## **Prerequisites**

This project use Java 17 open JDK, no other dependencies are required as the statement of the exercise asked to don't use any framework

## **How to run**

You only need to run the `.jar` file with the command below:
```
java -jar bankend.jar
```

## **How to generate the .jar file**

If needed, you can also generate the `.jar` file with the 2 commands below:
1. Generate the docs files:
    ```
    javadoc src/*.java -d docs
    ```
2. Generate the .jar file:
    ```
    jar cvfm bankend.jar ressources/manifest.text -C bin . src docs
    ```
