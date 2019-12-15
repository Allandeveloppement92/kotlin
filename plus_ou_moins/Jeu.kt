fun main(args: Array<String>) {

    //var
    val prixJuste: Int
    var prixTest: Int
    var prixFind: Boolean = false
    var checkQ: String
    var essai = 0


    println("Plus ou Moins\n")
    println("Une première personne entre un nombre et ensuite la seconde doit trouver le nombre entré.\n" +
            "Tant qu’elle n’a pas trouvé, le programme continue.\n" +
            "Quand elle a trouvé, le programme s’arrête.\n" +
            "Quand le nombre entré par la seconde personne est inférieur, printer plus et vice versa.\n" +
            "Vous pouvez abandonner en entrant 'q'.\n" +
            "Vous êtes prêt ? C'est parti !\n")

    println("Joueur 1 \n")
    print("Entrez un nombre: ")
    prixJuste = readLine()!!.toInt()
    println("Votre numéro est : $prixJuste" )

    //Je n'ai pas réussi à cacher la saisie du joueur 1, donc j'ai utilisé un "println" avec des '\n' pour descendre et cacher le résulat ..
    println("\n \n \n \n \n \n \n")

    //Je n'ai pas réussi à cacher la saisie du joueur 1, donc j'ai utilisé des "println" pour descendre et cacher le résulat ..

    do {
        println()
        essai++
        println("Joueur 2")
        println("Essai n°$essai :")
        print("Saisir un nombre ou quitter 'q' : ")
        //print("Essai n° $essai, saisir un nombre ou quitter 'q': ")
        checkQ = readLine()!!

        if (checkQ == "q") {
            println("Vous avez abandonné à l'essai n° $essai: le juste prix était $prixJuste.")
            prixFind = true
        } else {
            prixTest = checkQ.toInt()
            print("Votre numéro $prixTest est ")

            when {
                prixTest < prixJuste -> println("inférieur au Juste Prix ... ")
                prixTest > prixJuste -> println("supérieur au Juste Prix ... ")

                else -> {
                    println("égal au Juste Prix !\nFélicitation !")
                    prixFind = true
                }
            }
            if (!prixFind) {
                when(prixTest){
                    in prixJuste-5..prixJuste+5 -> println("T'es bouillant !")
                    in prixJuste-10..prixJuste+10 -> println("Tu chauffes fort !")
                    in prixJuste-15..prixJuste+15 -> println("Tu chauffes !")
                    in prixJuste-20..prixJuste+20 -> println("C'est froid !")
                    in prixJuste-30..prixJuste+30 -> println("C'est très froid !")
                    in prixJuste-50..prixJuste+50 -> println("Orhh t'es glacé !")
                }
            }
        }
    }while(!prixFind)
}