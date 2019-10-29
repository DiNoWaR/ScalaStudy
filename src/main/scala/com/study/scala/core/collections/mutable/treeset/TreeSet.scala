package com.study.scala.core.collections.mutable.treeset

import scala.collection.mutable.TreeSet

/**
  * A mutable sorted set implemented using a mutable red-black tree as underlying data structure.
  */
object TreeSet {

  def main(args: Array[String]): Unit = {

    val cities = new TreeSet[String]()

    // append one element
    cities += "Milpitas"
    cities.add("Milpitas")

    // append collection
    cities ++= List("SF", "LA")

    // Delete element. No exception will be thrown if no such element.
    cities -= "SF"
    cities.remove("LA")

  }
}
