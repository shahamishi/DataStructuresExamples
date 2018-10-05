#!/bin/bash

ipaddress=$(ifconfig eth0 | awk '/inet /{print $2}')
echo $ipaddress

for i in `find /mnt/configFiles/  -name "*.cfg" -type f`; do
  if grep -q "zillow.com" $i
  then
      sed -i "s/zillow.com/$ipaddress/g" $i
      mv $i $(echo $i | sed 's/cfg/conf/');
  fi
done
