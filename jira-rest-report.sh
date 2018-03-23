#!/bin/bash

	# Report memory usage on the system.

smem | grep java | grep -v grep

	# System data.

cat /proc/meminfo | egrep "Memtotal|MemFree|MemAvailable|SwapTotal"

	# Java specific data.

proc=$(jps | grep -v -i jps | awk {'print $1;'})
echo "Process id: " $proc

jps | grep -v -i jps |  awk {'print $1;'} | xargs -I{} jstat -gccapacity {} 


