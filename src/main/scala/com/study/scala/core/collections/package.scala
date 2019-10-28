package com.study.scala.core

package object collections {

  sealed case class Student(name: String, lastName: String, age: Int)

  val students: Seq[Student] = Seq(
    Student("Denis", "Vasilyev", 21),
    Student("Artem", "Dzyuba", 22),
    Student("Slava", "Rostov", 31),
    Student("Boris", "Mitioglov", 10),
    Student("Anton", "Pronchakov", 24),
    Student("Max", "Artamonov", 29),
    Student("Max", "Orlov", 10)
  )

}
