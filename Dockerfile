FROM openjdk:17
VOLUME /tmp
EXPOSE 9100
ADD ./target/springboot-ms-oauth-0.0.1-SNAPSHOT.jar springboot-ms-oauth.jar
ENTRYPOINT ["java", "-jar", "/springboot-ms-oauth.jar"]