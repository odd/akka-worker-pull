name := "worker"

organization := "letitcrash"

version := "0.1"

scalaVersion := "2.10.1"

resolvers ++= Seq(
  "Typesafe Artifactory Repository" at "http://repo.typesafe.com/typesafe/releases"
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.1.2",
  "com.typesafe.akka" %% "akka-testkit" % "2.1.2",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)
