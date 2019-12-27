#Jeremy Wood
#woodx552

import types

def op(c):
	return c[1]
def left(c):
	return c[0]
def right(c):
	return c[2]

def evaluate(c):
	if type(c) is int:
		return c
	elif op(c)=='+':
		return evaluateAdd(c)
	elif op(c)=='-':
		return evaluateSub(c)
	elif op(c)=='*':
		return evaluateMul(c)
	elif op(c)=='/':
		return evaluateDiv(c)
	else:
		return None

def evaluateAdd(c):
	return evaluate(left(c))+evaluate(right(c))
def evaluateSub(c):
	return evaluate(left(c))-evaluate(right(c))
def evaluateMul(c):
	return evaluate(left(c))*evaluate(right(c))
def evaluateDiv(c):
	return evaluate(left(c))/evaluate(right(c))


def isInside(v, e):
	if v == e:
		return True
	elif type(e) is tuple:
		if v == left(e):
			return True
		elif v == right(e):
			return True
		elif type(left(e)) is tuple:
			return isInside(v,left(e))
		elif type(right(e)) is tuple:
			return isInside(v,right(e))
		else:
			return False
	else:
		return False

def solve(v, q):
	if isInside(v, left(q)):
		return solving(v, q)
	elif isInside(v, right(q)):
		return solving(v, (right(q),op(q),left(q)))



def solving(v, q):
	if left(q)==v:
		return q
	elif op(left(q))=='+':
		return solvingAdd(v, q)
	elif op(left(q))=='-':
		return solvingSub(v, q)
	elif op(left(q))=='*':
		return solvingMul(v, q)
	elif op(left(q))=='/':
		return solvingDiv(v, q)

def solvingAdd(v, q):
	if isInside(v, left(left(q))):
		return solve(v, (left(left(q)), '=', (right(q), '-', right(left(q)))))
	elif isInside(v, right(left(q))):
		return solve(v, (right(left(q)), '=', (right(q), '-', left(left(q)))))
	

def solvingSub(v, q):
	if isInside(v, left(left(q))):
		return solve(v, (left(left(q)), '=', (right(q), '+', right(left(q)))))
	elif isInside(v, right(left(q))):
		return solve(v, (right(left(q)), '=', (right(q), '+', left(left(q)))))

def solvingMul(v, q):
	if isInside(v, left(left(q))):
		return solve(v, (left(left(q)), '=', (right(q), '/', right(left(q)))))
	elif isInside(v, right(left(q))):
		return solve(v, (right(left(q)), '=', (right(q), '/', left(left(q)))))

def solvingDiv(v, q):
	if isInside(v, left(left(q))):
		return solve(v, (left(left(q)), '=', (right(q), '*', right(left(q)))))
	elif isInside(v, right(left(q))):
		return solve(v, (right(left(q)), '=', (right(q), '*', left(left(q)))))








#
#  TESTS. Test the equation solver for CSci 1913 Lab 1.
#
#    James Moen
#    10 Sep 18
#
#  Every test is followed by a comment which shows what must be printed if your
#  code works correctly. It also shows how many points the test is worth, for a
#  total of 35 possible points.
#

print(isInside('x', 'x'))                          #  True   1 point
print(isInside('x', 'y'))                          #  False  1 point
print(isInside('x', ('x', '+', 'y')))              #  True   2 points
print(isInside('x', ('a', '+', 'b')))              #  False  2 points
print(isInside('+', ('a', '+', 'b')))              #  False  2 points
print(isInside('x', (('m', '*', 'x'), '+', 'b')))  #  True   2 points

print(solve('x', (('a', '+', 'x'), '=', 'c')))
#  ('x', '=', ('c', '-', 'a'))  2 points

print(solve('x', (('x', '+', 'b'), '=', 'c')))
#  ('x', '=', ('c', '-', 'b'))  2 points

print(solve('x', (('a', '-', 'x'), '=', 'c')))
#  ('x', '=', ('a', '-', 'c'))  2 points

print(solve('x', (('x', '-', 'b'), '=', 'c')))
#  ('x', '=', ('c', '+', 'b'))  2 points

print(solve('x', (('a', '*', 'x'), '=', 'c')))
#  ('x', '=', ('c', '/', 'a'))  2 points

print(solve('x', (('x', '*', 'b'), '=', 'c')))
#  ('x', '=', ('c', '/', 'b'))  2 points

print(solve('x', (('a', '/', 'x'), '=', 'c')))
#  ('x', '=', ('a', '/', 'c'))  2 points

print(solve('x', (('x', '/', 'b'), '=', 'c')))
#  ('x', '=', ('c', '*', 'b'))  2 points

print(solve('y', ('y', '=', (('m', '*', 'x'), '+', 'b'))))
# ('y', '=', (('m', '*', 'x'), '+', 'b'))  2 points

print(solve('x', ('y', '=', (('m', '*', 'x'), '+', 'b'))))
# ('x', '=', (('y', '-', 'b'), '/', 'm'))  2 points

print(solve('a', (('b', '+', 'c'), '=', ('d', '*', (('a', '/', 'e'), '-', 'f')))))
# ('a', '=', (((('b', '+', 'c'), '/', 'd'), '+', 'f'), '*', 'e'))  5 points