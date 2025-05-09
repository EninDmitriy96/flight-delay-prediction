#!/bin/bash

export PASSWORD=$(cat secrets/.psql.pass)

hadoop fs -rm -r /user/team21/project/warehouse/flights

sqoop import \
--connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team21_projectdb \
--username team21 \
--password $PASSWORD \
--table flights \
--target-dir /user/team21/project/warehouse/flights \
--as-parquetfile \
--compression-codec snappy \
--m 1

hadoop fs -ls /user/team21/project/warehouse/flights

