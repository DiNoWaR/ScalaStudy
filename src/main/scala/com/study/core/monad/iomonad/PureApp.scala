package com.study.core.monad.iomonad

import scala.io.StdIn

object PureApp extends App {

  def printString(input: String): IO[Unit] = IO {
    println(input)
  }

  def getString: IO[String] = IO {
    StdIn.readLine()
  }

  val app = for {
    _ <- printString("Hello User")
    _ <- printString("Please enter your first name")
    firstName <- getString
    _ <- printString("Please enter your last name")
    lastName <- getString
    _ <- printString("User details as below: ")
    _ <- printString(s"First Name is $firstName, Last Name is $lastName")
  } yield ()

  app.run
}
