package com.study.scala.core.monad.iomonad

case class IO[A](block: A) {

  def run: A = block

  def flatMap[B](f: A => IO[B]): IO[B] = IO(f(run).run)

  def map[B](f: A => B): IO[B] = flatMap(a => IO(f(a)))

}

