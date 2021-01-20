import utest._

object ExampleTests extends TestSuite {

  val tests = Tests {
    test("test1") {
      val x = 1
      val y = x + 1
      assert(x == 1, y == 2)
    }

  }
}
