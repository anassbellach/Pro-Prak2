 fun main() {
    println("Type je naam:")
    var player = readLine()
    println("Welkom $player")
    var player1 = Player("$player", 100, 1, 0)
//    var input = readLine()
    var ferdinantWaterloo = Enemy("Ferdinant Waterloo", 20, 1, 0)
    var andreiChikatilo = Enemy("Andrei Chikatilo", 20, 1, 0)
    var yangXinhai = Enemy("Yang Xinhai", 20, 1, 0)
    val run = true


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
            println("In zijn zakken vind je een sleutel\n" +
                        "Je denkt bij jezelf Ik moet hier weg en je kijkt een beetje rond in de kamer en ziet 3 deuren\n" +
                        "elke deur heeft een slot dus de sleutel moet in een van de deuren passen\n" +
                        "Type deur 1 om te kijken of hij in deur 1 past\n" +
                        "Type deur 2 om te kijken of hij in deur 2 past\n" +
                        "Type deur 3 om te kijken of hij in deur 3 past\n")
        } else if (input == "nee") {
            println("Je bekijkt de kamer verder en ziet 3 deuren\n" +
                        "Je checkt of ze open zijn maar ze zitten op slot.\n" +
                        "Je gaat opzoek naar iets om de deuren open te krijgen\n" +
                        "Type kast om in de kast te doorzoeken\n" +
                        "Type broekzakken om de broekzakken te doorzoeken\n" +
                        "Type laatjes om de laatjes te doorzoeken\n")


            while (run) {
                input = readLine()

                if (input == "kast") {
                    println(
                        "de kast is leeg...\n" +
                                "Type laatjes om in de laatjes te doorzoeken\n" +
                                "Type broekzak om de broekzak te doorzoeken\n"
                    )
                } else if (input == "laatjes") {
                    println(
                        "in de laatjes vind je alleen foto's van jezelf\n" +
                                "Je schrikt hier erg van\n" +
                                "Je kijkt snel verder\n" +
                                "Type kast om in de kast te doorzoeken\n" +
                                "Type broekzak om de broekzak te doorzoeken\n"
                    )
                }

                if (input == "broekzak") {
                    player1.loot.riem
                    println(
                        "in de broekzakken vind je een sleutel" +
                                "Type deur 1 om te kijken of hij in deur 1 past\n" +
                                "Type deur 2 om te kijken of hij in deur 2 past\n" +
                                "Type deur 3 om te kijken of hij in deur 3 past\n"
                    )
                    break
                }
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


//         val run = true
         while (run) {

            var input = readLine()

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

           var input = readLine()

             if (input == "stormram") {
                 println("je pakt de stormram op en beukt hem een paar keer tegen de deur aan maar er gebeurt niks het lijkt wel alsof er iets aan de andere kant ervoor zit.\n" +
                             "Probeer de breekijzer of sleutel\n")
             } else if (input == "sleutel") {
                 println("je probeert de sleutel in het slot maar de sleutel breekt waardoor hij waardeloos is.\n" +
                             "probeer de stormram of breekijzer\n")
             }

             if (input == "breekijzer") {
                 println("Je pakt het breekijzer en je manoevreert het tussen de deur de deur kraakt een beetje maar hij opent maar er staat een grote kast voor.\n")
                 break
             }
         }

   }

     fun trap() {

         println("Je duwt de kast aan de kant en je ziet een lange trap. Maar aan het einde van de trap zie je 2 grote rode ogen.\n" +
                 "Je probeert terug te gaan naar de vorige kamer maar de deur is dicht geslagen.\n" +
                 "Je herinnert jezelf dat je je zakmes nog hebt. Ga je de ogen aanvallen of rondkijken\n" +
                 "Type aanvallen om aan te vallen of type rondkijken om rond te kijken\n")

         var input = readLine()
         if (input == "aanvallen") {

             println("Je rent de rent de trap op.\n" +
                     "Je ziet een lang figuur opdagen met rode ogen.\n" +
                     "voordat je kan je wilt aanvallen maar het figuur geeft je plots een duw waardoor je van de trap valt\n" +
                     "Hierdoor heb je 5 fall damage gekregen je health is nu:")
             player1.life -= 5
             println(player1.life)
             println("Je bent woest\n" +
                     "Je rent de trap op en valt de enemy aan")
             while (player1.life > 0 || andreiChikatilo.life > 0) {
                 player1.life -= andreiChikatilo.weapon.damageInflicted
                 andreiChikatilo.life -= player1.weapon.damageInflicted

                 if (player1.life <= 0) {
                     println("De enemy is krachtiger dan je dacht\n" +
                             "Na een zwaar gevecht heb je het niet overleeft\n" +
                             "GAME OVER.\n")
                     break
                 } else if (andreiChikatilo.life <= 0) {
                     println("Je staat klaar om te vechten.\n" +
                             "Het was een zwaar gevecht maar het is je gelukt om Andrei Chikatilo te verslaan")
                     break
                 }
             }


         } else if (input == "rondkijken") {
             val zaklamp = Loot("ZAKLAMP", LootType.ZAKLAMP)
             player1.loot = zaklamp
            println("Je kijkt in de laatjes van de kast die je omver geduwt hebt en je ziet in een van de laatjes een soort zaklamp zitten.\n" +
                    "je pakt de zaklamp op en schijnt het op de ogen.\n" +
                    "Het figuur begint te schreeuwen en word kleiner alsof hij aan het smelten is.\n")
         }

         val groteSleutel = Loot("GROTESLEUTEL", LootType.GROTESLEUTEL)
         player1.loot = groteSleutel
         println("Je loopt de trap op en ziet dat het figuur helemaal is verbrand.\n" +
                 "Je kijkt in zijn zakken en vind een object wat lijkt op een hele oude grote sleutel.\n" +
                 "Je stopt het in je zak misschien komt die nog van pas.\n")
   }


     fun woonkamer() {

         var input = readLine()
         println("De trap komt uit op de woonkamer.\n" +
                 "Er is erg fel licht\n" +
                 "licht terwijl je ogen aan het nieuwe licht wennen zie je als snel dat het erg oud lijkt alsof je opeens in de terug in de tijd bent gegaan.\n" +
                 "Je kijkt een beetje rond en ziet oude meubels\n" +
                 "Verder zie je nog iets wat je uistaat het is een soort schatskist\n" +
                 "Je denkt de sleutel die je net hebt gevonden zou die erin passen?\n" +
                 "Type ja om de te kijken of de sleutel past type nee om verder rond te kijken.\n")


         if (input == "ja") {
         println("Je probeert de sleutel in de kist en na een beetje er meer rammelen gaat hij open.\n" +
                 "In de kist vind je katapult en een paar steentjes misschien komt dit nog van pas\n" +
                 "Je loopt verder en komt uiteindelijk in de keuken uit.")
         } else if (input == "nee") {
         println("je kijkt verder in de kamer maar er is niks te vinden je loopt rond en komt uiteindelijk uit in de keuken.")
         }
     }

     fun keuken() {

         var input = readLine()
         println("Je loopt de keuken binnen het is er redelijk donker.\n" +
                 "Je kan je niet meer herrineren wanneer je voor de laatste keer iets hebt gegeten.\n" +
                 "Je gaat opzoek naar iets te eten.\n" +
                 "Type koelkast om daarin te kijken type kastjes om in de kastjes te kijken.\n")

         while (run) {
             if (input == "koelkast") {
                 println("Je opent de koelkast maar er liggen alleen maar lege zakjes en kruimels in.\n" +
                         "Type kastjes om in de kastjes te kijken.")
             } else if (input == "kastjes") {
                 println("Je probeert het kastje te openen maar het kastje is zo oud dat je de het deurtje eraf valt op de grond.\n" +
                         "Opeens hoor je gekreun in een hoek van de kamer komen.\n" +
                         "Je kijkt om en het ziet een groot dik figuur in de donkere hoek.\n" +
                         "Het figuur staat op en stapt in het licht, Het is een Troll!\n" +
                         "Hij komt op je af wat doe je?\n" +
                         "Je hebt 2 keuzes wegrennen of de troll vechten met de katapult die je net hebt gevonden\n" +
                         "Type vechten om te vechten en wegrennen om te vluchten.\n")

                 if (input == "vechten") {
                     println("je pakt je katapult uit je zak en doet er een steen in Je mist!\n" +
                             "Je herlaat de katapult en schiet een steen tegen zijn voorhooft de steen heeft hem uit zijn evenwicht gehaald\n" +
                             "de troll valt achterover en is buiten bewustzijn.\n" +
                             "De troll stinkt je wilt hier snel weg je ziet een gang je loopt langs de troll naar de gang.\n")
                     break
                 } else if (input == "wegrennen") {
                     while (run) {
                         player1.life -= yangXinhai.weapon.damageInflicted
                         if (player1.life <= 0) {
                             println(
                                 "Je rent de keuken uit terug naar de gang\n" +
                                         "De gang loopt dood!!\n" +
                                         "Je hoort voetstappen van de troll dichterbij komen\n" +
                                         "De troll heeft je kunnen pakken\n" +
                                         "Game over")
                             break
                         }
                     }
                 }
             }
         }
     }


     fun halNaarSlaapkamer() {
     val pistool = Weapon("pistool", 20)

         var input = readLine()
         println("Je komt in de gang\n" +
                 "Je kijkt wat rond en ziet een 4 deuren waarvan er 2 zijn die zijn dichtgemaakt.\n" +
                 "Hierdoor kan je er op geen enkele manier naar binnen\n" +
                 "Je bestudeert de gang wat beter en ziet ook een kast staan\n" +
                 "Je loopt naar de deuren toe maar ze zitten allebij op slot.\n" +
                 "Je gaat opzoek naar iets waarmee je een van de deuren kan openen\n" +
                 "In de kast vind je 2 dingen welke kies je om proberen te deur te openen?\n" +
                 "Type sleutel om de sleutel te gebuiken die je hebt gevonden in de kast\n" +
                 "Type breekijzer om de deuren te openen met het breekijzer.\n")

         if (input == "sleutel") {
             player1.weapon = pistool
             println("Met de sleutel loop je naar de eerste deur je steekt hem erin en hij past!\n" +
                     "Je opent de deur...\n" +
                     "Het is een bezemkast maar er ligt iets dat licht afflikkert\n" +
                     "Je pakt het op en het blijkt een lichtkogel-pistool te zijn je neemt hem maar mee voor nu.\n" +
                     "Je loopt naar de volgende deur en na er een paar keer tegen aan te beuken gaat hi jmet een klap open")
         } else if (input == "breekijzer") {
             player1.weapon = pistool
             println("je loopt naar de eertste deur en breekt hem open door er tegen aan te beuken het ging gemakelijk\n" +
                     "Je opent opent de deur en het is een bezemkast maar er ligt iets dat licht afflikkert\n" +
                     "Je pakt het op en het blijkt een lichtkogel-pistool te zijn je neemt hem maar mee voor nu.\n" +
                     "Je loopt naar de volgende deur en probeert hem open te krijgen.\n" +
                     "Na er een tijdje tegenaan te duwen kraakt de deur en gaat hij rustig open.\n")
         }

     }

    fun slaapkamer() {

        var input = readLine()
        println("Je betreed de kamer ne doet het licht aan.\n" +
                "Het blijkt een slaapkamer te zijn\n" +
                "Je kijkt rond en ziet een bureau een kast en een bed maar het lijkt wel alsof er iemand in het bed ligt!\n" +
                "Je staat even met je voeten aan de grond genageld je denkt na en kijkt rond je ziet een raam.\n" +
                "De enigste manier die je zover gezien hebt om uit het huis te gaan is uit dit raam.\n" +
                "Je gaat opzoek naar iets om door het raam te komen.\n" +
                "Type kast om in de kast te kijken Type bureaulade om in het laatje te kijken\n")

        if (input == "kast") {
            println("je opent de kast maar de deur kraakt zo erg dat de man wakker word.\n" +
                    "GAME OVER!")
        } else if (input == "bureaulade") {
            println("Je opent de la en vind een klein sleuteltje\n" +
                    "Je loopt zachtjes naar het raam en steekt het sleuteltje in het kleine slot\n" +
                    "Het werkt!!\n" +
                    "Je doet het raam open en springt er voorzichtig uit.\n" +
                    "Je hebt wel 10 fall damage gekregen\n")
            player1.life -= 10
            println("Je health is nu:")
            println(player1.life)
        }

    }


    kelder()
    halNaarTrap()
    trap()
    woonkamer()
    keuken()
    halNaarSlaapkamer()
    slaapkamer()
//    tuin()
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