package com.study.core.collections.immutable.hashset

/**
  * A set is a collection that contains no duplicate elements.
  */
object MyHashSet {

  def main(args: Array[String]): Unit = {

    val names = Set("Denis", "Max", "James")

    //adding element to set, crearting new Set
    val namesWithKevin = names + "Kevin"

    //concatenating 2 sets creating new Set
    val otherNames = Set("Jack", "Black")
    val combinedNames = names ++ otherNames

    //check if set contains the element with 0(1) complexity
    val exists = names.contains("Denis")

  }

}
