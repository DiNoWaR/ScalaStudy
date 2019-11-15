package com.study.core.forcomprehension

object ForComprehensionSecond {

  def main(args: Array[String]): Unit = {

    val book = Books(List("Pushkin", "Lermontov"), "Stories")
    val books = List(book)

    for {
      book <- books
      author <- book.authors if author startsWith "Push"
    } yield book.title

    books.flatMap(book => book.authors
      .withFilter(author => author startsWith "Push")
      .map(author => book.title))

  }
}