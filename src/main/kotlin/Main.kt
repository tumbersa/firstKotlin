//fun printM (water:Int, milk: Int, beans: Int, cups: Int, money: Int){
//    println("""
//    The coffee machine has:
//    $water ml of water
//    $milk ml of milk
//    $beans g of coffee beans
//    $cups disposable cups
//    $$money of money""".trimIndent()
//    )
//}


fun main(args: Array<String>) {
//    var water = 400
//    var milk = 540
//    var beans = 120
//    var cups = 9
//    var money = 550
//    println("Write action (buy, fill, take, remaining, exit): ")
//    var ex =readln()
//    while (ex!="exit") {
//        when (ex) {
//            "buy" -> {
//                println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
//                when (readln()) {
//                    "1" -> {
//                        if (water >= 250 && beans >= 16 && cups >= 1) {
//                            water -= 250
//                            beans -= 16
//                            money += 4
//                            cups -= 1
//                            println("I have enough resources, making you a coffee!")
//                        } else {
//                            if (water < 250)
//                                println("Sorry, not enough water!")
//                            if (beans < 16)
//                                println("Sorry, not enough beans!")
//                            if (cups < 1)
//                                println("Sorry, not enough cups!")
//                        }
//                    }
//
//                    "2" -> {
//                        if (water >= 350 && beans >= 20 && milk >= 75 && cups >=1) {
//                            water -= 350
//                            milk -= 75
//                            beans -= 20
//                            money += 7
//                            cups -= 1
//                            println("I have enough resources, making you a coffee!")
//                        } else {
//                            if (water < 350)
//                                println("Sorry, not enough water!")
//                            if (milk < 75)
//                                println("Sorry, not enough milk!")
//                            if (beans < 20)
//                                println("Sorry, not enough beans!")
//                            if (cups < 1)
//                                println("Sorry, not enough cups!")
//                        }
//                    }
//
//                    "3" -> {
//                        if (water >= 200 && beans >= 12 && milk >= 100 && cups >= 1) {
//                            water -= 200
//                            milk -= 100
//                            beans -= 12
//                            money += 6
//                            cups -= 1
//                            println("I have enough resources, making you a coffee!")
//                        } else {
//                            if (water < 200)
//                                println("Sorry, not enough water!")
//                            if (milk < 100)
//                                println("Sorry, not enough milk!")
//                            if (beans < 12)
//                                println("Sorry, not enough beans!")
//                            if (cups < 1)
//                                println("Sorry, not enough cups!")
//                        }
//                    }
//                }
//            }
//
//            "fill" -> {
//                println("Write how many ml of water you want to add: ")
//                var temp = readln().toInt()
//                water += temp
//                println("Write how many ml of milk you want to add: ")
//                temp = readln().toInt()
//                milk += temp
//                println("Write how many grams of coffee beans you want to add: ")
//                temp = readln().toInt()
//                beans += temp
//                println("Write how many disposable cups you want to add: ")
//                temp = readln().toInt()
//                cups += temp
//            }
//
//            "take" -> {
//                println("I gave you $$money")
//                money = 0
//            }
//
//            "remaining" -> {
//                println()
//                printM(water, milk, beans, cups, money)
//            }
//        }
//        println()
//        println("Write action (buy, fill, take, remaining, exit): ")
//        ex = readln()
//    }
    var msg = "Freak"
    var msg1 = msg
    println(msg)
    msg = "Real"
    println(msg1)
    println(msg)
}

