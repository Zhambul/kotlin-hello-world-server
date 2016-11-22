FROM java:8

WORKDIR data/
ADD target/*jar-with-dependencies.jar app.jar
CMD java -cp app.jar com.zhambyl.app.Main