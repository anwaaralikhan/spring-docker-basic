FROM java:8
EXPOSE 8080

ADD /target/spring-docker-basic-0.0.1-SNAPSHOT.jar spring-docker-basic-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "spring-docker-basic-0.0.1-SNAPSHOT.jar" ]
