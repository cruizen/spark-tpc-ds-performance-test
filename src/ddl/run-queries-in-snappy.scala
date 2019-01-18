import scala.io.Source
System.gc()
System.runFinalization()

var Idx = "01"
val begin = System.currentTimeMillis()
val snappy = new org.apache.spark.sql.SnappySession(sc)
snappy.sql("USE TPCDS10GB")
snappy.sql("set spark.debug.maxToStringFields=100")
snappy.sql("set snappydata.enable-experimental-features=true")
snappy.sql("set spark.sql.crossJoin.enabled=true")
//val queryPath = "/nfs/users/tkhairnar/code/snappydata/spark/sql/core/src/test/resources/tpcds"
val queryPath ="/nfs/users/tkhairnar/code/cruizen/spark-tpc-ds-performance-test/src/queries/"

println("Query, ExecutionTime")

case class Timing(Query:String, Time:Double)

var timings = Seq.empty[Timing]

for (i <- 61 to 65) {
  if ( i < 10 ) Idx = s"0$i"
  else Idx = s"$i"

  val query = Source.fromFile(s"$queryPath/query$Idx.sql").mkString.replaceAll(";","")
  try {
    var startTime = System.nanoTime
    snappy.sql(s"""$query""").show
    var endTime = System.nanoTime
    val queryExecutionTime = (endTime - startTime).toDouble / 1000000.0
    timings = timings :+ Timing(s"Q$Idx", queryExecutionTime)
    println(s"Q$Idx Time=$queryExecutionTime")
  } catch {
        case _: Throwable => println(s"QUERY $Idx FAILED")
        case e:Exception => println(e.printStackTrace())
  }
}
val end = System.currentTimeMillis()
println("TOTAL TIME = " + (end - begin) + " milliseconds")

val timingsDF = timings.toDF()
timingsDF.coalesce(1).write.mode("overwrite").format("com.databricks.spark.csv").option("header","true").csv("query_timings.csv")
//timingsDF.registerTempTable("query_timings")
timingsDF.createOrReplaceTempView("query_timings");
//snappy.sql("select * from query_timings").show()
spark.sql("select * from query_timings").show()
