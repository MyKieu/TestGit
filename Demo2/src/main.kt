import Model.Person
import Model.student

fun main(){
    var st = student()
    st.id=1
    st.name="Phuong"
    st.age=20
    st.batch="17CNTT3"
   // st.display()

    // nested class
        // var nes = Person.Teacher()

    //inner and nested class
    var nested = Person()
    var child = nested.Teacher()
    nested.name = "Phuong"
    child.salary = 100.0

    child.displaySalary()
}