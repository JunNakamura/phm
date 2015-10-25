name := """phm"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.37"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

seq(flywaySettings: _*)

flywayUrl := "jdbc:mysql://localhost/phm"

flywayUser := "phm"

flywayPassword := "phm_user"

flywayLocations := Seq("filesystem:db/migration")