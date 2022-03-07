FROM adoptopenjdk/openjdk16:ubi

WORKDIR /src
COPY . /src

COPY ./build/libs/*.jar /run/server.jar
WORKDIR /run

EXPOSE 5777:5777

CMD java -jar server.jar