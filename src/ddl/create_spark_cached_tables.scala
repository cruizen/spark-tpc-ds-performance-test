val df = spark.table("call_center_text_staging").cache
df.createOrReplaceTempView("call_center")
spark.sql("select count(*) from call_center").show

val df = spark.table("catalog_page_text_staging").cache
df.createOrReplaceTempView("catalog_page")
spark.sql("select count(*) from catalog_page").show

val df = spark.table("catalog_returns_text_staging").cache
df.createOrReplaceTempView("catalog_returns")
spark.sql("select count(*) from catalog_returns").show

val df = spark.table("catalog_sales_text_staging").cache
df.createOrReplaceTempView("catalog_sales")
spark.sql("select count(*) from catalog_sales").show

val df = spark.table("customer_text_staging").cache
df.createOrReplaceTempView("customer")
spark.sql("select count(*) from customer").show

val df = spark.table("customer_address_text_staging").cache
df.createOrReplaceTempView("customer_address")
spark.sql("select count(*) from customer_address").show

val df = spark.table("customer_demographics_text_staging").cache
df.createOrReplaceTempView("customer_demographics")
spark.sql("select count(*) from customer_demographics").show

val df = spark.table("date_dim_text_staging").cache
df.createOrReplaceTempView("date_dim")
spark.sql("select count(*) from date_dim").show

val df = spark.table("household_demographics_text_staging").cache
df.createOrReplaceTempView("household_demographics")
spark.sql("select count(*) from household_demographics").show

val df = spark.table("income_band_text_staging").cache
df.createOrReplaceTempView("income_band")
spark.sql("select count(*) from income_band").show

val df = spark.table("inventory_text_staging").cache
df.createOrReplaceTempView("inventory")
spark.sql("select count(*) from inventory").show

val df = spark.table("item_text_staging").cache
df.createOrReplaceTempView("item")
spark.sql("select count(*) from item").show

val df = spark.table("promotion_text_staging").cache
df.createOrReplaceTempView("promotion")
spark.sql("select count(*) from promotion").show

val df = spark.table("reason_text_staging").cache
df.createOrReplaceTempView("reason")
spark.sql("select count(*) from reason").show

val df = spark.table("ship_mode_text_staging").cache
df.createOrReplaceTempView("ship_mode")
spark.sql("select count(*) from ship_mode").show

val df = spark.table("store_text_staging").cache
df.createOrReplaceTempView("store")
spark.sql("select count(*) from store").show

val df = spark.table("store_returns_text_staging").cache
df.createOrReplaceTempView("store_returns")
spark.sql("select count(*) from store_returns").show

val df = spark.table("store_sales_text_staging").cache
df.createOrReplaceTempView("store_sales")
spark.sql("select count(*) from store_sales").show

val df = spark.table("time_dim_text_staging").cache
df.createOrReplaceTempView("time_dim")
spark.sql("select count(*) from time_dim").show

val df = spark.table("warehouse_text_staging").cache
df.createOrReplaceTempView("warehouse")
spark.sql("select count(*) from warehouse").show

val df = spark.table("web_page_text_staging").cache
df.createOrReplaceTempView("web_page")
spark.sql("select count(*) from web_page").show

val df = spark.table("web_returns_text_staging").cache
df.createOrReplaceTempView("web_returns")
spark.sql("select count(*) from web_returns").show

val df = spark.table("web_sales_text_staging").cache
df.createOrReplaceTempView("web_sales")
spark.sql("select count(*) from web_sales").show

val df = spark.table("web_site_text_staging").cache
df.createOrReplaceTempView("web_site")
spark.sql("select count(*) from web_site").show

