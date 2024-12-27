open class Bird(val name:String){
    fun wingFeature(){
        println("$name is bird")

    }
}
class WaterBird (name: String) : Bird(name){
    fun WaterFeature(){
        println("$name can fly")
    }
}
class SKyBird(name: String): Bird(name){
    fun skyFeature(){
        println("$name can swim")
    }
}

fun main() {
    val WaterBirdA = WaterBird("tr")
    val SkybirdB = SKyBird("re")
    SkybirdB.skyFeature()
    WaterBirdA.WaterFeature()


//Write your code here
}