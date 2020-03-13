package com.study.core.option

import scala.util.{Failure, Try}

object MyOption {

  def main(args: Array[String]): Unit = {

    val connection = "Denis"

    Try {
      val x = select(5, 0)

    } recoverWith {
      case ex: Throwable =>
        cleanUp(connection)
        Failure(ex)
    }

  }

  def cleanUp(connection: String): Unit = {
    println("connection closed")
  }

  def select(first: Int, second: Int): Int = {
    first / second
  }

}
