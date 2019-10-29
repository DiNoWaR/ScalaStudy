package com.study.scala.core.collections.mutable.listbuffer

import scala.collection.mutable.ListBuffer

/**
  * Provides constant time prepend and append.
  * Most other operations are linear.
  */
object MyListBuffer {

  def main(args: Array[String]): Unit = {

    val cars = new ListBuffer[String]()

    // append one element
    cars += "Tesla"
    cars.append("Tesla")

    // append collection
    cars ++= Set("Tesla", "Toyota")

    // prepend one element
    cars.prepend("Tesla")

    // Delete element. No exception will be thrown if no such element.
    cars -= "Toyota"

    // Delete by index. Exception will be thrown if no element by index.
    cars.remove(0)

    // Get element by index.
    cars(1)

  }
}
