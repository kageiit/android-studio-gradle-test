# android-studio-gradle-test
A test project with a structure to stress test and find out issues in Android Studio and Gradle

Also provides an alternative build path using [Buck](https://buckbuild.com/) to compare

## To build all apps with gradle:
```bash
./gradlew assemble
```

## To build all apps with buck

### Setup
```bash
brew update
brew install watchman
brew tap facebook/fb
brew install buck --HEAD
./gradlew okbuck # Use to generate BUCK files from gradle project
```

### Build
```bash
buck query "kind('android_binary', '//...')" | xargs buck build
```

## Incremental build comparision

An example use case would be to uncomment line 7 in `e/build.gradle` to check the effect of a new dependency as part of an incremental build. Run `okbuck` again to regenrate buck files, since the dependencies changed
