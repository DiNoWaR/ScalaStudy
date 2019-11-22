package com.study.core.implicits.implicitclasses

object ImplicitTest {

  def main(args: Array[String]): Unit = {

    import MyImplicits.StringImplicit

    println("Denis".append(" Scala Man"))
    println("Scala Man".prepend("Denis "))

  }

}
