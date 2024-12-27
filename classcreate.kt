open class vehicle(val name: String){
    fun travel(){
        println("i was traveling on $name")
    }
}
open class car(name: String) : vehicle(name){
    fun fourWheels(){
        println("car drives on four wheels")
    }
}
class bike(name: String) : vehicle(name){
    fun twoWheels(){
        println("bike drives on four wheels ")
    }
}
class truck(name:String) : car(name){
    fun carandtruck(){
        println("hello")
    }

}

fun main(){
    val a = car("wagon R")
    a.fourWheels()
    a.fourWheels()
    a.travel()
    val b = bike("tvs")
    b.twoWheels()
    b.travel()
}