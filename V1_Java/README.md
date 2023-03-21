## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

## How to run

You only need to run the `.jar` file with the command below :
```
java -jar bankend.jar
```

## How to generate the .jar file

If needed, you can also generate the `.jar` file with the 2 commands below :
1. Generate the docs files :
    ```
    javadoc src/*.java -d docs
    ```
2. Generate the .jar file :
    ```
    jar cvfm bankend.jar ressources/manifest.text -C bin . src docs
    ```
