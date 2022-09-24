fun main(args: Array<String>) {
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2019
        println("$numBuildings 채의 건물이 추가됨")
        "SimVillage 방문을 환영합니다, $playerName 님! (copyright $currentYear)"
    }
//    println({
//        val currentYear = 2019
//        "SimVillage 방문을 환영합니다, 촌장님! (copyright $currentYear)"
//    }())
    println(greetingFunction("김선달", 2))
}