FROM openjdk:11
WORKDIR /app
COPY ./target/*.jar ./app/app.jar
EXPOSE 80 8080
RUN chmod 755 ./app/app.jar
ENTRYPOINT ["java","-jar","./app/app.jar"]

