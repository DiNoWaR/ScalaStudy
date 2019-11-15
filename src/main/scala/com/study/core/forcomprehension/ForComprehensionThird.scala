package com.study.core.forcomprehension

object ForComprehensionThird {

  def main(args: Array[String]): Unit = {

    val optA: Option[String] = Some("a value")
    val optB: Option[String] = Some("b value")

    for {
      a <- optA
      b <- optB
    } yield (a, b)

    optA.flatMap(a => optB.map(b => (a, b)))


    for {
      a <- optA if a startsWith "a"
      b <- optB
    } yield (a, b)

    optA.withFilter(a => a startsWith "a").flatMap(a => optB.map(b => (a, b)))

  }
}
