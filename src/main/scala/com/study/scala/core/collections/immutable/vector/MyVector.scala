package com.study.scala.core.collections.immutable.vector

/**
  * Vector is a general-purpose, immutable data structure.
  * It provides random access and updates in effectively constant time, as well as very fast append and prepend.
  * Because vectors strike a good balance between fast random selections and fast random functional updates, they are currently the default implementation of immutable indexed sequences.
  * It is backed by a little endian bit-mapped vector trie with a branching factor of 32.
  * Locality is very good, but not contiguous, which is good for very large sequences.
  */
object MyVector {

  def main(args: Array[String]): Unit = {

    val names = Vector("Denis", "Max", "James") ++ Set("","")

    //prepending element creating new Vector
    val namesWithKevin = "Kevin" +: names

    //prepending multiple elements creating new Vector
    val namesWithPrependedList = Seq("Greg", "Tom") ++: names

    //appending element creating new Vector
    val namesWithSarah = names :+ "Sarah"

    //appending multiple elements creating new Vector
    val namesWithAppendedList = names ++ Seq("Kirk", "Lars")

    //concatenating 2 vector creating new vector
    val otherNames = Vector("Jack", "Black")

    val combinedNames = names ++ otherNames

  }
}
