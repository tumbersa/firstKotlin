import coffeeMachine.*

fun main() {

    println("Write action (buy, fill, take, remaining, exit): ")
    val first = cofeeMachine()
    var ex =readln()
    while (ex!="exit") {
        when (ex) {
            "buy" -> {
                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                first.actionBuy(readln())
            }

            "fill" -> {
                println("Write how many ml of water you want to add: ")
                var temp = readln().toInt()
                first.actionFill("water",temp)
                println("Write how many ml of milk you want to add: ")
                temp = readln().toInt()
                first.actionFill("milk",temp)
                println("Write how many grams of coffee beans you want to add: ")
                temp = readln().toInt()
                first.actionFill("beans",temp)
                println("Write how many disposable cups you want to add: ")
                temp = readln().toInt()
                first.actionFill("cups",temp)
            }

            "take" -> {
               first.actionTake()
            }

            "remaining" -> {
               first.actionRemaining()
            }
        }
        println()
        println("Write action (buy, fill, take, remaining, exit): ")
        ex = readln()
    }
}