set jarVersion=1.0.0
set classifier=app-id
mvn install deploy:deploy-file -Dmaven.test.skip=true -Dclassifier.name=%classifier% -Dsources.classifier.name=%classifier%-sources -DgroupId=com.manda.go -DartifactId=go-common-service-facade -Dversion=%jarVersion%  -Dclassifier=%classifier%  -Dpackaging=jar -Dtypes=jar -Dclassifiers==%classifier%-sources -Dfile=target/go-common-service-facade-%jarVersion%.jar -Dfiles=target/go-common-service-facade-%jarVersion%.jar -Durl=http://localhost:8090/repository/maven-releases/ -DrepositoryId=mandalorian
