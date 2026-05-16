class Student(
    val id: Long,
    val name: String,
    val lastname: String,
    val email: String,
    val grade: Int,
    val isActive: Boolean
)

fun main() {

    val student = Student(
        id = 1L,
        name = "Mateo",
        lastname = "Salazar",
        email = "mateosalazar@hotmail.com",
        grade = 8,
        isActive = true
    )

    println("ID: ${student.id}")
    println("Name: ${student.name}")
    println("Lastname: ${student.lastname}")
    println("Email: ${student.email}")
    println("Grade: ${student.grade}")
    println("Active: ${student.isActive}")

    if (student.isActive) {
        println("El estudiante ${student.name} está activo")
    } else {
        println("El estudiante ${student.name} no está activo")
    }
}