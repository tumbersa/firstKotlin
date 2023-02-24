package coffeeMachine
class coffeeMachine {
    var water = 400
    var milk = 540
    var beans = 120
    var cups = 9
    var money = 550

    private fun printM (water:Int, milk: Int, beans: Int, cups: Int, money: Int){
        println("""
    The coffee machine has:
    $water ml of water
    $milk ml of milk
    $beans g of coffee beans
    $cups disposable cups
    $$money of money""".trimIndent()
        )
    }
    fun actionRemaining() {
        println()
        printM(water, milk, beans, cups, money)
    }
    fun actionTake() {
        println("I gave you $$money")
        money = 0
    }
    fun actionFill(name: String, temp: Int) {
        when (name) {
            "water" -> water += temp
            "milk" -> milk += temp
            "beans" -> beans += temp
            "cups" -> cups += temp
        }
    }
    fun actionBuy(value: String) {
        when (value) {
            "1" -> {
                if (water >= 250 && beans >= 16) {
                    water -= 250
                    beans -= 16
                    money += 4
                    cups -= 1
                    println("I have enough resources, making you a coffee!")
                } else {
                    if (water < 250)
                        println("Sorry, not enough water!")
                    if (beans < 16)
                        println("Sorry, not enough beans!")
                }
            }

            "2" -> {
                if (water >= 350 && beans >= 20 && milk >= 75) {
                    water -= 350
                    milk -= 75
                    beans -= 20
                    money += 7
                    cups -= 1
                    println("I have enough resources, making you a coffee!")
                } else {
                    if (water < 350)
                        println("Sorry, not enough water!")
                    if (milk < 75)
                        println("Sorry, not enough milk!")
                    if (beans < 20)
                        println("Sorry, not enough beans!")
                }
            }

            "3" -> {
                if (water >= 200 && beans >= 12 && milk >= 100) {
                    water -= 200
                    milk -= 100
                    beans -= 12
                    money += 6
                    cups -= 1
                    println("I have enough resources, making you a coffee!")
                } else {
                    if (water < 200)
                        println("Sorry, not enough water!")
                    if (milk < 100)
                        println("Sorry, not enough milk!")
                    if (beans < 12)
                        println("Sorry, not enough beans!")
                }
            }
        }
    }


}