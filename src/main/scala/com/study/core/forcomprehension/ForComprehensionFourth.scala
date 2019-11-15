package com.study.core.forcomprehension

object ForComprehensionFourth {

  def main(args: Array[String]): Unit = {

    val optNumbers = List(Some(1), Some(2), None, Some(3))

    for {
      optNumber <- optNumbers
      value <- optNumber
    } yield value + 1

    optNumbers.flatMap(optNumber => optNumber.map(value => value + 1))

  }
}
