class Player(private var name: String) {

    private var hand: String = ""
    var handPlayer = this.hand.filter { !it.isWhitespace() }   //delete space

    fun getName(): String = this.name

    fun isCheckHand() : Boolean {

        if (this.handPlayer.isEmpty()){
            println("Pilihan ${this.name} Tidak Boleh Kosong")
            println("===GAME STOP===")
            return true
        }
        if(!isShowHand(handPlayer)) {
            println("Pilihan ${this.name} Salah")
            println("===GAME STOP===")
            return true
        }
        return false
    }

    private fun isShowHand(inputHand: String): Boolean {

        val noSpace = inputHand.filter { !it.isWhitespace() }
        val hand:Boolean = when{
            inputHand.equals("gunting",true)||
                    inputHand.equals("batu",true) ||
                    inputHand.equals("kertas",true) -> true
            inputHand != noSpace -> true
            else -> false
        }
        return hand
    }
}
