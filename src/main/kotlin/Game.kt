class Game(player1: Player, player2: Player) : Winner() {

    private val nameP1 = player1.getName()
    private val nameP2 = player2.getName()
    private var handP1 = player1.handPlayer.lowercase()
    private var handP2 = player2.handPlayer.lowercase()

    override fun sendWinner(playerName: String) {
        this.playerName = playerName
        println("hasil: $playerName win!!".uppercase())
    }

    fun startGame() {

        val resultGame = ruleGame(handP1, handP2)
        println("===GAME START===")
        println("$handP1 VS $handP2".uppercase())
        if (handP1 == resultGame) {
            sendWinner(nameP1)
            return
        }
        if (handP2 == resultGame) {
            sendWinner(nameP2)
            return
        }
        println("HASIL: $resultGame")
    }

    private fun ruleGame(handP1: String, handP2: String): String {
        val hand = when("$handP1-$handP2"){
            "kertas-batu","batu-kertas" -> "kertas"
            "kertas-gunting", "gunting-kertas"-> "gunting"
            "batu-gunting", "gunting-batu"-> "batu"
            else -> "DRAW"
        }
        return hand
    }
}