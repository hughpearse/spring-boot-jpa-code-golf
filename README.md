# spring-boot-jpa-code-golf-001
A simple eclipse project for hibernate web application and rest services using spring boot (code golf -> 73 lines of code)

```
git clone https://github.com/hughpearse/spring-boot-jpa-code-golf-001.git
cd spring-boot-jpa-code-golf-001
gradle wrapper
./gradlew clean build bootRun
curl http://localhost:8080/fruit/add?name=Apple
curl http://localhost:8080/fruit/all
curl http://localhost:8080/fruit/search?name=Apple
```
