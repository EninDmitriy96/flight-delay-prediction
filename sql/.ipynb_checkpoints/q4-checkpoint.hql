USE team21_projectdb;
DROP TABLE IF EXISTS q4_results;

CREATE EXTERNAL TABLE q4_results(
    feature_name STRING,
    correlation_with_delay DOUBLE
)
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
LOCATION 'project/hive/warehouse/q4';

SET hive.resultset.use.unique.column.names = false;

DROP TABLE IF EXISTS temp_flight_delays;
CREATE TABLE temp_flight_delays AS
SELECT 
    *,
    CASE WHEN DEP_DELAY > 0 THEN 1 ELSE 0 END AS is_delayed
FROM flights;

INSERT INTO TABLE q4_results
SELECT 
    'CRS_DEP_TIME' AS feature_name,
    CORR(is_delayed, CRS_DEP_TIME) AS correlation_with_delay
FROM temp_flight_delays
WHERE CRS_DEP_TIME IS NOT NULL;

INSERT INTO TABLE q4_results
SELECT 
    'ARR_DELAY',
    CORR(is_delayed, ARR_DELAY)
FROM temp_flight_delays
WHERE ARR_DELAY IS NOT NULL;

INSERT INTO TABLE q4_results
SELECT 
    'DEP_TIME',
    CORR(is_delayed, DEP_TIME)
FROM temp_flight_delays
WHERE DEP_TIME IS NOT NULL;

INSERT INTO TABLE q4_results
SELECT 
    'DISTANCE',
    CORR(is_delayed, DISTANCE)
FROM temp_flight_delays
WHERE DISTANCE IS NOT NULL;

INSERT INTO TABLE q4_results
SELECT 
    'AIR_TIME',
    CORR(is_delayed, AIR_TIME)
FROM temp_flight_delays
WHERE AIR_TIME IS NOT NULL;

SELECT * FROM q4_results;
