#!/bin/bash

echo Please enter the website URL.
read url
status=$(curl -Is $url | head -1)

sudo yum install -y -q mailx > /dev/null
if [ `echo $status | grep -c "OK" ` -gt 0 ]
then
  echo "good"
else
  echo "The URL $url is not reachable" | mail -s "Uh-Oh Reachability Issue" someone@zillow.com
fi
