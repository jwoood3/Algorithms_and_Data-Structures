#Jeremy Wood
#woodx552


class Zillion:
  def __init__(self, digits):
    self.digits = digits

    self.a=[]
    for d in digits:
      if (d>='0' and d<='9'):
        self.a=self.a+[int(d)]
      elif (d==' ' or d==','):
        continue
      else:
        raise RuntimeError
    if (len(self.a)==0):
      raise RuntimeError
      

  def increment(self):
    for x in range(len(self.a)-1, -1,-1):
      if self.a[x]==9:
        if x == 0:
          self.a[x] = 0
          self.a=[1]+self.a
          break
        else:
          self.a[x] = 0
          continue
      else:
        self.a[x]=self.a[x]+1
        break


  def isZero(self):
    for x in range(0,len(self.a),1):
      if self.a[x]==0:
        if x==len(self.a)-1:
          return True
        continue
      else:
        return False

  def toString(self):
    self.b=''
    for x in range(0, len(self.a),1):
      self.b=self.b+str(self.a[x])
    return self.b





#
#  TESTS. Test the class Zillion for CSci 1913 Lab 2.
#
#    James Moen
#    18 Sep 17
#
#  Every test is followed by a comment which shows what must be printed if your
#  code works correctly. It also shows how many points the test is worth.
#

try:
  z = Zillion('')
except RuntimeError:
  print('Empty string')

# It must print 'Empty string' without apostrophes. 2 points.

try:
  z = Zillion(' , ')
except RuntimeError:
  print('No digits in the string')

# It must print 'No digits in the string' without apostrophes. 2 points.

try:
  z = Zillion('1+0')
except RuntimeError:
  print('Non-digit in the string')

# It must print 'Non-digit in the string' without apostrophes. 2 points.

try:
  z = Zillion('0')
except RuntimeError:
  print('This must not be printed')

#  It must print nothing. 2 points.

print(z.isZero())    #  It must print True. 2 points.

try:
  z = Zillion('000000000')
except RuntimeError:
  print('This must not be printed')

#  It must print nothing. 2 points.

print(z.isZero())    #  It must print True. 2 points.

try:
  z = Zillion('000 000 000')
except RuntimeError:
  print('This must not be printed')

#  It must print nothing. 2 points.

print(z.isZero())    #  It must print True. 2 points.

try:
  z = Zillion('997')
except RuntimeError:
  print('This must not be printed')

#  It must print nothing.  2 points.

print(z.isZero())    #  It must print False. 2 points.

print(z.toString())  #  It must print 997. 2 points.

z.increment()

print(z.toString())  #  It must print 998. 2 points.

z.increment()

print(z.toString())  #  It must print 999. 2 points.

z.increment()

print(z.toString())  #  It must print 1000. 2 points.

try:
  z = Zillion('0 9,9 9')
except:
  print('This must not be printed')

#  It must print nothing.  3 points.

z.increment()
print(z.toString())  #  It must print 1000. 2 points.






