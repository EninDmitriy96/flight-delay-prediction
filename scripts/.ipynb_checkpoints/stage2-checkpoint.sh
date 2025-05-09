#!/bin/bash

cd ~/flight-delay-prediction

PASSWORD=$(cat secrets/password.txt | tr -d '\n')
BEELINE_CMD="beeline -u \"jdbc:hive2://hadoop-03.uni.innopolis.ru:10001\" -n team21 -p $PASSWORD"
HQL_DIR="sql"

eval "$BEELINE_CMD --hivevar team.name=team21 -f $HQL_DIR/01_init_database.hql"
eval "$BEELINE_CMD --hivevar team.name=team21 -f $HQL_DIR/02_optimize_tables.hql"


eval "$BEELINE_CMD --hivevar team.name=team21 -f $HQL_DIR/q1.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q1.csv"
eval "$BEELINE_CMD --hivevar team.name=team21 -f $HQL_DIR/q2.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q2.csv"
eval "$BEELINE_CMD --hivevar team.name=team21 -f $HQL_DIR/q3.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q3.csv"
eval "$BEELINE_CMD --hivevar team.name=team21 -f $HQL_DIR/q4.hql --hiveconf hive.resultset.use.unique.column.names=false > output/q4.csv"
