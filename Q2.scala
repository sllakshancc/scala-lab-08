val isNegative: Int => Boolean = num => num < 0
val isZero: Int => Boolean = num => num == 0
val isEven: Int => Boolean = num => num % 2 == 0
val isOdd: Int => Boolean = num => num % 2 != 0

val matchInput: Int => String = (num: Int) => num match {
    case n if isNegative(n) => "Negative number"
    case n if isZero(n) => "Zero number"
    case n if isEven(n) => "Even number"
    case n if isOdd(n) => "Odd number"
}

@main def main(): Unit = {
    println("Please enter an integer:")
    
    val input = scala.io.StdIn.readInt()

    val res = matchInput(input)
    println(s"number is ${res}")
  }