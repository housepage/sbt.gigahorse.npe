# SBT 1.0.[23] NPE with gigahorse.

```
[556] $ rm -rf  ~/.ivy2/cache/com.artima.supersafe/supersafe_2.12.3
rouquett@LMC-051345:ttys022 [0] : /opt/local/imce/users/nfr/github.imce/sbt.gigahorse.npe
[557] $ sbt
[info] Loading settings from supersafe.sbt ...
[info] Loading project definition from /opt/local/imce/users/nfr/github.imce/sbt.gigahorse.npe/project
[info] Loading settings from build.sbt ...
[info] Set current project to p (in build file:/opt/local/imce/users/nfr/github.imce/sbt.gigahorse.npe/)
[info] sbt server started at 127.0.0.1:5697
sbt:p> update
[info] Updating {file:/opt/local/imce/users/nfr/github.imce/sbt.gigahorse.npe/}p...
[warn] 	::::::::::::::::::::::::::::::::::::::::::::::
[warn] 	::          UNRESOLVED DEPENDENCIES         ::
[warn] 	::::::::::::::::::::::::::::::::::::::::::::::
[warn] 	:: com.artima.supersafe#supersafe_2.12.3;1.1.3: java.lang.NullPointerException at sbt.internal.librarymanagement.ivyint.GigahorseUrlHandler.getURLInfo(GigahorseUrlHandler.scala:54)
[warn] 	::::::::::::::::::::::::::::::::::::::::::::::
[warn] 
[warn] 	Note: Unresolved dependencies path:
[warn] 		com.artima.supersafe:supersafe_2.12.3:1.1.3 (Defaults.scala#L3038)
[warn] 		  +- default:p_2.12:0.1-SNAPSHOT
[error] sbt.librarymanagement.ResolveException: unresolved dependency: com.artima.supersafe#supersafe_2.12.3;1.1.3: java.lang.NullPointerException at sbt.internal.librarymanagement.ivyint.GigahorseUrlHandler.getURLInfo(GigahorseUrlHandler.scala:54)
[error] 	at sbt.internal.librarymanagement.IvyActions$.resolveAndRetrieve(IvyActions.scala:331)
[error] 	at sbt.internal.librarymanagement.IvyActions$.$anonfun$updateEither$1(IvyActions.scala:205)
[error] 	at sbt.internal.librarymanagement.IvySbt$Module.$anonfun$withModule$1(Ivy.scala:229)
[error] 	at sbt.internal.librarymanagement.IvySbt.$anonfun$withIvy$1(Ivy.scala:190)
[error] 	at sbt.internal.librarymanagement.IvySbt.sbt$internal$librarymanagement$IvySbt$$action$1(Ivy.scala:70)
[error] 	at sbt.internal.librarymanagement.IvySbt$$anon$3.call(Ivy.scala:77)
[error] 	at xsbt.boot.Locks$GlobalLock.withChannel$1(Locks.scala:93)
[error] 	at xsbt.boot.Locks$GlobalLock.xsbt$boot$Locks$GlobalLock$$withChannelRetries$1(Locks.scala:78)
[error] 	at xsbt.boot.Locks$GlobalLock$$anonfun$withFileLock$1.apply(Locks.scala:97)
[error] 	at xsbt.boot.Using$.withResource(Using.scala:10)
[error] 	at xsbt.boot.Using$.apply(Using.scala:9)
[error] 	at xsbt.boot.Locks$GlobalLock.ignoringDeadlockAvoided(Locks.scala:58)
[error] 	at xsbt.boot.Locks$GlobalLock.withLock(Locks.scala:48)
[error] 	at xsbt.boot.Locks$.apply0(Locks.scala:31)
[error] 	at xsbt.boot.Locks$.apply(Locks.scala:28)
[error] 	at sbt.internal.librarymanagement.IvySbt.withDefaultLogger(Ivy.scala:77)
[error] 	at sbt.internal.librarymanagement.IvySbt.withIvy(Ivy.scala:185)
[error] 	at sbt.internal.librarymanagement.IvySbt.withIvy(Ivy.scala:182)
[error] 	at sbt.internal.librarymanagement.IvySbt$Module.withModule(Ivy.scala:228)
[error] 	at sbt.internal.librarymanagement.IvyActions$.updateEither(IvyActions.scala:190)
[error] 	at sbt.librarymanagement.ivy.IvyDependencyResolution.update(IvyDependencyResolution.scala:20)
[error] 	at sbt.librarymanagement.DependencyResolution.update(DependencyResolution.scala:56)
[error] 	at sbt.internal.LibraryManagement$.resolve$1(LibraryManagement.scala:38)
[error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$12(LibraryManagement.scala:91)
[error] 	at sbt.util.Tracked$.$anonfun$lastOutput$1(Tracked.scala:68)
[error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$19(LibraryManagement.scala:104)
[error] 	at scala.util.control.Exception$Catch.apply(Exception.scala:224)
[error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$11(LibraryManagement.scala:104)
[error] 	at sbt.internal.LibraryManagement$.$anonfun$cachedUpdate$11$adapted(LibraryManagement.scala:87)
[error] 	at sbt.util.Tracked$.$anonfun$inputChanged$1(Tracked.scala:149)
[error] 	at sbt.internal.LibraryManagement$.cachedUpdate(LibraryManagement.scala:118)
[error] 	at sbt.Classpaths$.$anonfun$updateTask$5(Defaults.scala:2353)
[error] 	at scala.Function1.$anonfun$compose$1(Function1.scala:44)
[error] 	at sbt.internal.util.$tilde$greater.$anonfun$$u2219$1(TypeFunctions.scala:42)
[error] 	at sbt.std.Transform$$anon$4.work(System.scala:64)
[error] 	at sbt.Execute.$anonfun$submit$2(Execute.scala:257)
[error] 	at sbt.internal.util.ErrorHandling$.wideConvert(ErrorHandling.scala:16)
[error] 	at sbt.Execute.work(Execute.scala:266)
[error] 	at sbt.Execute.$anonfun$submit$1(Execute.scala:257)
[error] 	at sbt.ConcurrentRestrictions$$anon$4.$anonfun$submitValid$1(ConcurrentRestrictions.scala:167)
[error] 	at sbt.CompletionService$$anon$2.call(CompletionService.scala:32)
[error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
[error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
[error] 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
[error] 	at java.lang.Thread.run(Thread.java:748)
[error] (*:update) sbt.librarymanagement.ResolveException: unresolved dependency: com.artima.supersafe#supersafe_2.12.3;1.1.3: java.lang.NullPointerException at sbt.internal.librarymanagement.ivyint.GigahorseUrlHandler.getURLInfo(GigahorseUrlHandler.scala:54)
[error] Total time: 2 s, completed Nov 19, 2017 2:37:25 PM
sbt:p> 
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
/bin/rm -rf ~/.ivy2/cache/com.artima.supersafe/supersafe_2.12.3
```

- clean the target folders:

```
find . -name target -exec rm -r {} \;
```

- try it:

```
sbt update
```

- it should work:

```
[info] Loading settings from supersafe.sbt ...
[info] Loading project definition from /opt/local/imce/users/nfr/github.imce/sbt.gigahorse.npe/project
[info] Loading settings from build.sbt ...
[info] Set current project to p (in build file:/opt/local/imce/users/nfr/github.imce/sbt.gigahorse.npe/)
[info] Updating {file:/opt/local/imce/users/nfr/github.imce/sbt.gigahorse.npe/}p...
[info] downloading http://repo.artima.com/releases/com/artima/supersafe/supersafe_2.12.3/1.1.3/supersafe_2.12.3-1.1.3.jar ...
[info] 	[SUCCESSFUL ] com.artima.supersafe#supersafe_2.12.3;1.1.3!supersafe_2.12.3.jar (798ms)
[info] Done updating.
[success] Total time: 3 s, completed Nov 19, 2017 2:41:08 PM
```