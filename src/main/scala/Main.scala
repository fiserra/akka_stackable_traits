import akka.actor.{Props, ActorSystem}

object Main extends App {
  val actorSystem = ActorSystem()
  val dummyActor = actorSystem.actorOf(Props[DummyActor])

  dummyActor ! "cucu"

  actorSystem.shutdown()
}
