trait Instrument2 extends ActorStack {
  override def receive: Receive = {
    case x =>
      println("Antes ...")
      super.receive(x)
      println("Despues ...")
  }
}
