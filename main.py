
print("Enter name: ")

name = input("")

print("Enter " + name +"'s weight")
w = input("")
namer = name + ": " + str(w)
print(namer)

print("Enter name")

name2 = input("")

print("Enter " + name2 +"'s weight")
w2 = input("")
namer2 = name2 + ": " + str(w2)
print(namer2)

print("Enter name")
name3 = input("")
print("Enter " + name3 +"'s weight")
w3 = input("")
namer3 = name3 + ": " + str(w3)
print(namer3)
i = 0

if int(w) > int(w2):
    wh1 = namer + " > " +namer2
    print(wh1)

if int(w2) > int(w):
    wh2 = namer2 + " > " + namer
    print(wh2)

if int(w) > int(w3):
    wh3 = namer + " > " + namer3
    print(wh3)

if int(w3) > int(w2):
    wh4 = namer3 + " > " + namer2
    print(wh4)

if int(w3) > int(w):
    wh5 = namer3 + " > " + namer
    print(wh5)

if int(w2) > int(w3):
    wh6 = namer2 + " > " + namer3
    print(wh6)

if int(w) > int(w2):
    if int(w) > int(w3):
        
        print(name + " weights the most")


if int(w2) > int(w):
    if int(w2) > int(w3):
        print(name2 + " weights the most")

if int(w3) > int(w2):
    if int(w) < int(w3):
        print(name3 + " weights the most")

print("")

