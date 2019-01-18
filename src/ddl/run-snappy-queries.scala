import scala.io.Source
var Idx = "1"
val begin = System.currentTimeMillis()
val queryPath = "/nfs/users/tkhairnar/code/snappydata/spark/sql/core/src/test/resources/tpcds"
println("query, time")
for (i <- 1 to 99 ) {
  Idx = s"$i"

  //val s = Source.fromFile(s"$queryPath/query$Idx.sql").mkString.replaceAll(";","")
  val s = Source.fromFile(s"$queryPath/q$Idx.sql").mkString.replaceAll(";","")
  try {
    spark.time( {
      spark.sql(s"""$s""").show
      //print(s"Q$Idx time -->")
      print(s"Q$Idx ,")
      })
  } catch {
        case _: Throwable => println(s"QUERY $Idx FAILED")
  }
}
val end = System.currentTimeMillis()
println("TOTAL TIME = " + (end - begin) + " milliseconds")

