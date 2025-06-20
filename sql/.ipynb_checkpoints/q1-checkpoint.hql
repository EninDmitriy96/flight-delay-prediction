USE team21_projectdb;
DROP TABLE IF EXISTS q1_results;

CREATE EXTERNAL TABLE q1_results(
    ORIGIN STRING,
    COUNT_OF_FLIGHTS INT,
    DELAYED_FLIGHTS INT,
    DELAY_PERCENTAGE FLOAT,
    AVG_DELAY FLOAT
)

ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ',' 
LOCATION 'project/hive/warehouse/q1';

SET hive.resultset.use.unique.column.names = false;

INSERT INTO TABLE q1_results
SELECT 
    f.ORIGIN,
    f.COUNT_OF_FLIGHTS,
    f.DELAYED_FLIGHTS,
    ROUND(f.DELAYED_FLIGHTS / f.COUNT_OF_FLIGHTS * 100, 2) AS DELAY_PERCENTAGE,
    f.AVG_DELAY
FROM (
    SELECT
        ORIGIN,
        COUNT(DEP_TIME) AS COUNT_OF_FLIGHTS,
        SUM(CASE WHEN ARR_DELAY > 0 THEN 1 ELSE 0 END) AS DELAYED_FLIGHTS,
        AVG(ARR_DELAY) AS AVG_DELAY
    FROM flights
    GROUP BY ORIGIN
) f;

SELECT * FROM q1_results;