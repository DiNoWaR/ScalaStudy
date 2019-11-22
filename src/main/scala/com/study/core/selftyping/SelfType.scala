package com.study.core.selftyping

trait User {
  def username: String
}

trait Tweeter {

  this: User => // reassign this
  def tweet(tweetText: String): Unit = println(s"$username: $tweetText")
}

class VerifiedTweeter(val username_ : String) extends Tweeter with User { // We mixin User because Tweeter required it
  def username = s"real $username_"
}

object Launch {

  def main(args: Array[String]): Unit = {
    val realBeyoncé = new VerifiedTweeter("Beyoncé")
    realBeyoncé.tweet("Just spilled my glass of lemonade")
  }
}


