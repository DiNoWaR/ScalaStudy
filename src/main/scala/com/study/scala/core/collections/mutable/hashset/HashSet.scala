package com.study.scala.core.collections.mutable.hashset

import scala.collection.mutable.HashSet

/**
  * This class implements mutable sets using a hashtable.
  */
object HashSet {

  def main(args: Array[String]): Unit = {

    val days = new HashSet[String]()

    // append one element
    days += "Monday"

    // append collection
    days ++= List("Tuesday", "Friday")

    // Delete element. No exception will be thrown if no such element.
    days -= "Monday"
    days.remove("Tuesday")

  }
}
