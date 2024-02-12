class CoffeeMachine {

    private var water: Int = 0
    private var beans: Int = 0
    private var milk: Int = 0

    fun start() {
        println("Кофемашина готова к работе")
        while (true) {
            println(
                "Введите команду:\n" +
                        "-наполнить\n" +
                        "-статус\n" +
                        "-кофе\n" +
                        "-выключить"
            )
            when (readln()) {
                "выключить" -> {
                    println("До свидания!")
                    break
                }

                "наполнить" -> {
                    water = 2000
                    beans = 500
                    milk = 1000
                }

                "статус" -> {
                    println(
                        "Ингридиентов осталось:\n$water мл воды\n$milk мл молока\n$beans гр кофе"
                    )
                }

                "кофе" -> {
                    println("Введите название напитка или \"назад\" для возврата в главное меню")
                    when (readln()) {
                        "Эспрессо" -> {
                            val espresso = Espresso()
                            var message = ""
                            if (water < espresso.water) {
                                message += "Недостаточно воды!\n"
                            }
                            if (beans < espresso.beans) {
                                message += "Недостаточно кофе!\n"
                            }
                            if (message.isNotEmpty()) {
                                println(message)
                            } else {
                                water -= espresso.water
                                beans -= espresso.beans
                                println("Эспрессо готов")
                            }
                        }

                        "Американо" -> {
                            val americano = Americano()
                            var message = ""
                            if (water < americano.water) {
                                message += "Недостаточно воды!\n"
                            }
                            if (beans < americano.beans) {
                                message += "Недостаточно кофе!\n"
                            }
                            if (message.isNotEmpty()) {
                                println(message)
                            } else {
                                water -= americano.water
                                beans -= americano.beans
                                println("Американо готов")
                            }
                        }

                        "Капучино" -> {
                            val cappuccino = Cappuccino()
                            var message = ""
                            if (water < cappuccino.water) {
                                message += "Недостаточно воды!\n"
                            }
                            if (beans < cappuccino.beans) {
                                message += "Недостаточно кофе!\n"
                            }
                            if (milk < cappuccino.milk) {
                                message += "Недостаточно молока!\n"
                            }
                            if (message.isNotEmpty()) {
                                println(message)
                            } else {
                                water -= cappuccino.water
                                beans -= cappuccino.beans
                                milk -= cappuccino.milk
                                println("Капучино готов")
                            }
                        }

                        "Латте" -> {
                            val latte = Latte()
                            var message = ""
                            if (water < latte.water) {
                                message += "Недостаточно воды!\n"
                            }
                            if (beans < latte.beans) {
                                message += "Недостаточно кофе!\n"
                            }
                            if (milk < latte.milk) {
                                message += "Недостаточно молока!\n"
                            }
                            if (message.isNotEmpty()) {
                                println(message)
                            } else {
                                water -= latte.water
                                beans -= latte.beans
                                milk -= latte.milk
                                println("Латте готов")
                            }
                        }

                        "назад" -> print("")

                        else -> {
                            println("Рецепт не найден!")
                        }
                    }
                }

                else -> {
                    println("Неизвестная команда")
                }
            }
        }
    }
}