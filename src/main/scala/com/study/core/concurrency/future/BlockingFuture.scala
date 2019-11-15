package com.study.core.concurrency.future

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}

object BlockingFuture {

  def main(args: Array[String]): Unit = {

    println("starting calculation ...")

    val myFuture = Future {
      Thread.sleep(1500)
      "Denis from Future"
    }

    val result = Await.result(myFuture, 3 second)
    println(result)

    //
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
