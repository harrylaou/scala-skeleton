import org.scalatest._
import org.scalatest.matchers.must

class ExampleSpec extends wordspec.AnyWordSpec with must.Matchers {
  "An example spec" should {
    "work" in {
      10 mustBe 10
    }
  }
}
