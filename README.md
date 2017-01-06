# VexBot

[![Build Status](https://travis-ci.org/LN-STEMpunks/VexBot.svg?branch=master)](https://travis-ci.org/LN-STEMpunks/VexBot)

Code for our Vex Pro robot, and this repo is used to create new robots. 


## Getting Started

Clone the repository:

`git clone https://github.com/LN-STEMpunks/VexBot.git && cd VexBot`

Now, switch the the `dev` branch:

`git checkout dev && git branch -u origin/dev`

Now, code away!


When you've made a change, run `git add FILE; git commit -m"Message Here"; git push`, and it should push to the `dev` branch

If you haven't already, you can deploy [Toast](https://github.com/Open-RIO/ToastAPI) to your Robot by running `./gradlew deploy`.


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


## Developing

First, follow [Getting Started](#Getting%20Started), then:


## Process

Written by the [L&N STEMpunks](lnstempunks.org). More specifically, the [programming team](ln-stempunks.github.io).

We use gradle, GradleRIO, Toast, Travis, Git, Java, and primarily NetBeans to develop this.

Ben Klein wrote most of the base, which was then refactored by Cade Brown.


## New Robot

To create a new robot, create a repo and run:

``` bash
ROBOT='Duke'
URL="https://github.com/LN-STEMpunks/$ROBOT.git"
git clone https://github.com/LN-STEMpunks/VexBot.git $ROBOT && cd $ROBOT
sed -i -e "s/VexBot/$ROBOT/g" README.md
git remote set-url origin $URL
git push
```
Then, you may need to replace some other things as well.


## Licensing

See [LICENSE.md](./LICENSE.md) for an explanation, or [our full licensing page](lnstempunks.github.io/licensing/).

Essentially, this repo is GPLv3 with some BSD and Apache components.
