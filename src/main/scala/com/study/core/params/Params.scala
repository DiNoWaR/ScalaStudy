package com.study.core.params

import scala.util.Random

object Params {

  def sumParams(first: Int, second: Int = 5): Int = {
    first + second
  }

  def paramByName(value: => Int): Unit = {
    println(value)
    println(value)
    println("----")
  }

  def paramByValue(value: Int): Unit = {
    println(value)
    println(value)
    println("----")
  }


  def main(args: Array[String]): Unit = {

    // calling function with default param
    sumParams(2)
    sumParams(2, 4)

    // calling function by named params
    sumParams(second = 4, first = 1)

    // calling function by name and by value
    val random = new Random(100)
    paramByValue(random.nextInt(98))
    paramByName(random.nextInt(98))
  }
}
