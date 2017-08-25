sbtPlugin := true

name := "sbt-dotenv"
organization := "au.com.onegeek"

description := "An SBT Plugin to load environment variables from .env into the JVM System Environment for local development. Assists with 'Twelve Factor App' development principle 3 'Store config in the environment'."

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
    "net.java.dev.jna" % "jna" % "4.4.0",
    "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

scriptedLaunchOpts := { scriptedLaunchOpts.value ++
  Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
}
scriptedBufferLog := false

publishMavenStyle := false

bintrayRepository := "sbt-plugins"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

bintrayOrganization := None
