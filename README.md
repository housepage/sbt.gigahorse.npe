# SBT 1.0.x and 1.1.x NPE with gigahorse.

```
[info] Updating {file:/Users/andrewgall/Developer/External/sbt.gigahorse.npe/}sbt-gigahorse-npe...
[warn]  ::::::::::::::::::::::::::::::::::::::::::::::
[warn]  ::          UNRESOLVED DEPENDENCIES         ::
[warn]  ::::::::::::::::::::::::::::::::::::::::::::::
[warn]  :: org.geotools#gt-api;2.7.5: java.lang.NullPointerException at sbt.internal.librarymanagement.ivyint.GigahorseUrlHandler.getURLInfo(GigahorseUrlHandler.scala:54)
[warn]  ::::::::::::::::::::::::::::::::::::::::::::::
[warn]
[warn]  Note: Unresolved dependencies path:
[warn]          org.geotools:gt-api:2.7.5 (/Users/andrewgall/Developer/External/sbt.gigahorse.npe/build.sbt#L15-16)
[warn]            +- p:p_2.12:0.1-SNAPSHOT
[error] sbt.librarymanagement.ResolveException: unresolved dependency: org.geotools#gt-api;2.7.5: java.lang.NullPointerException at sbt.internal.librarymanagement.ivyint.GigahorseUrlHandler.getURLInfo(GigahorseUrlHandler.scala:54)
[error]         at sbt.internal.librarymanagement.IvyActions$.resolveAndRetrieve(IvyActions.scala:331)
[error]         at sbt.internal.librarymanagement.IvyActions$.$anonfun$updateEither$1(IvyActions.scala:205)
[error]         at sbt.internal.librarymanagement.IvySbt$Module.$anonfun$withModule$1(Ivy.scala:229)
[error]         at sbt.internal.librarymanagement.IvySbt.$anonfun$withIvy$1(Ivy.scala:190)
[error]         at sbt.internal.librarymanagement.IvySbt.sbt$internal$librarymanagement$IvySbt$$action$1(Ivy.scala:70)
[error]         at sbt.internal.librarymanagement.IvySbt$$anon$3.call(Ivy.scala:77)
[error]         at xsbt.boot.Locks$GlobalLock.withChannel$1(Locks.scala:95)
[error]         at xsbt.boot.Locks$GlobalLock.xsbt$boot$Locks$GlobalLock$$withChannelRetries$1(Locks.scala:80)
[error]         at xsbt.boot.Locks$GlobalLock$$anonfun$withFileLock$1.apply(Locks.scala:99)
[error]         at xsbt.boot.Using$.withResource(Using.scala:10)
[error]         at xsbt.boot.Using$.apply(Using.scala:9)
[error]         at xsbt.boot.Locks$GlobalLock.ignoringDeadlockAvoided(Locks.scala:60)
[error]         at xsbt.boot.Locks$GlobalLock.withLock(Locks.scala:50)
[error]         at xsbt.boot.Locks$.apply0(Locks.scala:31)
[error]         at xsbt.boot.Locks$.apply(Locks.scala:28)
[error]         at sbt.internal.librarymanagement.IvySbt.withDefaultLogger(Ivy.scala:77)
[error]         at sbt.internal.librarymanagement.IvySbt.withIvy(Ivy.scala:185)
[error]         at sbt.internal.librarymanagement.IvySbt.withIvy(Ivy.scala:182)
[error]         at sbt.internal.librarymanagement.IvySbt$Module.withModule(Ivy.scala:228)
[error]         at sbt.internal.librarymanagement.IvyActions$.updateEither(IvyActions.scala:190)
[error]         at sbt.librarymanagement.ivy.IvyDependencyResolution.update(IvyDependencyResolution.scala:20)
[error]         at sbt.librarymanagement.DependencyResolution.update(DependencyResolution.scala:56)
[error]         at sbt.internal.LibraryManagement$.resolve$1(LibraryManagement.scala:38)
[error]         at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$12(LibraryManagement.scala:91)
[error]         at sbt.util.Tracked$.$anonfun$lastOutput$1(Tracked.scala:68)
[error]         at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$19(LibraryManagement.scala:104)
[error]         at scala.util.control.Exception$Catch.apply(Exception.scala:224)
[error]         at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$11(LibraryManagement.scala:104)
[error]         at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$11$adapted(LibraryManagement.scala:87)
[error]         at sbt.util.Tracked$.$anonfun$inputChanged$1(Tracked.scala:149)
[error]         at sbt.internal.LibraryManagement$.cachedUpdate(LibraryManagement.scala:118)
[error]         at sbt.Classpaths$.$anonfun$updateTask$5(Defaults.scala:2353)
[error]         at scala.Function1.$anonfun$compose$1(Function1.scala:44)
[error]         at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:42)
[error]         at sbt.std.Transform$$anon$4.work(System.scala:64)
[error]         at sbt.Execute.$anonfun$submit$2(Execute.scala:257)
[error]         at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:16)
[error]         at sbt.Execute.work(Execute.scala:266)
[error]         at sbt.Execute.$anonfun$submit$1(Execute.scala:257)
[error]         at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:167)
[error]         at sbt.CompletionService$$anon$2.call(CompletionService.scala:32)
[error]         at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error]         at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[error]         at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error]         at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
[error]         at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
[error]         at java.lang.Thread.run(Thread.java:748)
[error] (*:update) sbt.librarymanagement.ResolveException: unresolved dependency: org.geotools#gt-api;2.7.5: java.lang.NullPointerException at sbt.internal.librarymanagement.ivyint.GigahorseUrlHandler.getURLInfo(GigahorseUrlHandler.scala:54)
[error] Total time: 1 s, completed Feb 20, 2018 4:27:46 PM
```

Edit `build.sbt`:

- comment this line:

```
//updateOptions := updateOptions.value.withGigahorse(true)
```

- uncomment this line:

```
updateOptions := updateOptions.value.withGigahorse(false)
```

- clean the cache:

```
/bin/rm -rf ~/.ivy2/cache/org.geotools*
```

- try it:

```
sbt update
```

- it should work:

```
Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=2524M; support was removed in 8.0
[info] Loading settings from idea.sbt ...
[info] Loading global plugins from /Users/andrewgall/.sbt/1.0/plugins
[info] Loading settings from supersafe.sbt ...
[info] Loading project definition from /Users/andrewgall/Developer/External/sbt.gigahorse.npe/project
[info] Loading settings from build.sbt ...
[info] Set current project to p (in build file:/Users/andrewgall/Developer/External/sbt.gigahorse.npe/)
[info] Updating {file:/Users/andrewgall/Developer/External/sbt.gigahorse.npe/}sbt-gigahorse-npe...
[info] downloading http://download.osgeo.org/webdav/geotools/org/geotools/gt-metadata/2.7.5/gt-metadata-2.7.5.jar ...
[info] downloading http://download.osgeo.org/webdav/geotools/org/geotools/gt-api/2.7.5/gt-api-2.7.5.jar ...
[info] downloading http://download.osgeo.org/webdav/geotools/org/geotools/gt-referencing/2.7.5/gt-referencing-2.7.5.jar ...
[info] downloading http://download.osgeo.org/webdav/geotools/org/geotools/gt-opengis/2.7.5/gt-opengis-2.7.5.jar ...
[info]  [SUCCESSFUL ] org.geotools#gt-api;2.7.5!gt-api.jar (181ms)
[info]  [SUCCESSFUL ] org.geotools#gt-opengis;2.7.5!gt-opengis.jar (226ms)
[info]  [SUCCESSFUL ] org.geotools#gt-referencing;2.7.5!gt-referencing.jar (288ms)
[info]  [SUCCESSFUL ] org.geotools#gt-metadata;2.7.5!gt-metadata.jar (359ms)
[info] Done updating.
[success] Total time: 3 s, completed Feb 20, 2018 4:30:21 PM
```
