class Animalerie{

    var list1 = mutableListOf<animalQuatrePattes>()
    fun SeDeplaceAQuatrePattes(espece : animalQuatrePattes){
        list1.add(espece)
    }

    var list2 = mutableListOf<animalDeuxPattes>()
    fun SeDeplaceADeuxPattes(espece1 : animalDeuxPattes){
        list2.add(espece1)
    }
}