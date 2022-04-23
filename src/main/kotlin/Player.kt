class Player(private val hand: String){

    private var name: String = ""
    val spaceLetter = this.hand.filter { !it.isWhitespace() }


    fun getNameP1() : String {
        this.name = "Player-1"
        return name
    }

    fun getNameP2() : String {

        this.name = "Player-2"
        return name
    }

    fun isCheckHand() : Boolean{

        if (this.hand.isBlank()){
            println("Pilihan ${this.name} Tidak Boleh Kosong")
            println("===GAME STOP===")
            return true
        }
        else if(!isShowHand(this.hand) || !isShowHand(spaceLetter)){
            println("Pilihan ${this.name} Salah")
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
