package task1

def task1_function1[A](a: List[A]): A =
  a match {
    case _ :: tail => task1_function1(tail)
    case h :: Nil => h
  }

