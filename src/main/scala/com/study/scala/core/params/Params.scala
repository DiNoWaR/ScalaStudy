package com.study.scala.core.params

object Params {

  def sumParams(first: Int, second: Int = 5): Int = {
    first + second
  }

  def main(args: Array[String]): Unit = {

    // calling function with default param
    sumParams(2)
    sumParams(2, 4)

    // calling function by named params
    sumParams(second = 4, first = 1)

  }
}
