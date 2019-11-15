package com.study.core.collections.mutable.arraybuffer

import scala.collection.mutable.ArrayBuffer

/**
  * Append, update and random access take constant time (amortized time).
  * Prepends and removes are linear in the buffer size.
  */
object MyArrayBuffer {

  def main(args: Array[String]): Unit = {

    val names = new ArrayBuffer[String]()

    // append one element
    names += "Denis"
    names.append("Denis")

    // append collection
    names ++= List("Denis", "Thomas")

    // prepend one element
    names.prepend("Denis")

    // Delete element. No exception will be thrown if no such element.
    names -= "Thomas"

    // Delete by index. Exception will be thrown if no element by index.
    names.remove(0)

    // Get element by index.
    names(1)

  }
}
