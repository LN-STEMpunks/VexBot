# VexBot java

No more toast! Just ANT

## Getting started

First, set up your work environment:

### Eclipse or IntelliJ IDEA

1. Run `./gradlew eclipse` for eclipse, or `./gradlew idea` for IntelliJ  
2. Edit the `build.gradle` file to reflect your desired configuration (e.g. changing the Team Number)  
3. Open the project using `File -> Open Project`
4. To build, go to the directory in a shell and run `./gradlew deploy`
If you haven't already, you can deploy [Toast](https://github.com/Open-RIO/ToastAPI) to your Robot by running `./gradlew deploy`.


### NetBeans

1. Install Gradle plugin for Netbeans (Go to `Tools -> Plugins -> Available Plugins` and search `Gradle JavaEE`. Install that plugin, restart netbeans).
2. Install FRC Netbeans plugin (Go to `Tools -> Plugins -> Settings` and click `Add` for name, use something like `FRC Plugins`, and for the url, use `http://first.wpi.edu/FRC/java/netbeans/update/Release/updates.xml`).
3. Go to `Tools -> Available Plugins`, and search `FRC` check all the boxes. Now click `Install`. Restart the IDE when it asks.
4. Go to `Tools -> Options -> Miscellaneous -> FRC Configuration` and set `Team Number` to `3966`.
5. Open the repo using `File -> Open Project`
6. Now you can click the large green button in Netbeans, and it runs `./gradlew clean build`

## Deploying

After you have set up your environment, you'll want to deploy to a robot.

On all platforms, use:

`ant deploy`

or, to test the build, run:

`ant build`
