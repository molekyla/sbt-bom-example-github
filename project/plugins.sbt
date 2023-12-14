resolvers += Resolver.url(
  "Artifactory Realm",
  url("https://repo.maven.apache.org/maven2"))(
  Patterns("[organisation]/[module]/[revision]/[artifact]-[revision](-[classifier]).[ext]"))
addSbtPlugin("com.here.platform" % "sbt-bom" % "1.0.4")