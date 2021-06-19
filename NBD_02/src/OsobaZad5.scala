abstract class OsobaZad5(val imie: String, val nazwisko: String) {
  def podatek: BigDecimal
}

// use BigDecimal for money

trait Student extends OsobaZad5{
  override def podatek: BigDecimal = 0
}

trait Nauczyciel extends Pracownik {

  override def podatek: BigDecimal = 0.1 * pensja
}

// private attr pensja with setter
trait Pracownik extends OsobaZad5 {

  var pensja: BigDecimal = 0

  def _pensja(inputPensja: Double ): Unit = {pensja = inputPensja}
  override def podatek: BigDecimal = 0.2 * pensja

}
