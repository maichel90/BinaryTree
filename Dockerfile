FROM openjdk:15-jdk
COPY /target/BinaryTree-0.0.1-SNAPSHOT.jar .
EXPOSE 9090
ENTRYPOINT ["java","-jar","BinaryTree-0.0.1-SNAPSHOT.jar"]