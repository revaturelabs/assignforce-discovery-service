FROM java:8
ADD target/discovery-service.jar .
EXPOSE 8761
CMD java -jar -Xmx512M discovery-service.jar