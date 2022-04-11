FROM tomcat:9

COPY /home/azureuser/myagent/_work/4/s/target/petclinic.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh", "run"]
