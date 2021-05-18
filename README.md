## Share Link: Spring Initializr
```
https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.4.5.RELEASE&packaging=jar&jvmVersion=11&groupId=com.rosyidgrobogan&artifactId=fullstack-spring-boot-react&name=fullstack-spring-boot-react&description=Demo%20project%20for%20Spring%20Boot&packageName=com.rosyidgrobogan.fullstack-spring-boot-react&dependencies=web,lombok,postgresql,data-jpa,flyway
```

## Clean Up Fly Way
```
 mvn clean compile -Dflyway.user=postgres -Dflyway.password=rahasia -Dflyway.url=jdbc:postgresql://localhost:5432/latihandocker flyway:clean
```