from random import random

p5x = 0.006
p4x = 0.051
bottom4 = 10
bottom5 = 90

num_draw = 1000000
num_no4 = 0 # 累计未出4星及以上的次数
num_no5 = 0 # 累计未出5星及以上的次数

num_4 = 0 # 累计4星次数(不含五星)
num_5 = 0 # 累计5星次数

for _ in range(num_draw):
prob = random()

if num_no5 == bottom5 - 1: # 5星保底
num_5 += 1
num_no4 = 0
num_no5 = 0
elif num_no4 == bottom4 - 1: # 4星保底
num_no4 = 0
if prob < p5x / (p4x + p5x):
# 按比例取得抽到5星的概率。运行结果5星 1.88%，4星 11.21%
# if prob < p5x:
# 如果四星保底这一发不影响5星概率，就应该是这一行代码。运行结果5星 1.43%，4星 11.85%
num_5 += 1
num_no5 = 0
else:
num_4 += 1
num_no5 += 1
else: # 没有触发保底
if prob < p5x: # 抽到5星
num_no4 = 0
num_no5 = 0
num_5 += 1
else:
num_no5 += 1
if prob < p4x + p5x: # 抽到4星
num_no4 = 0
num_4 += 1
else:
num_no4 += 1

print(f"5x: {num_5 / num_draw}")
print(f"4x: {num_4 / num_draw}")

