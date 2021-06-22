enum class LootType {
    TELEFOON, BANKPAS, SLEUTELS, HEALTHPOSION, RIEM, GROTESLEUTEL
}

class Loot(var name: String, var lootType1: LootType) {
    val riem = Loot("Riem", LootType.RIEM)
    val telefoon = Loot("TELEFOON", LootType.TELEFOON)
}