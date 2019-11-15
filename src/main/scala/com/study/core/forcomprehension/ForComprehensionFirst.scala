package com.study.core.forcomprehension

object ForComprehensionFirst {

  def main(args: Array[String]): Unit = {

    val books = List(Book("Pushkin", "Onegin"))

    for {
      book <- books if book.author startsWith "Push"
    } yield book.title

    books.withFilter(book => book.author startsWith "Push").map(book => book.title)

  }
}

