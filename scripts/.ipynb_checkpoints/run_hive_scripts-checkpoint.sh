#!/bin/bash

cd ~/project/flight-delay-prediction

BEELINE_CMD="beeline -u \"jdbc:hive2://hadoop-03.uni.innopolis.ru:10001\" -n team21 -p muYLyFnzeY4xZzcD"
HQL_DIR="../sql"

eval "$BEELINE_CMD --hivevar team.name=team21 -f $HQL_DIR/01_init_database.hql"
eval "$BEELINE_CMD --hivevar team.name=team21 -f $HQL_DIR/02_optimize_tables.hql"