class KontoBankowe(initStanKonta: BigDecimal) {

  // issue with var
  // use BigDecimal

  private var _stanKonta = initStanKonta

  def this(){
    this(0)
  }

  def stanKonta = _stanKonta

  def wplata(kwotaDoWplaty: BigDecimal) : Unit = {
    println("Wplacam: " + kwotaDoWplaty)
    this._stanKonta = this._stanKonta + kwotaDoWplaty
  }

  def wyplata(kwotaDoWyplaty: BigDecimal) : Unit = {
    if (_stanKonta > kwotaDoWyplaty){
      println("Wyplacam: " + kwotaDoWyplaty)
      _stanKonta = _stanKonta - kwotaDoWyplaty
    } else{
      println("Nie wystarczajaca ilosc srodkow na koncie.")
    }
  }

}