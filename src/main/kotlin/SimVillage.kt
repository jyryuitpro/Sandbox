fun main(args: Array<String>) {
//    val greetingFunction = { playerName: String, numBuildings: Int ->
//        val currentYear = 2019
//        println("$numBuildings 채의 건물이 추가됨")
//        "SimVillage 방문을 환영합니다, $playerName 님! (copyright $currentYear)"
//    }
//    runSimulation("김선달", ::printConstructionCost) { playerName, numBuildings ->
//        val currentYear = 2019
//        println("$numBuildings 채의 건물이 추가됨")
//        "SimVillage 방문을 환영합니다, $playerName 님! (copyright $currentYear)"
//    }
    runSimulation()
//    println({
//        val currentYear = 2019
//        "SimVillage 방문을 환영합니다, 촌장님! (copyright $currentYear)"
//    }())
//    println(greetingFunction("김선달", 2))
//    runSimulation("김선달", greetingFunction)
}

//inline fun runSimulation(playerName: String, costPrinter: (Int) -> Unit, greetingFunction: (String, Int) -> String) {
//    val numBuildings = (1..3).shuffled().last() // 1, 2, 3 중 하나를 무작위로 선택한다.
//    costPrinter(numBuildings)
//    println(greetingFunction(playerName, numBuildings))
//}

fun runSimulation() {
    val greetingFunction = configreGreetingFunction()
    println(greetingFunction("김선달"))
}

fun configreGreetingFunction(): (String) -> String {
    val structureType = "병원"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2019
        numBuildings += 1
        println("$numBuildings 채의 $structureType 이 추가됨")
        "SimVillage 방문을 환영합니다, $playerName! (copyright $currentYear)"
    }
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("건축 비용: ${cost * numBuildings}")
}