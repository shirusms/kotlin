class Myclass{
//    data member
    var name="My name is Sylvia"
//    member function
    fun display(){
    println(name)
    }

}

fun main(args: Array<String>) {
    val obj=Myclass()
    obj.display()
//    creating object for car class
    val myobj2=Car()
     myobj2.model="Toyota"
     myobj2.make ="Premio"
     myobj2.yearofman=2024

    println("My favourite car model is ${myobj2.model} being a ${myobj2.make} manufactured in the year${myobj2.yearofman}")
}
class Car{
    var model=""
    var make=""
    var yearofman=0
}