#! /usr/bin/python

# You don't define variables in Python. They are chosen based on the value assigned

from math import sqrt

integerEx = 8
longIntEx = 22000000000000000000000
floatEx = 2.2
stringEx = "Hello"
booleanEx = True

print type(integerEx)
print type(longIntEx)
print type(floatEx)
print type(stringEx)
print type(booleanEx)

# Boolean Examples

booleanTwo = False

print booleanEx and booleanTwo
print booleanEx or booleanTwo
print not booleanTwo

# Number Examples

intOne = 7
intTwo = 99
floatOne = 7.9
floatTwo = 9.8

print intTwo / intOne # This should be 14.14
print float(intTwo) / float(intOne)
print int(floatOne)
print int(booleanTwo)

print intOne > intTwo
print intOne >= intTwo
print intOne < intTwo
print intOne <= intTwo
print intOne != intTwo
print intOne == intTwo

print intOne + intTwo
print intOne - intTwo
print intOne * intTwo
print intTwo % intOne
print intOne ** intTwo

print id(floatOne)

# Math Modules

print sqrt(intOne)

# Input from users

answer = raw_input("What is your name? ")
print "Hello " + answer

# String Basics

strOne = "Hello"
strTwo = "World"

print strOne, strTwo
print strOne + strTwo

longStr = "'This is a very long string that \
goes on forever and ever'"

print longStr

print longStr[0:3]

# \\     Backslash (\)
# \'     Single quote (')
# \"     Double quote (")
# \n     ASCII Linefeed