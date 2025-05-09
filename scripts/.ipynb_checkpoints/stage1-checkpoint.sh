#!/bin/bash

cd ~/flight-delay-prediction

./scripts/data_collection.sh
python3 scripts/build_projectdb.py
./scripts/ingest_hdfs.sh