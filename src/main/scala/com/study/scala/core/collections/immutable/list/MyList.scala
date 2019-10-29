package com.study.scala.core.collections.immutable.list

/**
  * A class for immutable linked lists representing ordered collections of elements of type A.
  *
  * This class comes with two implementing case classes scala.Nil and scala.:: that implement the abstract members isEmpty, head and tail.
  *
  * This class is optimal for last-in-first-out (LIFO), stack-like access patterns.
  * If you need another access pattern, for example, random access or FIFO, consider using a collection more suited to this than List.
  *
  * Performance
  *
  * Time: List has O(1) prepend and head/tail access.
  * Most other operations are O(n) on the number of elements in the list.
  * This includes the index-based lookup of elements, length, append and reverse.
  *
  * Space: List implements structural sharing of the tail list.
  * This means that many operations are either zero- or constant-memory cost.
  */
object MyList {

  def main(args: Array[String]): Unit = {

    val names = List("Denis", "Max", "")

    //prepending element creating new list
    val namesWithKevin = "Kevin" :: names

    //concatenating 2 lists creating new list
    val otherNames = List("Jack", "Black")

    val combinedNames = names ++ otherNames

    //pattern matching on list
    names match {
      case Nil => println("Empty")
      case head :: tail => println(head + " " + tail)
    }

  }
}
