# Java 集合大练习

## 项目说明：

本项目致力于练习集合常用的操作：filter，map，flatmap，reduce，sort，skip，limit，allmatch等。
对于集合的操作，可以有多种方式实现，本教程主要用Java8 Stream API 的方式实现，您在实现测试的过程中，可以正对性的练习。

## 仓库说明
#### 1. 文件及文件夹说明：

* **src/test:** 该文件夹为测试所在文件夹，里面包含了项目的所有单元测试的文件。

* **src/mian：** 该文件为源码所在文件，里面是该应用程序的所有源代码。

* **requirement.md:** 该文件提供了为完成该程序所需要的所有知识点以及相关学习资料。



#### 2. 分支说明： 

* **master:** 该分支为未实现分支，主要包括了所有测试和部分已实现的脚手架代码，您需要基于此分支进行开发。

* **answer:** 该分支已经实现了项目所有需求，源代码全部包含在src/mian文件夹中，如果您在master分支上面实现功能时遇到了困难，您可以切换到该分支上面进行参考。

## 你该怎么做？

#### 1. 将本项目clone到您的本地：
```bash
git clone https://gitlab.com/tw-baseline-exam/java-collection-practice.git
```
#### 2. 安装JDK8，并配置Java开发环境：
```bash
java -version
java version "1.8.0_161"
Java(TM) SE Runtime Environment (build 1.8.0_161-b12)
Java HotSpot(TM) 64-Bit Server VM (build 25.161-b12, mixed mode)
```
#### 3. 下载并安装[IntelliJ IDEA](https://www.jetbrains.com/idea/download)
#### 4. 使用IntelliJ IDEA进行开发
用该编辑器打开此项目，可以自动导入相关的依赖，基于此进行开发。
* 可以使用IntelliJ IDEA去运行单个测试。
* 可以使用IntelliJ IDEA来启动项目，进行本地测试。
```bash
App.java -> run main method
```


## [Gradle](https://gradle.org/)使用说明：
本项目使用Gradle来管理相关的依赖，下面是一些您可能在此过程中用到的命令：
说明：下面的命令需要在项目的根目录下面执行：
#### 1. 跳过测试构建项目并引入相关依赖：
```bash
./gradlew clean build -x test
```
#### 2. 构建项目(不跳过测试)
```bash
./gradlew clean build
```
#### 3. 执行该项目的所有测试：
```bash
./gradlew test
```
#### 4. 用gradle运行该项目：
```bash
./gradlew run
```

## 其他说明：
#### 1. 完成该程序的顺序是什么？从哪里下手？
以我个人的经验，我推荐您以下面的顺序逐个完成(主要完成加了注释Need to be implement的部分)，完成一个文件后，运行该文件的测试，使得测试逐个通过：
* src/main/java/answer/Answer.java
* src/main/java/game/GuessResult.java
* src/main/java/game/Game.java

#### 2.如果自己还不具备完成该程序的知识，哪里可以学习？
由于学员水平不一，如果您觉得自己能够完成所有的功能，那就最好了，直接开干就行了！如果您发现自己有些代码看不明白或者是某个知识点不清楚，您可以以[requirement.md](https://gitlab.com/tw-baseline-exam/java-collection-practice/-/blob/master/requirement.md)列举的知识点和材料进行学习，加油哦！

