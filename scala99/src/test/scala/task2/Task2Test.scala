import task2.functions.penultimate1
import task2.functions.penultimate2

class Task2Test extends org.scalatest.funsuite.AnyFunSuite {

  test("penultimate1, should give the last but one element of a list"){
    assert(penultimate1(List(1,2,3)) === 2)
  }

  test("penultimate1, empty or one element list should throw an exception"){
    assertThrows[NoSuchElementException]{
      (penultimate1(List()))
    }
    assertThrows[NoSuchElementException]{
      (penultimate1(List(1)))
    }
  }

  test("penultimate2, should give the last but one element of a list"){
    assert(penultimate2(List(1,2,3)) === 2)
  }

  test("penultimate2, empty or one element list should throw an exception(any kind of, not going to delve which exception both those builtins can throw)"){
    assertThrows[Exception]{
      (penultimate2(List()))
    }
    assertThrows[Exception]{
      (penultimate2(List(1)))
    }
  }
}
