package examples

/**
  *
  */
object SomeSpec extends org.specs2.mutable.Specification  {

  s2"""Either `\/[A, B]` is an alternative to `Either[A, B]`.""".p

  eg {
    val i = 1

    i must_== 1
    i + 1 must_== 2
  }

  s2"""From `Either[A, B]` to `\/[A, B]`.""".p
  eg {
    val i = 1

    i must_== 1
    i + 2 must_== 2
  }
}