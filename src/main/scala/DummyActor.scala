import akka.actor.Actor

class DummyActor extends Actor with Instrument2 with Instrument1 {
  override def wrappedReceive: Receive = {
    case "something" => println("Got something")
    case x => println(s"Got something else $x")
  }
}
