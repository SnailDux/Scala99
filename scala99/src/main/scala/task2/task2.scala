package task2

object functions{
  def penultimate1[A](l: List[A]): A =
    l match {
      case h :: t :: Nil => h
      case h :: t => penultimate1(t)
      case _ => throw new NoSuchElementException
    }
}
