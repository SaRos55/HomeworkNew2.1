fun main() {
    val typeCard = "Мир"
    val prevTransfer = 50000_00
    val transfer = 1000_00

    println(
        "С картой $typeCard, с учетом уже переведённой суммы " + prevTransfer / 100 +
                " рублей, при переводе " + transfer / 100 + " рублей, комиссия составит:"
    )
    println((calcComission(typeCard, prevTransfer, transfer) / 100).toString() + " рублей")
}

fun calcComission(typeCard: String = "Vk Pay", prevTransfer: Int = 0, transfer: Int): Int {
    var result = 0
    when {
        typeCard == ("Mastercard") || typeCard == ("Maestro") -> {
            if (prevTransfer + transfer > 75000_00) result = (transfer * 6 / 10_00) + 20_00
        }
        typeCard == ("Visa") || typeCard == ("Мир") -> {
            if ((transfer * 75 / 100_00) > 35_00) result = transfer * 75 / 100_00 else result = 35_00
        }
    }
    return result
}