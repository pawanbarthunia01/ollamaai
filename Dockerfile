FROM openjdk:17
ADD target/ai.jar /ai.jar
EXPOSE 8086
ENTRYPOINT [ "java","-jar","/ai.jar" ]