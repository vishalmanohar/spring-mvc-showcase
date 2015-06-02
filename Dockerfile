FROM tomcat:8.0.23
COPY target/spring-mvc-showcase.war /usr/local/tomcat/webapps/
