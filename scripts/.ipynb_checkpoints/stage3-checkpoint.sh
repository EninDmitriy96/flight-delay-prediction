#!/bin/bash

cd ~/flight-delay-prediction

PYLINT_THRESHOLD=7.0
PYLINT_OUTPUT=$(pylint ~/flight-delay-prediction/scripts/ml.py --output-format=text)
PYLINT_SCORE=$(echo "$PYLINT_OUTPUT" | grep -oP "Your code has been rated at \K[0-9.]+")

export HADOOP_CONF_DIR=/etc/hadoop/conf
export YARN_CONF_DIR=/etc/hadoop/conf

echo "Pylint score: $PYLINT_SCORE/10"

# Save pylint report
echo "$PYLINT_OUTPUT" > pylint_report.txt

spark-submit \
  --master yarn \
  --deploy-mode client \
  --driver-memory 4g \
  --executor-memory 4g \
  --executor-cores 2 \
  --num-executors 2 \
  scripts/ml.py
