
open class Vehicle
class Car : Vehicle()
class Container<out T>

fun main(args: Array<String>) {
    var correct: Container<Vehicle> = Container<Car>()
   // var wrong: Container<Car> = Container<Vehicle>()
}
