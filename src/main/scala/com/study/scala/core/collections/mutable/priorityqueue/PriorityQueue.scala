package com.study.scala.core.collections.mutable.priorityqueue

import scala.collection.mutable.PriorityQueue

/**
  * This class implements priority queues using a heap.
  * To prioritize elements of type A there must be an implicit Ordering[A] available at creation.
  *
  * Only the dequeue and dequeueAll methods will return elements in priority order (while removing elements from the heap).
  * Standard collection methods including drop, iterator, and toString will remove or traverse the heap in whichever order seems most convenient.
  *
  * Therefore, printing a PriorityQueue will not reveal the priority order of the elements, though the highest-priority element will be printed first.
  * To print the elements in order, one must duplicate the PriorityQueue (by using clone, for instance) and then dequeue them
  */
object PriorityQueue {

  def main(args: Array[String]): Unit = {

    val numbers = new PriorityQueue[Int]()

    // enqueue one element
    numbers += 1

    // enqueue collection
    numbers ++= List(2, 10)

    //get root of heap
    numbers.head
  }
}
