# Spring dependencies

- [Spring BOM for multi-module project](#spring-bom)

### Spring BOM
```xml
<project>
  
  <properties>
    <spring-boot.version>2.7.2</spring-boot.version>
  </properties>
  
  <dependencyManagement>
    <dependencies>
      <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-dependencies -->
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-dependencies</artifactId>
        <version>${spring-boot.version}</version>
        <type>pom</type>
        <scope>import</scope>
      </dependency>
    </dependencies>
  </dependencyManagement>
</project>
```

### Additional configuration, required for multi-module maven project, not based on `spring-boot-starter-parent`

You must configure `spring-boot-maven-plugin`

```xml
<build>
  <plugins>
    <plugin>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-maven-plugin</artifactId>
    </plugin>
  </plugins>
</build>
```
