Testcase1 = [101,0,102,0,10,7,0,0]
index = 0

for i in range(len(Testcase1)):
    if Testcase1[i] != 0 :
        Testcase1[index] = Testcase1[i]
        index +=1

while index < len(Testcase1):
    Testcase1[index] = 0
    index += 1

print(Testcase1)
print("4 students are absent!")
