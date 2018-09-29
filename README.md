# Spring + Kafka

Apache Kafka is an open source Stream processing platform developed by Apache.

This project aims to provide high through-put, low-latency and real time data feeds


##Steps to configure Apache Kafka for spring boot application

###Manual steps to verify kafka works !!
1. Download Apache Kafka from software folder
2. Start Apache Zookeper (<Downloaded location>.\bin\zookeeper-server-start.bat .\config\zookeeper.properties)
3. Start Apache Kafka (<Downloaded location>. \bin\kafka-server-start.bat .\config\server.properties)
4. Create a topic with some name(In the example, topic name is javainuse-topic) (<Downloaded location>.\bin\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic javainuse-topic)
5. Create a Producer (.\bin\kafka-console-producer.bat --broker-list localhost:9092 --topic javainuse-topic Hello World)
6. Create a Consumer (.\bin\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic javainuse-topic --from-beginning)
   
###Steps to run kafka through spring boot application
1. Download and start the boot application, ensure your Kafka also runs on the same port
2. And hit URL http://localhost:8080//javainuse-kafka/producer?message=test
3. See the data in Kafka Tool for more details

Internet Source : 
Ref 1 : https://www.javainuse.com/misc/apache-kafka-hello-world
Ref 2 : https://www.javainuse.com/spring/spring-boot-apache-kafka-hello-world


