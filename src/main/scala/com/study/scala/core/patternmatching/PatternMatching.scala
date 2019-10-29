package com.study.scala.core.patternmatching

sealed trait Animal
sealed case class Dog(name: String) extends Animal
sealed case class Cat(name: String) extends Animal
object Woodpecker extends Animal


object PatternMatching extends App {

  def determineType(animal: Animal): String = animal match {

    case Dog("Pluto") => ""

    case Dog(moniker) => "Got a Dog, name = " + moniker

    case _: Cat => "Got a Cat (ignoring the name)"

    case Woodpecker => "That was a Woodpecker"

    case _ => "That was something else"
  }

  println(determineType(Dog("Rocky")))
  println(determineType(Cat("Rusty the Cat")))
  println(determineType(Woodpecker))
}