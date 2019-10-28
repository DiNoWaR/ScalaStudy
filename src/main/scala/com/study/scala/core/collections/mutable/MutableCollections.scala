package com.study.scala.core.collections.mutable

import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object MutableCollections {

  def main(args: Array[String]): Unit = {

    /**
      * ArrayBuffer
      *
      * Append, update and random access take constant time (amortized time).
      * Prepends and removes are linear in the buffer size.
      */
    val names = new ArrayBuffer[String]()

    /**
      * ListBuffer
      *
      * Provides constant time prepend and append. Most other operations are linear.
      */
    val cars = new ListBuffer[String]()

    // append one element
    names += "Denis"
    cars += "Tesla"

    names.append("Denis")
    cars.append("Tesla")

    // prepend one element
    names.prepend("Denis")
    cars.prepend("Tesla")

    // Delete element. No exception will be thrown if no such element.
    names -= "Thomas"
    cars -= "Toyota"

    // Delete by index. Exception will be thrown if no element by index.
    names.remove(0)
    cars.remove(0)

    //Set
    //Map

  }

}
