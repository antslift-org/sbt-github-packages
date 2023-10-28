/*
 * Copyright 2019 Daniel Spiewak
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

name := "sbt-github-packages"

ThisBuild / baseVersion := "0.6"

ThisBuild / organization := "com.antslift"
ThisBuild / organizationName := "Antslift"
ThisBuild / publishGithubUser := "weipingc"
ThisBuild / publishFullName := "Weiping Chen"

ThisBuild / sbtVersion := "1.9.6"
sbtPlugin := true

enablePlugins(SbtPlugin)

homepage := Some(url("https://github.com/djspiewak/sbt-github-packages"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/antslift-org/sbt-github-packages"),
    "scm:git@github.com:antslift-org/sbt-github-packages.git"
  )
)

developers := List(
  Developer(
    id = "djspiewak",
    name = "Daniel Spiewak",
    email = "djspiewak@gmail.com",
    url = url("https://github.com/djspiewak")
  ),
  Developer(
    id = "weipingc",
    name = "Weiping Chen",
    email = "weiping.chen@gmail.com",
    url = url("https://github.com/weipingc")
  )
)

publishMavenStyle := true

scriptedLaunchOpts ++= Seq("-Dplugin.version=" + version.value)
scriptedBufferLog := true
