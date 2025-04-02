fun main() {
    val newGame = Oyster()
    println(newGame.difficulty)
}


/**
 * Oyster is an hypothetical game of words scramble
 * it takes a player name, and game difficulty
 */

enum class GameLevel {
    Easy, Medium, Hard
}

class Oyster(val playerName: String = "Player", val difficulty: GameLevel = GameLevel.Easy)


