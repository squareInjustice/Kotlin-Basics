import javax.swing.text.Position

class Employee(var name:String, var position: String, var salary: Double, var status: String){

    fun work(){
        println("Employee is working")
    }


}

fun main() {
    var employee1 = Employee("Ann", "CEO", 560000.00, "married")
    println(employee1.name + " " + employee1.position)


    var employee2 = Employee("Job", "HR", 160000.00, "married")
    println(employee2.name + " " + employee2.position)


    var employee3 = Employee("Jane", "Receptionist", 60000.00, "single")
    println(employee3.name + " " + employee3.position)


    var employee4 = Employee("Mark", "HOM", 560000.00, "married")
    println(employee4.name + " " + employee4.position)



}