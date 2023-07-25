package task1

object functions{
  def last1[A](a: List[A]): A =
    a match {
      case h :: Nil => h
      case _ :: tail => last1(tail)
      case _ => throw new Exception
  }
}

