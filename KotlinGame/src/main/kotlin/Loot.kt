enum class LootType {
    TELEFOON, BANKPAS, SLEUTELS, HEALTHPOSION, RIEM, GROTESLEUTEL, ZAKLAMP
}

class Loot(var name: String, var lootType1: LootType) {
    val riem = Loot("Riem", LootType.RIEM)
    val telefoon = Loot("TELEFOON", LootType.TELEFOON)
    val groteSleutel = Loot("GROTESLEUTEL", LootType.GROTESLEUTEL)
    val zaklamp = Loot("ZAKLAMP", LootType.ZAKLAMP)
}