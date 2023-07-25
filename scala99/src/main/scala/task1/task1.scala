package task1

object functions{
  def last1[A](a: List[A]): A =
    a match {
      case _ :: tail => last1(tail)
      case h :: Nil => h
  }
}

