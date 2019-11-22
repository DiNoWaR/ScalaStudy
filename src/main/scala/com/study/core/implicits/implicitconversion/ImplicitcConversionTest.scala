package com.study.core.implicits.implicitconversion

object ImplicitcConversionTest {

  implicit private def convert(value: Int): String = {
    value.toString
  }

  def main(args: Array[String]): Unit = {
    println(42.toUpperCase())
  }

}
