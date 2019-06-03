open class Animal(val weight: Int)
class Cow ( wt: Int) : Animal(wt)

interface Compare<in T>{
    fun compare(first: T, second: T):Int
}
fun main(args: Array<String>){
    val animalComparator: Compare<Animal> = object:Compare<Animal>{
        override fun compare(first: Animal, second: Animal):Int {
            return first.weight-second.weight
        }
    }


    val cowComparator: Compare<Cow> = animalComparator
}
