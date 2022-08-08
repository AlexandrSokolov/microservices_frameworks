**Note: You need to know property names,  based on the feature you want to configure**

### Build-time configuration with application.yml

Use `src/main/resources/application.yml` file.

```yaml
server:
  address: localhost
  port: 8080
  
management:
  endpoints:
    web:
      exposure:
        include: '*'
```

### Build-time configuration with application.properties

Use `src/main/resources/application.properties` file.

```properties
server.address=localhost
server.port=8081
management.endpoints.web.exposure.include=*
```