name := "dispatch-lift-json"

version := "0.8.10"

organization := "net.databinder"

libraryDependencies ++= Seq(
  "net.databinder" %% "dispatch-core" % "0.8.10",
  "net.liftweb" %% "lift-json" % "2.5.1",
  "net.databinder" %% "dispatch-http" % "0.8.10" % "test",
  "org.scala-tools.testing" % "specs_2.9.1" % "1.6.9" % "test"
)
