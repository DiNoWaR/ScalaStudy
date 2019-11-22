package com.study.core.implicits.implicitclasses

object MyImplicits {

  implicit class StringImplicit(value: String) {

    def append(input: String): String = {
      value + input
    }

    def prepend(input: String): String = {
      input + value
    }

  }

}
