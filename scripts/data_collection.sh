#!/bin/bash

wget "https://www.googleapis.com/drive/v3/files/1vs6AcS2ByTMZh98rfmuJc54f2VKw2QlK?alt=media&key=AIzaSyAA9ERw-9LZVEohRYtCWka_TQc6oXmvcVU&supportsAllDrives=True" -O data/flights.csv

if [ $? -eq 0 ]; then
    echo "Dataset downloaded successfully"
else
    echo "Failed to download dataset"
    exit 1
fi

