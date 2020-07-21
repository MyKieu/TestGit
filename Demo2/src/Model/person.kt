package Model


class Person {
    var id : Int = 0
    var name : String ?= null
    var address: String ?= null
    var age : Int = 0
    var batch : String ?= null
    // it'll create when initialization
    init {
        id = 1
    }
    fun display() {
        println("Full name's ${name}")
        println("Old is ${age}")
        println("Address is ${address}")
        println("Batch is ${batch}")
    }
    //Nested class
    inner class Teacher{

        var salary : Double = 0.0
        fun displaySalary(){
            println("Full name's ${name}")
            println("Salary of you is  ${salary}")
        }
    }


}
