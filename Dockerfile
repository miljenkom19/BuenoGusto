FROM adoptopenjdk/openjdk16:ubi

WORKDIR /src
COPY . /src

COPY ./build/libs/*.jar /run/server.jar
WORKDIR /run

EXPOSE 8080:8080

CMD java -jar server.jar