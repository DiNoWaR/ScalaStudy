package com.study.scala.core.functor

/**
  * Functor example
  */
case class Functor[A](content: A) {

  def map[B](func: A => B): Functor[B] = Functor(func(content))

}
