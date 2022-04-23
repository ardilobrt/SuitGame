fun main() {

    showSymbol(25)
    println("GAME SUIT TERMINAL VERSION")
    showSymbol(25)

    //PLAYER 1
    print("Player-1 Input Pilihan Anda(gunting/batu/kertas): ")
    val inputPlayer1:String = readLine()!!
    val player1 = Player("Player-1")
    player1.handPlayer = inputPlayer1.filter { !it.isWhitespace() }
    if (player1.isCheckHand()) return

    //PLAYER 2
    print("Player-2 Input Pilihan Anda(gunting/batu/kertas): ")
    val inputPlayer2:String = readLine()!!
    val player2 = Player("Player-2")
    player2.handPlayer = inputPlayer2.filter { !it.isWhitespace() }
    if (player2.isCheckHand()) return

    //Game Start
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