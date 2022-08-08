### packaging war
### packaging multi-module war
### packaging multi-module jar
### generate multi-module project with spring boot, or just add spring-boot support after the generation
### `spring-boot-maven-plugin` configuration for multi-module project
in parent, or in the deps? 

### jar command line application

@SpringBootApplication

// Main class

// Implementing CommandLineRunner interface
public class SpringBootAppApplication implements CommandLineRunner
{
// Method 1

    // run() method for springBootApplication to execute
    @Override
    public void run(String args[]) throws Exception
    {
        // Print statement when method is called
        System.out.println("HEllo world");
    }
}

### how to externalize application properties for a Spring Boot application
### @SpringBootConfiguration example 
### @EnableAutoConfiguration alternatives?
### What it scanned by @ComponentScan? //@Component , @Bean

```java
ApplicationContext ctx = SpringApplication.run(SpringBootDemoApplication.class, args);
 
String[] beanNames = ctx.getBeanDefinitionNames();
 
Arrays.sort(beanNames);
 
for (String beanName : beanNames) 
{
    System.out.println(beanName);
}
```

See also bean configuration: https://spring.io/guides/gs/spring-boot/
```java
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}
```

### ApplicationContext example of usage
The ApplicationContext interface acts as the Spring IoC Container

* If the application is identified as a Servlet-based web application, Spring Boot attempts to create an instance of 
AnnotationConfigServletWebServerApplicationContext class.
* If the application is reactive type, Spring Boot creates an instance of the 
AnnotationConfigReactiveWebServerApplicationContext class.
* If the application is neither a Servlet-based nor a reactive application, Spring Boot attempts to create an instance of 
AnnotationConfigApplicationContext class.

### CommandLinePropertySource
### ApplicationRunners and CommandRunners
### Spring Boot components - overview, add a question

### `1.4 Spring Boot additional concepts` chapter in Spring Boot in Practice

