FROM java:8
EXPOSE 8080
ADD /target/spring-docker-basic.jar spring-docker-basic.jar
ENTRYPOINT ["java","-jar", "spring-docker-basic.jar" ]