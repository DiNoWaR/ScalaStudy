package com.study.core.collections.mutable.priorityqueue

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
object MyPriorityQueue {

  def main(args: Array[String]): Unit = {

    val numbers = new PriorityQueue[Int]()

    // enqueue one element
    numbers.enqueue(1)

    // enqueue collection
    numbers ++= List(2, 10)

    // dequeue element from root of heap
    val item = numbers.dequeue

    // dequeue all elements from root of heap, keeping the order
    val items = numbers.dequeueAll

    //get root of heap without removing it
    val head = numbers.head

  }
}
