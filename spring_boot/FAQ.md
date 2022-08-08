
- [Spring Boot starter dependency](#spring-boot-starter-dependency)
- [Spring Boot Initializer](#spring-boot-initializer)

**Project-management topics**

- [Making executable jar/war files](docs/application.management.md#making-executable-jarwar-files)
- [Start/stop/run Spring Boot application](docs/application.management.md#startstoprun-spring-boot-application)
- [`spring-boot:run` vs `spring-boot:start`](docs/application.management.md#spring-bootrun-vs-spring-bootstart)
- [The graceful shutdown](docs/application.management.md#the-graceful-shutdown)
- [Generate `build-info.properties`](docs/application.management.md#generate-build-infoproperties)
- [Build Docker image](docs/application.management.md#build-docker-image)

- [Spring Boot Application configuration, options](docs/spring.boot.app.configuration.md)
- [The structure of jar/war file, repackaged by Spring](#the-structure-of-jar-file-repackage-by-spring)

### Spring Boot starter dependency

* role of BOM - right versions of the libraries
* transitive dependencies validation (todo how is it implemented)

### Spring Boot Initializer

`SpringInitApplication` needs to be in your application root package:

```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringInitApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringInitApplication.class, args);
  }
}
```

`@SpringBootApplication` - consists of three annotations:

* `@EnableAutoConfiguration` - autoconfigures the application based on the JAR dependencies in the classpath
* `@ComponentScan` - scans the packages for Spring components in the application.
  Starts from a root package and continues to all child packages
* `@SpringBootConfiguration` - indicates that the annotated class provides the Spring Boot application configuration

`SpringApplication` provided by Spring Boot to bootstrap a Spring Boot application

Create and run `SpringApplication` explicitly:
```java
@SpringBootApplication
public class SpringInitApplication {

  public static void main(String[] args) {
    SpringApplication springApplication = new SpringApplication(SpringInitApplication.class);
    springApplication.setWebApplicationType(WebApplicationType.REACTIVE);
    springApplication.run(args);
  }
}
```
### The structure of jar file, repackage by Spring 

* `META-INF/MANIFEST.MF` - defines entry point of the application
* `org/springframework/boot/load` - spring boot loader classes
* `BOOT-INF/classes` - application class files
* `BOOT-INF/lib` - the dependencies of your application
* `BOOT-INF/classpath.idx` - lists the dependencies with the order in which the class loader should load them
* `BOOT-INF/layers.idx` - used for JARs that allow the JAR to be segregated into logical layers 
for Docker or OCI image creation.

