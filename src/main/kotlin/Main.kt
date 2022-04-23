fun main() {

    showSymbol(25)
    println("GAME SUIT TERMINAL VERSION")
    showSymbol(25)

    print("Player-1 Input Pilihan Anda(gunting/batu/kertas): ")
    val inputPlayer1:String = readLine()!!
    val player1 = Player(inputPlayer1)
    if (player1.ischeckHand()) return

    print("Player-2 Input Pilihan Anda(gunting/batu/kertas): ")
    val inputPlayer2:String = readLine()!!
    val player2 = Player(inputPlayer2)
    if (player2.ischeckHand()) return

    val game = Game(player1,player2)
    game.startGame()
}

fun showSymbol(repeatNum: Int){
    for (symbols in 0..repeatNum)
    {
        print("=")
    }
    println()
}