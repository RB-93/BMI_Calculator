package kotliner.bmi

import java.util.*

// The main() method calls the buildFromBmiClass()
fun main() {
    buildFromBmiClass()
}

// Function to get weight and height values from user
fun buildFromBmiClass() {

    // Variables to store weight and height values of any type with nullability check
    var weight: Any? = 0.0
    var height: Any? = 0.0

    // Scanner object to scan inputs from console
    val inputReader = Scanner(System.`in`)

    // Exception handling for invalid values entered by the user
    try {
        print("Enter your weight (in kg): ")
        weight = inputReader.nextDouble()

        print("Enter your height (in cms): ")
        height = inputReader.nextDouble()

        // Call to Class object and the method which shows the BMI
        val bodyMassIndex = BodyMassIndex(weight, height)
        bodyMassIndex.buildBmi()

    } catch (e: InputMismatchException) {
        when {
            weight is String -> {
                println("\nInvalid weight")
            }
            height is String -> {
                println("\nInvalid height")
            }
            else -> {
                println("Invalid Data")
            }
        }
    }
}