#!/usr/bin/python 

counter_1 = 0
counter_2 = 0
for num in range(1, 101):
    print(num)
    counter_1 += num
    counter_2 += num**2
print(counter_1**2 - counter_2)
