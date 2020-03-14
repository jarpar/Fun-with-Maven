package io.github.mat3e;

import org.eclipse.jetty.annotations.AnnotationConfiguration;
import org.eclipse.jetty.plus.webapp.EnvConfiguration;
import org.eclipse.jetty.plus.webapp.PlusConfiguration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        var webapp = new WebAppContext();
        webapp.setResourceBase("src/main/webapp");
        webapp.setContextPath("/");
        webapp.setConfigurations(new Configuration[]

                {
                        new AnnotationConfiguration(),
                        new WebInfConfiguration(),
                        new WebXmlConfiguration(),
                        new MetaInfConfiguration(),
                        new FragmentConfiguration(),
                        new EnvConfiguration(),
                        new PlusConfiguration(),
                        new JettyWebXmlConfiguration()
                });


//        webapp.addServlet(HelloServlet.class, "/api/*");
        var server = new Server(8080);
        server.setHandler(webapp);

        server.start();
        server.join();
    }
}
/*
/usr/lib/jvm/java-11-openjdk-amd64/bin/java -javaagent:/snap/intellij-idea-community/208/lib/idea_rt.jar=37299:/snap/intellij-idea-community/208/bin -Dfile.encoding=UTF-8 -classpath /home/user/IdeaProjects/Fun-with-Maven/target/classes:/home/user/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/home/user/.m2/repository/org/slf4j/slf4j-simple/1.7.25/slf4j-simple-1.7.25.jar io.github.mat3e.App
[main] INFO io.github.mat3e.App - Hello World

Process finished with exit code 0
 */