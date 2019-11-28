package com.test
import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.log4j.Logger
import org.apache.log4j.Level
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions._
object App {
  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.OFF)
    Logger.getLogger("akka").setLevel(Level.OFF)
    val conf = new SparkConf()
    conf.setMaster("local[*]")
    conf.setAppName("Simple Application")

    implicit val spark: SparkSession = SparkSession.builder().config(conf).getOrCreate()
    import spark.implicits._



  }
}
