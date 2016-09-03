package examples

/**
  *
  */
object SomeSpec extends org.specs2.mutable.Specification /*with AutoExamples with Snippets with TextDsl*/ {

  "Specification for Iterables extensions".title

  "The sameElementsAs function returns true" >> {
    "if 2 lists of lists contain the same elements in a different order" >> {
      List(List(1), List(2, 3)) must_== 1
    }

  }
}