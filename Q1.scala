val calculateInterest: Double => Double = (deposit: Double) => {
    deposit match {
      case d if d <= 20000 => flatRate(0.02, d)
      case d if d <= 200000 => flatRate(0.04, d)
      case d if d <= 2000000 => flatRate(0.035, d)
      case d if d > 2000000 => flatRate(0.065, d)
      case _ => 0.0
    }
  }

val flatRate: (Double, Double) => Double = (rate: Double, amount: Double) => rate * amount

@main def main(): Unit = {
    val amount = 15000
    val interest = calculateInterest(amount)
    println(s"Your interest rate is: Rs. $interest")
}