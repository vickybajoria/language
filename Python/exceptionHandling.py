#! /usr/bin/python

import exceptions

class Dog:
	__secret = 2

def makingErrors():

	# Output a list of all the built in exceptions that trigger errors
	for i in dir(exceptions):
		print i

# How to raise an exception
# raise Exception(‘JustDisagreeable’)

# Raise an AttributeError exception
# Puppy = Dog()
# print Puppy.__secret

# Raise an IOError exception
# f = open(‘studentgrades.txt’)

# Raise an IndexError
# listEx = [1,2,3]
# print listEx[3]

# Raise a KeyError exception
#dictEx = ({“Age”:35, “Name”:’Derek’})
#print dictEx[“Age”]

# Raise a NameError exception
# print monkey

# Raise a SyntaxError exception
# print “Hello’

# Raise a TypeError exception
# print “Tomato” % 5

# Raise a ZeroDivisionError exception
# zeroDivisionErr = 1/0

# Stop a ZeroDivisionError exception
try:
zeroDivision = 1/0
except ZeroDivisionError:
print “You can’t divide by zero”

# Stop multiple exceptions
try:
zeroDivision = R/0
except (ZeroDivisionError,NameError), e:
print “You can only divide by non-zero numbers”
print e # Prints out the error message for the first exception caught

# Catch every exception
try:
zeroDivision = R/0
except:
print “You messed up”

# What happens if no exception is raised
try:
halfDivision = 1.0/2.0
except (ZeroDivisionError,NameError):
print ‘You messed something up’
else:
print halfDivision

# Use finally to always perform an action error or not
try:
halfDivision = 1.0/2.0
except (ZeroDivisionError,NameError):
print ‘You messed something up’
else:
print halfDivision
finally:
print “I always get to say something”

return

def main():
makingErrors()

if __name__ == ‘__main__’: main()