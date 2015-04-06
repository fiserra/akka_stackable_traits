trait Instrument1 extends ActorStack {
  override def receive: Receive = {
    case x =>
      println("Do something before")
      super.receive(x)
      println("Do something after")
  }
}
