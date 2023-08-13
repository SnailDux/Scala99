import task2.functions.penultimate1

class Task2Test extends org.scalatest.funsuite.AnyFunSuite {

  test("penultimate1, should give the last but one element of a list"){
    assert(penultimate1(List(1,2,3)) === 2)
  }

  test("penultimate2, empty or one element list should throw an error"){
    assertThrows[NoSuchElementException]{
      (penultimate1(List()))
    }
    assertThrows[NoSuchElementException]{
      (penultimate1(List(1)))
    }
  }
}
