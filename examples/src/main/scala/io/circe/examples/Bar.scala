package io.circe.examples

import cats.Eq
import org.scalacheck.{ Arbitrary, Gen }

case class Bar()

object Bar {
  implicit val arbitraryBar: Arbitrary[Bar] = Arbitrary(Gen.const(Bar()))
  implicit val eqBar: Eq[Bar]               = Eq.fromUniversalEquals
}
