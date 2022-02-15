//fun main()
//{
//    var index:Int = 1
//
//    while(index <= 10)
//    {
//        if (index == 5)
//        {
////            index++ //continue
////            println(index)
//              continue
//            break
//        }
//        println(index)
//        index++
//    }
//}

fun main()
{
    var index:Int = 1

    var students = arrayOf<String>("A", "B", "C", "D", "E", "F")

    for(student in students)
    {
        if (student == "D")
        {
            continue
        }
        println(student)
    }
}