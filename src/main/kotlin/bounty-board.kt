const val HERO_NAME = "Madrigal";
fun main(){
    var playerLevel = 1;
    var hasSteed = false;
    var magicMirror = HERO_NAME.reversed()
    println("Hello $HERO_NAME")
    println("My lvl is $playerLevel")
    if (playerLevel == 1) {
        println("Meet Mr. Bubbles in the land of soft things.")
    } else {
        println("Locate the enchanted sword.")
    }
    println("Time passes...")
    println("The hero returns from her quest.")
    playerLevel++
    println("Level hero now $playerLevel")

}



