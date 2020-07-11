package com.atguigu.summer.framework.core

object WordCounts {

  def main(args: Array[String]): Unit = {

    val list = List(
      ("hello", 4),
      ("hello spark", 3),
      ("hello spark scala", 2),
      ("hello spark scala hive", 1)
    )

    println(list.map(a => (a._1 + " ") * a._2)
      .flatMap(a => a.split(" "))
      .groupBy(word => word)
      .map(a => (a._1, a._2.length))
      .toList.sortBy(a => a._2)(Ordering.Int.reverse).take(3)
    )


    println(list.map(a => (a._1 + " ") * a._2)
      .flatMap(a => a.split(" "))
      .groupBy(word => word).map(a => {
      val users = new Users
      users.i = a._2.length
      users.word = a._1
      (users.i, users.word)
    }).toList.sortBy(user => {
      (user._1, user._2)
    }).reverse.take(3))


  }

  class Users {
    var i: Int = _
    var word: String = _

    override def toString: String = {
      s"User[$word, $i :]"
    }
  }

}
