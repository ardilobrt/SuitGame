class Player(private val hand: String) {

    private var name: String = ""
    val spaceLetter = this.hand.filter { !it.isWhitespace() }

    fun setName(playerName: String) : String{
        this.name = playerName
        return playerName
    }

    fun ischeckHand() : Boolean{

        if (this.hand.isBlank()){
            println("Pilihan Tidak Boleh Kosong")
            println("===GAME STOP===")
            return true
        }
        else if (!isShowHand(this.hand) || !isShowHand(spaceLetter)){
            println("Pilihan Anda Salah")
            println("===GAME STOP===")
            return true
        }
        return false
    }

    private fun isShowHand(inputHand: String): Boolean{

        val hand:Boolean = when{
            inputHand.equals("gunting",true)||
                    inputHand.equals("batu",true) ||
                    inputHand.equals("kertas",true) ||
                    inputHand != spaceLetter -> true
            else -> false
        }
        return hand
    }
}
