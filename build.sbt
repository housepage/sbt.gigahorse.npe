name := "p"

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
resolvers += "Open Source Geospatial Foundation Repository" at "http://download.osgeo.org/webdav/geotools/"

// See README.md
// With this version, `sbt update` fails with NPE in gigahorse.
// updateOptions := updateOptions.value.withGigahorse(true)

// With this version, `sbt update` works (i.e., it resolves and downloads the supersafe plugin)
updateOptions := updateOptions.value.withGigahorse(false)

val geotoolsApi = "org.geotools" % "gt-api" % "2.7.5"

libraryDependencies += geotoolsApi
