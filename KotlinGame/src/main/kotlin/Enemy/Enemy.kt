open class Enemy(val name: String, var life: Int = 3, var level: Int = 1, var  score: Int = 0) {
    var weapon = Weapon("Fists", 10)
    var ferdinantWaterloo = Enemy("FerdinantWaterloo", 20, 1, 0)



    fun show(){
        println("""
            name:   $name
            lives:  $life
            level:  $level
            score:  $score
            weapon: ${weapon.name}
            damage: ${weapon.damageInflicted}
            """)
    }
}
