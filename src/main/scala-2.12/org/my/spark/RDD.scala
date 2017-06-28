package org.my.spark


/**
  * Created by Administrator on 2017/6/27 0027.
  *
  */
trait RDD[U] {

  val partitions:Array[Partition]

  val dependency:Dependency

  def compute:( => U)

  def map[X]:(U =>RDD[X])

  def reduce

}
