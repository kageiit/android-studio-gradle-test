# android-studio-gradle-test
A test project with a structure to stress test and find out issues in Android Studio and Gradle

Also provides an alternative build path using [Buck](https://buckbuild.com/) to compare. For more details on how the buck build path is setup, please see [OkBuck](https://github.com/uber/okbuck)

[![Master branch build status](https://travis-ci.org/kageiit/android-studio-gradle-test.svg?branch=master)](https://travis-ci.org/kageiit/android-studio-gradle-test)

## To build all apps with gradle:
```bash
./buildWithGradle
```

## To build all apps with buck

### Setup
#### Mac OS X
```bash
brew update
brew install ant watchman
```

#### Linux
Installation instructions for: [Ant](http://ant.apache.org/), [Watchman](https://facebook.github.io/watchman/docs/install.html)

### Build
```bash
./buildWithBuck
```

## Incremental build comparision

Uncomment line 7 in `e/build.gradle` to check the effect of an ABI incompatible change in an incremental build.

Modify the `onReceive` method of the `TestReceiver` class in the `e` module, to check the effect of an ABI compatible change in an incremental build.
