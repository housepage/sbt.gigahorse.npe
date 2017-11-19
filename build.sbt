name := "p"

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

// See README.md
// With this version, `sbt update` fails with NPE in gigahorse.
updateOptions := updateOptions.value.withGigahorse(true)

// With this version, `sbt update` works (i.e., it resolves and downloads the supersafe plugin)
// updateOptions := updateOptions.value.withGigahorse(false)