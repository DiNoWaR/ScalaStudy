package com.study.core.concurrency.future

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Random, Success}

object NoneBlockingFuture {

  def main(args: Array[String]): Unit = {

    println("starting calculation ...")

    val myFuture = Future {
      Thread.sleep(Random.nextInt(500))
      "Denis from Future"
    }

    myFuture.onComplete {
      case Success(value) => println(s"Got the callback, meaning = $value")
      case Failure(e) => e.printStackTrace()
    }

    // do the rest of your work
    println("A ...")
    Thread.sleep(100)
    println("B ...")
    Thread.sleep(100)
    println("C ...")
    Thread.sleep(100)
    println("D ...")
    Thread.sleep(100)
    println("E ...")
    Thread.sleep(100)
    println("F ...")
    Thread.sleep(100)

    Thread.sleep(2000)

  }
}
