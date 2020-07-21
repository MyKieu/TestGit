package Model

class student {
    var id : Int = 0
    var name : String ?= null
    var address: String ?= null
    var age : Int = 0
    var batch : String ?= null


    fun display() {
        println("Full name's ${name}")
        println("Old is ${age}")
        println("Batch is ${batch}")
    }
}
