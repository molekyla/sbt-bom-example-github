import sbt._
import com.here.bom.Bom

case class JacksonDependencies(platformBom: Bom) {
  val dependencies: Seq[ModuleID] = Seq(
    "com.fasterxml.jackson.core" % "jackson-databind" % platformBom
  )
}

trait DependenciesTrait {
  def dependencies: Seq[ModuleID]
}
