
### Making executable jar/war files

via `spring-boot-maven-plugin` and internally via `maven-shade-plugin` plugin, used to create executable jar/war files.

In command line:

```bash
mvn spring-boot:repackage

#the previous goal binds itself in `package`
mvn package
```

### Start/stop/run Spring Boot application

##### via `java`

```bash
$ java -jar my-app-0.0.1.jar
```

##### as executable

[See executable jar](../spring_boot_packaging/executable_jar_app/README.md)

```bash
$ chmod u+x my-app-0.0.1.jar
$ ./my-app-0.0.1.jar
```

##### via `spring-boot-maven-plugin`

```bash
mvn spring-boot:run
mvn spring-boot:start
mvn spring-boot:stop
```

 


### `spring-boot:run` vs `spring-boot:start`

`spring-boot:run` - runs an executable archive application

`spring-boot:start` - starts a spring application. 
Contrary to the run goal, this does not block and allows other goal to operate on the application. 
This goal is typically used in integration test scenario 
where the application is started before a test suite and stopped after.

### The graceful shutdown

This feature was introduced in  Spring Boot 2.3.0 release. 
It’s not available for earlier Spring Boot releases.

Add into the application configuration:
```properties
server.shutdown=graceful
spring.lifecycle.timeout-per-shutdown-phase=1m
```

`server.shutdown` - by default `immediate`
`spring.lifecycle.timeout-per-shutdown-phase` - by default `30s`

### Generate `build-info.properties`

```bash
mvn spring-boot:build-info
```

### Build Docker image

```bash
mvn spring-boot:build-image
```