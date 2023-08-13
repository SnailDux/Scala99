import task1.functions.last1

class CubeCalculatorTest extends org.scalatest.funsuite.AnyFunSuite {

  test("task1.functions.last1, should give last element of list"){
    assert(last1(List(1,2,3)) === 3)
  }

  test("task1.functions.last2, should give last element of list"){
    assert(last1(List(1,2,3)) != 5)
  }

  test("task1.functions.last1, last of empty list should throw an error"){
    assertThrows[NoSuchElementException]{
      (last1(List()))
    }
  }

}
