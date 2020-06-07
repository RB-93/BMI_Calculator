package kotliner.bmi

import java.math.RoundingMode

/**
 * This class shows BMI and the health status based on the weight and height supplied by the user
 * The constructor class takes two parameters
 */
class BodyMassIndex(private var weight: Any?, private var height: Any?) {

    // Variables to show BMI and the health status
    private var bmi = 0.0
    private var status = ""

    // Function to calculate BMI and show the health status
    fun buildBmi() {
        bmi = bmiCalculate(weight as Double, height as Double)

        println("Your BMI is: ${bmi.toBigDecimal().setScale(2, RoundingMode.HALF_UP)}")
        println(weightStatus(bmi))
    }

    // functions to evaluate the health status based on the calculated BMI
    fun weightStatus(bmiValue: Double): String {
        return when {
            bmiValue >= 30.0 -> "You're Obese!"
            bmiValue >= 25.0 -> "You're Overweight!"
            bmiValue >= 18.5 -> "You're Healthy!"
            else -> "You're underweight!"
        }
    }
}

// This compact function (single expression function) calculates BMI
fun bmiCalculate(w: Double, h: Double): Double = (w / ((h * h) / 100)) * 100
