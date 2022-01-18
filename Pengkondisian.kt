fun main()
{
    /* a < b
    * a <=b
    * a >=b
    * a > b
    * a == b
    * a !=b
    * !b
    * */

    var b = 100

    if(b <= 50) {
        println("Failed")
    }else if (b <= 65){
        println("Grade C")
    }else if (b <= 70){
        println("Grade B-")
    }else if (b <= 80){
        println("Grade B")
    }else if (b <= 90){
        println("Grade A-")
    }else if (b <= 100) {
        println("Nilai anda " + b + ", Grade A")
    }
}
