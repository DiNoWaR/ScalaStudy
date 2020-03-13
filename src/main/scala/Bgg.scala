import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.concurrent.{Await, Future}


object Bgg {

  def op(value: Int, delay: Int) = {
    Future {
      Thread.sleep(delay)
      println(s"Completed with delay:  $delay")
      value
    }
  }

  def errorOp(delay: Int) = {
    Future {
      Thread.sleep(delay)
      println(s"Completed with delay:  $delay")
      2 / 0
    }
  }

  def compose() = {

    val sum = for {
      a <- op(5, 5000)
      b <- errorOp(1000)
    } yield a + b

    val recovered = sum.recoverWith {
      case ex: ArithmeticException => Future(0)
    }

    Await.result(recovered, 7 second)
  }


  def main(args: Array[String]): Unit = {
    compose()
  }
}