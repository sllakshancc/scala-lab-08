val toUpper: String => String = (str: String) => str.toUpperCase()
val toLower: String => String = (str: String) => str.toLowerCase()
val formatNames: (String => (String => String) => String) = (name: String) => (formatFunc: String => String) => formatFunc(name)

@main def main() = {
    println(formatNames("Benny")(toUpper))
    println(formatNames("Ni")(toUpper)+"roshan")
    println(formatNames("Saman")(toLower))
    println("Kumar"+formatNames("a")(toUpper))
}