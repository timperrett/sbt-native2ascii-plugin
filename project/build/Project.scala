import sbt._

class Native2AsciiPlugin(info: ProjectInfo) extends PluginProject(info) {
  
  val ant = "ant" % "ant" % "1.5.2" % "compile->default"
  val optional = "ant" % "ant-optional" % "1.5.2" % "compile->default"
  
  // repository config for publishing
  override def managedStyle = ManagedStyle.Maven
  val publishTo = "Scala Tools Nexus" at "http://nexus.scala-tools.org/content/repositories/releases/"
  Credentials(Path.userHome / ".ivy2" / ".credentials", log)
}