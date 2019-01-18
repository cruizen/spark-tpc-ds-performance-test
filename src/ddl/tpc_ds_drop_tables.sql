-- USE ${TPCDS_DBNAME};
--use tpcds;


drop table if exists call_center_text_staging;
drop table if exists call_center;

drop table if exists catalog_page_text_staging;
drop table if exists catalog_page;

drop table if exists customer_text_staging;
drop table if exists customer;

drop table if exists customer_address_text_staging;
drop table if exists customer_address;
drop table if exists customer_demographics_text_staging;
drop table if exists customer_demographics;

drop table if exists date_dim_text_staging;
drop table if exists date_dim;

drop table if exists household_demographics_text_staging;
drop table if exists household_demographics;

drop table if exists income_band_text_staging;
drop table if exists income_band;

drop table if exists item_text_staging;
drop table if exists item;

drop table if exists promotion_text_staging;
drop table if exists promotion;

drop table if exists reason_text_staging;
drop table if exists reason;

drop table if exists ship_mode_text_staging;
drop table if exists ship_mode;

drop table if exists store_text_staging;
drop table if exists store;

drop table if exists store_sales_text_staging;
drop table if exists store_sales;

drop table if exists store_returns_text_staging;
drop table if exists store_returns;

drop table if exists inventory_text_staging;
drop table if exists inventory;

drop table if exists time_dim_text_staging;
drop table if exists time_dim;

drop table if exists warehouse_text_staging;
drop table if exists warehouse;

drop table if exists web_page_text_staging;
drop table if exists web_page;

drop table if exists web_sales_text_staging;
drop table if exists web_sales;

drop table if exists web_returns_text_staging;
drop table if exists web_returns;

drop table if exists web_site_text_staging;
drop table if exists web_site;

drop table if exists catalog_sales_text_staging;
drop table if exists catalog_sales;

drop table if exists catalog_returns_text_staging;
drop table if exists catalog_returns;
