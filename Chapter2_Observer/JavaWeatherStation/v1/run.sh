javac -cp . -d ./build *.java
cd ./build
# jar -cvf myJar.jar
# java -jar myJar.jar
java -cp . WeatherStation
cd ../
rm -rf ./build/
