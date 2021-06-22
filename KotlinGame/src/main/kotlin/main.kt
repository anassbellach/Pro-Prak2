 fun main() {
    println("Type je naam:")
    var player = readLine()
    println("Welkom $player")
    var player1 = Player("$player", 100, 1, 0)
    var input = readLine()

     var ferdinantWaterloo = Enemy("FerdinantWaterloo", 20, 1, 0)

   fun kelder() {
        println("Je bent zojuist wakker geworden maar niet in je eigen bed.\n" +
                    "Je kijkt om je heen waar je bent en je komt er al snel achter dat je vast zit op een stoel.\n" +
                    "Je krijgt stress maar je denkt meteen aan het zakmes die je van je vader hebt gekregen.\n" +
                    "Je voelt in je zak maar je mes is er niet.\n" +
                    "Het touw waarmee je vast zit is niet al te dik en na er een tijdje aan te bijten krijg je hem gelukkig los.\n" +
                    "In de verte in de donkere kamer zie je iets glimmen, wil je ernaartoe om te kijken wat het is?\n" +
                    "type ja om te kijken en nee om verder in de kamer te kijken.\n"
        )

        var input = readLine()

        if (input == "ja") {
            println(
                "je loopt snel naar het glimmend object en het blijkt je mes te zijn wil je hem oppakken of verder rond kijken.\n" +
                        "type pakken om de mes te pakken en verder om verder rond te kijken."
            )
        } else if (input == "nee") {
            println(
                "Je koos om verder rond te kijken de kamer leek vanaf je stoel erg klein maar je komt er al snel achter dat het groter is dan hij lijkt.\n" +
                        "Je hoort in opeens een stem iets mopperen.\n" +
                        "De stem klinkt steeds harder en lijkt dichterbij te komen.\n" +
                        "Het lijkt jou kant op te komen!\n" +
                        "Wat wil je doen? verstoppen of de stem aanvallen.\n" +
                        "type verstoppen om te verstoppen en aanvallen om de stem aan te vallen.\n"
            )
        }

        input = readLine()

        if (input == "pakken") {

            var knife = Weapon("knife", 20)   // Hier word het wapen 'knife' aangemaakt
            player1.weapon = knife // Hier krijgt de player de knife
            println("Je pakt het mes op maar je hoort in opeens een stem iets mopperen.\n" +
                        "De stem klinkt steeds harder en lijkt dichterbij te komen.\n" +
                        "Het lijkt jou kant op te komen!\n" +
                        "Wat wil je doen? verstoppen of de stem aanvallen\n" +
                        "Type verstoppen om te verstoppen en aanvallen om de stem aan te vallen."
            )
        } else if (input == "verder") {
            println(
                "Je koos om verder rond te kijken de kamer leek vanaf je stoel erg klein maar je komt er al snel achter dat het groter is dan hij lijkt.\n" +
                        "Je hoort in opeens een stem iets mopperen.\n" +
                        "De stem klinkt steeds harder en lijkt dichterbij te komen.\n" +
                        "Het lijkt jou kant op te komen!\n" +
                        "Wat wil je doen? verstoppen of de stem aanvallen.\n" +
                        "type verstoppen om te verstoppen en aanvallen om de stem aan te vallen.\n"
            )
        }

        input = readLine()
//        var ferdinantWaterloo = Enemy("FerdinantWaterloo", 20, 1, 0)
        if (input == "verstoppen") {
            println("Je ziet een kast en besluit er in te gaan verstoppen\n" +
                        "De stem komt steeds dichterbij.\n" +
                        "Het lijkt alsof hij je ruikt.\n" +
                        "Je zweet echter wel erg veel.\n" +
                        "Voordat je het weet opent hij de deur je verstijfde van de schrik en heb hierdoor niet kunnen terug vechten.\n" +
                        "GAME OVER.\n"
            )
        } else if (input == "aanvallen") {

            while (player1.life > 0 || ferdinantWaterloo.life > 0) {
                player1.life -= ferdinantWaterloo.weapon.damageInflicted
                ferdinantWaterloo.life -= player1.weapon.damageInflicted

                if (player1.life <= 0) {
                println("Je staat klaar om te vechten.\n" +
                            "Je vind het wel erg eng.\n" +
                            "Hoe ben je hier beland.\n" +
                            "Er is niet veel tijd om na te denken.\n" +
                            "Je rent op de stem af en begint te vechten.\n" +
                            "De stem had je door en ontwijkt je aanval.\n" +
                            "GAME OVER.\n")
                    break
              } else if (ferdinantWaterloo.life <= 0) {
                println("Je staat klaar om te vechten.\n" +
                            "Je vind het wel erg eng.\n" +
                            "Hoe ben je hier beland.\n" +
                            "Er is niet veel tijd om na te denken.\n" +
                            "Je rent op de stem af en begint te vechten.\n" +
                            "De stem is verrast en schrikt hierdoor hem je hem kunnen verslaan.\n" +
                            "Het blijkt een veel gezochte moordenaar te zijn.\n" +
                            "Je ziet dat er iets in zijn zakken zit.\n" +
                            "type ja om de zakken te doorzoeken en nee om ze niet te doorzoeken.\n")
                    break
            }
          }
        }

        input = readLine()
       var loot1 = Loot("sleutel", LootType.SLEUTELS)
        if (input == "ja") {
//            var loot1 = Loot("sleutel", LootType.SLEUTELS)
            println(
                "In zijn zakken vind je een sleutel\n" +
                        "Je denkt bij jezelf Ik moet hier weg en je kijkt een beetje rond in de kamer en ziet 3 deuren\n" +
                        "elke deur heeft een slot dus de sleutel moet in een van de deuren passen\n" +
                        "Type deur 1 om te kijken of hij in deur 1 past\n" +
                        "Type deur 2 om te kijken of hij in deur 2 past" +
                        "Type deur 3 om te kijken of hij in deur 3 past"
            )
        } else if (input == "nee") {
            println(
                "Je bekijkt de kamer verder en ziet 3 deuren\n" +
                        "Je checkt of ze open zijn maar ze zitten op slot.\n" +
                        "Je gaat opzoek naar iets om de deuren open te krijgen\n" +
                        "Type kast om in de kast te doorzoeken\n" +
                        "Type broekzakken om de broekzakken te doorzoeken\n" +
                        "Type laatjes om de laatjes te doorzoeken\n"
            )
        }

       val run = true
        while (run) {
            input = readLine()

            if (input == "kast") {
                println(
                    "de kast is leeg...\n" +
                            "Type laatjes om in de laatjes te doorzoeken\n" +
                            "Type broekzakken om de broekzakken te doorzoeken\n"
                )
            } else if (input == "laatjes") {
                println(
                    "in de laatjes vind je alleen foto's van jezelf\n" +
                            "Je schrikt hier erg van\n" +
                            "Je kijkt snel verder\n" +
                            "Type kast om in de kast te doorzoeken\n" +
                            "Type broekzakken om de broekzakken te doorzoeken\n"
                )
            }

            if (input == "broekzak") {
                player1.loot = loot1
                println(
                    "in de broekzakken vind je een sleutel" +
                            "Type deur 1 om te kijken of hij in deur 1 past\n" +
                            "Type deur 2 om te kijken of hij in deur 2 past\n" +
                            "Type deur 3 om te kijken of hij in deur 3 \n"
                )
                break;
            }
        }


       while (run) {

           input = readLine()

           if (input == "deur1") {
               println("Hij lijkt niet in deur 1 te passen de sleutel is te klein probeer een andere deur")
           } else if (input == "deur2") {
               println("Je kan de sleutel niet in het gat stoppen de slot lijkt dicht gelast te zijn probeer een andere deur\n")
           }

           if (input == "deur3") {
               println("De sleutel springt uit je hand en gaat vanzelf in de deur en de deur gaat open je schrikt ervan maar je nieuwsgierigheid neemt over en je betreed de kamer\n")
               break
           }
       }



//    var knife = Weapon("knife", 20) // aanmaken van een weapon 20 is de damage
//    println(knife.name)
//    var player1 = Player("Anass", 5, 1, 0)    // player aanmaken
//    player1.weapon = Weapon("stok", 10)       // weapon aanmaken en deze aan de player geven
//    player1.weapon.damageInflicted = 20       // de damage van het weapon veranderen
//    player1.life -= player1.weapon.damageInflicted // de damage - het leven van player 1
//    var player2 = Player("Sem", 5, 1, 0)           // player 2 aanmaken
//    player2.weapon = Weapon("gun", 50)             // een weapon aanmaken en deze aan player 2 geven
//    player1.life -= player2.weapon.damageInflicted  // player 2 valt aan met zijn wapen deze damage gaat van de leven van player1 af


    }

     fun halNaarTrap() {

         println(
             "Je bent in de volgende kamer gekomen het lijkt op een kleine hal je ziet een deur achter in de hal.\n" +
                     "Je loopt naar de deur toe en probeer hem te openen maar hij zit dicht.\n" +
                     "Je kijkt wat beter rond in de kamer en ziet een stroomkast\n" +
                     "Het is erg donker dus je probeert het stroom the fixen, Je ziet een paar items welke kies je om de stroom te fixen?\n" +
                     "Type schroevendraaier  om de schroevendraaier te pakken\n" +
                     "Type tang om de tang te pakken\n" +
                     "Type hamer om de hamer te pakken\n"
         )

         val run = true
         while (run) {

             input = readLine()

             if (input == "schroevendraaier") {
                 println(
                     "Je opent de kast en ziet dat de kabels zijn je kan niks doen met de schroevendraaier\n" +
                             "Probeer de hamer of tang\n" +
                             "Dit doe je door hamer of tang te typen\n"
                 )
             } else if (input == "tang") {
                 println("Je knipt het slot van de kast open en ziet dat de kabels zijn doorgeknipt je kan niks met de tang\n" +
                             "Probeer de hamer of tang\n" +
                             "Dit doe je door hamer of tang te typen\n")
             }

             if (input == "hamer") {
                 println("Je geeft een goede tik tegen de kast en het licht flikkert een beetje je geeft en iets hardere tik en het licht blijft aan Het is gelukt!\n" +
                             "Je kijkt wat rond en ziet een paar items welke kies je om de deur open te krijgen?\n" +
                             "Type breekijzer om de breekijzer te proberen\n" +
                             "Type stormram om de stormram te proberen\n" +
                             "Type sleutel om de sleutel te proberen\n")
                 break
             }
         }



         while (run) {

             input = readLine()

             if (input == "stormram") {
                 println("je pakt de stormram op en beukt hem een paar keer tegen de deur aan maar er gebeurt niks het lijkt wel alsof er iets aan de andere kant ervoor zit.\n" +
                             "Probeer de breekijzer of sleutel\n")
             } else if (input == "sleutel") {
                 println("je probeert de sleutel in het slot maar de sleutel breekt waardoor hij waardeloos is.\n" +
                             "probeer de stormram of breekijzer\n")
             }

             if (input == "breekijzer") {
                 println("Je pakt het breekijzer en je manoevreert het tussen de deur de deur kraakt een beetje maar hij opent maar er staat een grote kast voor.\n")
             }
         }

   }



    kelder()
    halNaarTrap()
    trap()
//    woonkamer()
//    keuken()
//    halNaarSlaapkamer()
//    slaapkamer()
//    tuin()
}