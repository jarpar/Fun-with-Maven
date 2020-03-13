package io.github.mat3e;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        var logger = LoggerFactory.getLogger(App.class);
        logger.info("Hello World");
        //System.out.println("Hello World!");
    }
}
/*
/usr/lib/jvm/java-11-openjdk-amd64/bin/java -javaagent:/snap/intellij-idea-community/208/lib/idea_rt.jar=37299:/snap/intellij-idea-community/208/bin -Dfile.encoding=UTF-8 -classpath /home/user/IdeaProjects/Fun-with-Maven/target/classes:/home/user/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/home/user/.m2/repository/org/slf4j/slf4j-simple/1.7.25/slf4j-simple-1.7.25.jar io.github.mat3e.App
[main] INFO io.github.mat3e.App - Hello World

Process finished with exit code 0
 */