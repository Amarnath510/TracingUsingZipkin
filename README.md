# Tracing Using Zipkin ( Dynamic Tracing using Zipkin )

- We have Client(zipkin-client), Service(service), Zipkin-Server(zipkin service).
- To know about each dependency see gradle.build in each of the directory.

## Build
- Go to each module and do `gradle clean build`. 
- This will generate a build directory which has `.jar` file under libs folder.

## Run
- Run each module jar in different terminals as, `java -jar ./build/libs/<file>.jar`.
- Open browser,
  - To check Service, `http://localhost:8081/hi`
  - To check Client, `http://localhost:8080/hi`
  - To check zipkin server, `http://localhost:9411`


## Results
- In the Zipkin server UI we can see the calls that are made through HTTP.
- Hold on and make few calls(by reloading the client) to show the results on the UI.

## Output
![screen shot 2017-09-27 at 12 23 04 am](https://user-images.githubusercontent.com/4599623/30878160-a0adfb06-a319-11e7-8693-9cfc284f5b2f.png)
