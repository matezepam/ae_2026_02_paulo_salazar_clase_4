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

    // Conditional
    val status: String = if (student.isActive) {
        "Activo"
    } else {
        "Inactivo"
    }

    println("El estudiante ${student.name} esta $status")

    // Add Students

    val student2 = Student(
        id = 2L,
        name = "Sofia",
        lastname = "Ramirez",
        email = "sofia.ramirez@yahoo.com",
        grade = 9,
        isActive = true
    )

    val student3 = Student(
        id = 3L,
        name = "Carlos",
        lastname = "Mendoza",
        email = "carlos.mendoza@outlook.com",
        grade = 6,
        isActive = false
    )

    val students = listOf(student, student2, student3)

    // Print Student Name and Grade
    for (miVariable in students) {
        println("${miVariable.name} ${miVariable.grade}")
    }

    // Print Active Status
    for (miVariable in students) {
        val statusStudent = if (miVariable.isActive) "Activo" else "Inactivo"
        println("${miVariable.name} - ${miVariable.grade} - $statusStudent")
    }
}