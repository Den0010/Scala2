object App2 {
  def main(args: Array[String]): Unit = {
  println("123")


    val s1 = Set(1, 2, 3)

    val arr: Array[Int] = Array(0, 0, 0, 0, 0)

    // Applying copyToArray method
    s1.copyToArray(arr)

    // Displays output
    for (elem <- arr)
      println(elem)
  }
}
