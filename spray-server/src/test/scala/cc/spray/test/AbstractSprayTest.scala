package cc.spray
package test

import http._
import org.specs2.mutable._
import utils.ConsoleLog

abstract class AbstractSprayTest extends Specification with SprayTest with Directives {

  /*implicit def enableLoggingInTests(rootRoute: Route): ServiceTest = new HttpServiceLogic with ServiceTest {
    override lazy val log = new ConsoleLog(this)
    val route = rootRoute
  }*/

  val Ok = HttpResponse(StatusCodes.OK)
  val completeOk: Route = { _.complete(Ok) }

  def echoComplete[T]: T => Route = { x => _.complete(x.toString) }

}