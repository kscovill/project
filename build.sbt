name := "play2torial"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  cache,
  javaJdbc,
  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api"),
  "org.hibernate" % "hibernate-entitymanager" % "4.3.8.Final"
)

libraryDependencies += "org.webjars" % "jquery" % "1.11.2"
libraryDependencies += "org.webjars" % "bootstrap" % "2.1.1"
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.40"
