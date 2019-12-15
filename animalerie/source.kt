fun main(){

    val animalerie = Animalerie()

    animalerie.SeDeplaceAQuatrePattes(chien())
    animalerie.SeDeplaceAQuatrePattes(chat())
    animalerie.SeDeplaceAQuatrePattes(gorille())
    animalerie.SeDeplaceADeuxPattes(perroquet())


    for(espece in animalerie.list1){
        espece.quiSuisJe()
    }
    for(espece1 in animalerie.list2){
        espece1.quiSuisJe()
    }

    val arr = arrayOf(chien(), chat(), gorille())
    for(espece in arr){
        espece.quiSuisJe()
        espece.nombrePattes()
        espece.bruit()
    }


        val arr1 = arrayOf(perroquet())
        for(espece1 in arr1){
            espece1.quiSuisJe()
            espece1.nombrePattes()
            espece1.bruit()

        }


}