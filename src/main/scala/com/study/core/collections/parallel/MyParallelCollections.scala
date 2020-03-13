package com.study.core.collections.parallel

import java.util.concurrent.ForkJoinPool

import scala.collection.parallel.ForkJoinTaskSupport

object MyParallelCollections {

  def main(args: Array[String]): Unit = {

    val namesList = List("Aman", "Alex", "Denis", "Andrews", "Kirk", "PPSN", "Sarah", "Thiyagu", "Swift")
    val namesParallelList = namesList.par

    namesParallelList.tasksupport = new ForkJoinTaskSupport(new ForkJoinPool(3))

    namesParallelList.map(name => name.toUpperCase).foreach(name => {
      println(name)
    })
  }
}