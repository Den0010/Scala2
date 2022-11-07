import scala.io.StdIn.readLine
object App {

  def main(args: Array[String]): Unit = {
// a.
    val S:String ="Hello Scala!"
    var S2:String = ""
    println(S)
    println("I "+S.reverse)
    println("II "+S.toLowerCase())
    for (i <-0 to S.length-1)
      {
        if (S.charAt(i) != '!')
        {
          S2=S2+S.charAt(i)
        }
      }
    println("III "+S2)
    S2=S2+" and goodbye python!"
    println("IV "+S2)

    // b.

    println("Введите оклад: ")
    var salary=readLine().toInt
    println("Введите премию в долях оклада: ")
    var bonus=readLine().toFloat
    println("Введите сумму компенсации за питание: ")
    var eatbonus=readLine().toInt
    var summa = salary*bonus+eatbonus+salary
    println(summa)
    println()

    //c.
    var l = List(100, 150, 200, 80, 120, 75)
    println("Зарплаты сотрудников:")
    println(l)
    println("Отклонения от среднего:")
    val commonSalary = l.sum
    val countPersons = l.size
    val sr=commonSalary/countPersons
    for (i<- l) println((i-sr)*100/i)

      //d.
    println("Добавляем зарплату нового сотрудника:")
    val l2 = (l:+ summa.toInt)
    println(l2)
    println("Максимальная зарплата:")
    println(l2.max)
    println("Минимальная зарплата:")
    println(l2.min)

      //e.
      println("Добавляем зарплату новых сотрудников 350 и 90:")
    var l3 = l2:+350:+90
      println(l3)
    l3 = l3.sorted
      println("Сортируем по возрастанию:")
      println(l3)
      //f.
      var l4 = List[Int]()
      var flag:Boolean=true

    for (i<-l3)
        {
            if (i<=130) l4 = l4 :+ i
            else if (flag)
                {
                    flag = !(flag)
                    l4 = l4:+ 130 :+ i
                }
            else l4 = l4 :+ i
        }
      println("Добавляем 130")
      println(l4)
        //g.

      println("Введите нижнюю границу для middle: ")
      var downMiddle = readLine().toInt
      println("Введите верхнюю границу для middle: ")
      var upMiddle = readLine().toInt
      for (i<-l4) if ((i>=downMiddle)&&(i<=upMiddle)) print(i+" ")
      println()
      //h.
      var l5 = List[Double]()
      for (i<-l4) l5 = l5 :+ (i+i*0.07)
      println("Индексируем на 7%:")
      println(l5)
  }
}
