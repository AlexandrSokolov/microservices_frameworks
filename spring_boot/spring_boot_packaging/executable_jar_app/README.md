Requirements:

Configure in [pom.xml](pom.xml)
1. `spring-boot-starter-parent` 
2. `spring-boot-starter`
3. `spring-boot-maven-plugin` configure as:
```xml
<plugin>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-maven-plugin</artifactId>
  <configuration>
    <executable>true</executable>
  </configuration>
</plugin>
```