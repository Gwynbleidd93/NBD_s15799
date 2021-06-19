
object NBD_02 {

    def main(args: Array[String]) = {

      println("Zadanie 1")
      val result_1a = weekDaysPatternMatching("Sobota")
      println("Result: " + result_1a)
      val result_1b = weekDaysPatternMatching("Wtorek")
      println("Result: " + result_1b)
      val result_1c = weekDaysPatternMatching("Cos innego")
      println("Result: " + result_1c)

      println("\nZadanie 2")

      val konto1 = new KontoBankowe(20)
      println("Stan konta 1: "  + konto1.stanKonta)
      konto1.wyplata(50)
      konto1.wplata(200)
      konto1.wplata(50)
      println("Stan konta 1: " + konto1.stanKonta)

      val konto2 = new KontoBankowe()
      println("Stan konta 2: " + konto2.stanKonta)

      println("\nZadanie 3")

      val osoba1 = new Osoba("Jan", "Kowalski")
      val osoba2 = new Osoba("Robert", "Kubica")
      val osoba3 = new Osoba("Marek", "Darek")

      val res3a = personPatternMatching(osoba1)
      println("Result 1: " + res3a)
      val res3b = personPatternMatching(osoba2)
      println("Result 2: " + res3b)
      val res3c = personPatternMatching(osoba3)
      println("Result 3: " + res3c)


      println("\nZadanie 4")
      val input = 4
      println("Function will multiply input 3 times by 2. Input : " + input)
      val result4 = funcAsArg(input, intFunc)
      println("Result: " + result4)



      println("\nZadanie 5")
      // nie wstrzykiwac atrybutow w nawiasach klamrowych traita - raczej uzyc settera do inicjalizacji atrybutow

      val osobaPracownik = new OsobaZad5("Kamil", "Michalski") with Pracownik
      osobaPracownik.pensja = 1000

      println("Pensja pracownika: " + osobaPracownik.pensja)
      println("Podatek pracownika: " + osobaPracownik.podatek)


      val osobaNauczyciel = new OsobaZad5("Joanna", "Kruk") with Nauczyciel
      osobaNauczyciel.pensja = 1000

      println("\nPensja nauczyciela: " + osobaNauczyciel.pensja)
      println("Podatek nauczyciela: " + osobaNauczyciel.podatek)


      val osobaStudent = new OsobaZad5("Lukasz", "Huk") with Student

      println("\nPodatek studenta: " + osobaStudent.podatek)


      val osobaStudentPracownik = new OsobaZad5("Lukasz", "Buk") with Student with Pracownik
      osobaStudentPracownik.pensja = 1000

      println("\nPensja studenta pracownika: " + osobaStudentPracownik.pensja)
      println("Podatek studenta pracownika: " + osobaStudentPracownik.podatek)


      val osobaPracownikStudent= new OsobaZad5("Lukasz", "Mruk") with Pracownik with Student
      osobaPracownikStudent.pensja = 1000

      println("\nPensja pracownika studenta: " + osobaPracownikStudent.pensja)
      println("Podatek pracownika studenta: " + osobaPracownikStudent.podatek)

    }


    // zadanie 1
    def weekDaysPatternMatching(inputStr: String): String ={

      val workdayInfo = "Praca"
      val weekendInfo = "Weekend"
      val otherInputInfo = "Nie ma takiego dnia"

      val workDays = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek")
      val weekendDays = List("Sobota", "Niedziela")

      println("Input str: " + inputStr)

      inputStr match {
        case inputStr if workDays.contains(inputStr) => workdayInfo
        case inputStr if weekendDays.contains(inputStr) => weekendInfo
        case _ => otherInputInfo
      }
    }


  // zadanie 3
  def personPatternMatching(input: Osoba): String ={

    println("Input Person: " + input.imie + " " + input.nazwisko)

    input match {
      case input if input.imie == "Jan"  => "Hej Janek!"
      case Osoba("Robert", "Kubica") => "Toż to Robert Kubica !"
      case _ => "Witaj Nieznajomy!"
    }
  }


  // zadanie 4
  def funcAsArg(numArg : Int, funcArg: Int => Int) : Int = funcArg(funcArg(funcArg(numArg)))

  def intFunc(input: Int) : Int = {
    return input * 2
  }


}
