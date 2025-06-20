DROP DATABASE IF EXISTS team21_projectdb CASCADE;

CREATE DATABASE team21_projectdb
LOCATION "/user/team21/project/hive/warehouse";

USE team21_projectdb;

DROP TABLE IF EXISTS flights;
DROP TABLE IF EXISTS flights_optimized;

CREATE EXTERNAL TABLE flights (
    FL_DATE STRING,
    AIRLINE_CODE STRING,
    DOT_CODE INT,
    FL_NUMBER INT,
    ORIGIN_CITY STRING,
    DEST STRING,
    DEST_CITY STRING,
    CRS_DEP_TIME INT,
    DEP_TIME FLOAT,
    DEP_DELAY FLOAT,
    TAXI_OUT FLOAT,
    WHEELS_OFF FLOAT,
    WHEELS_ON FLOAT,
    TAXI_IN FLOAT,
    CRS_ARR_TIME INT,
    ARR_TIME FLOAT,
    ARR_DELAY FLOAT,
    CANCELLED FLOAT,
    CANCELLATION_CODE STRING,
    DIVERTED FLOAT,
    CRS_ELAPSED_TIME FLOAT,
    ELAPSED_TIME FLOAT,
    AIR_TIME FLOAT,
    DISTANCE FLOAT,
    DELAY_DUE_CARRIER FLOAT,
    DELAY_DUE_WEATHER FLOAT,
    DELAY_DUE_NAS FLOAT,
    DELAY_DUE_SECURITY FLOAT,
    DELAY_DUE_LATE_AIRCRAFT FLOAT,
    ORIGIN STRING
)
STORED AS PARQUET
LOCATION '/user/team21/project/warehouse/flights';