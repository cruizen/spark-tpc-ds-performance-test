import scala.io.Source
var Idx = "01"
val begin = System.currentTimeMillis()
//val queryPath = "/nfs/users/tkhairnar/code/snappydata/spark/sql/core/src/test/resources/tpcds"
val queryPath ="/nfs/users/tkhairnar/code/cruizen/spark-tpc-ds-performance-test/src/queries/"
println("query, time")
for (i <- 1 to 9) {
  if ( i < 10 ) Idx = s"0$i"
  else Idx = s"$i"

  val s = Source.fromFile(s"$queryPath/query$Idx.sql").mkString.replaceAll(";","")
  try {
    spark.time( {
      spark.sql(s"""$s""").show
      print(s"Q$Idx time -->")
      })
  } catch {
        case _: Throwable => println(s"QUERY $Idx FAILED")
  }
}
val end = System.currentTimeMillis()
println("TOTAL TIME = " + (end - begin) + " milliseconds")

