FROM openjdk:14-alpine
COPY build/libs/example-micronaut-thymeleaf-*-all.jar example-micronaut-thymeleaf.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "example-micronaut-thymeleaf.jar"]