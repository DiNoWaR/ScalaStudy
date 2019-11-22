package com.study.core.implicits.implicitparams

object ImplicitParamsTest {

  implicit private val lastName: String = "Vasilyev"

  def printInfo(name: String)(implicit lastname: String): Unit = {
    println(s"$name $lastname")
  }

  def main(args: Array[String]): Unit = {
    printInfo("Denis")
  }

}
