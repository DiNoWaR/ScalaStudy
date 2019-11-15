package com.study.core

package object forcomprehension {

  case class Book(author: String, title: String)

  case class Books(authors: List[String], title: String)

}
