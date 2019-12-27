#Jeremy Wood
#woodx552

def Sort(T):
    if len(T)==0:
        return T
    else:
        return Sort(Remove(T, Maximum(T))) + (Maximum(T),)
    


def Maximum(T):
    if len(T)==0:
        return T
    elif len(T)==1:
        return T[0]
    else:
        return Max(T[1:], T[0])



def Max(T, M):
    if T[0]>M:
        if len(T)==1:
            return T[0]
        else:
            return Max(T[1:], T[0])
    elif T[0]<M:
        if len(T)==1:
            return M
        else:
            return Max(T[1:], M)
    elif T[0]==M:
        if len(T)==1:
            return M
        else:
            return Max(T[1:], T[0])


def Remove(T, E):
    if len(T)==0:
        return T
    elif T[0]==E:
        return T[1:]
    elif T[0]!=E:
        return (T[0],) + Remove(T[1:], E)




#
#  TESTS. Tests for CSci 1913 Lab 3.
#
#    James Moen
#    04 Feb 18
#
#  Each test is worth 2 points, for 40 points total. Comments show what must be
#  printed to receive credit.
#

print(Maximum((1,)))                      #  1                            2 pt.
print(Maximum((1, 2)))                    #  2                            2 pt.
print(Maximum((1, 1)))                    #  1                            2 pt.
print(Maximum((1, 2, 3)))                 #  3                            2 pt.

print(Remove((), 1))                      #  ()                           2 pt.
print(Remove((1,), 1))                    #  ()                           2 pt.
print(Remove((0, 1), 0))                  #  (1,)                         2 pt.
print(Remove((0, 1, 2, 1, 3), 1))         #  (0, 2, 1, 3)                 2 pt.
print(Remove((0, 1, 2, 1, 3), 2))         #  (0, 1, 1, 3)                 2 pt.
print(Remove((1, 2, 3), 3))               #  (1, 2)                       2 pt.

print(Sort(()))                           #  ()                           2 pt.
print(Sort((0,)))                         #  (0,)                         2 pt.
print(Sort((0, 1)))                       #  (0, 1)                       2 pt.
print(Sort((1, 0)))                       #  (0, 1)                       2 pt.
print(Sort((0, 0, 1)))                    #  (0, 0, 1)                    2 pt.
print(Sort((0, 1, 0)))                    #  (0, 0, 1)                    2 pt.
print(Sort((0, 0, 1)))                    #  (0, 0, 1)                    2 pt.

print(Sort((9, 8, 7, 6, 5, 4, 3, 2, 1)))  #  (1, 2, 3, 4, 5, 6, 7, 8, 9)  2 pt.
print(Sort((1, 2, 3, 4, 5, 6, 7, 8, 9)))  #  (1, 2, 3, 4, 5, 6, 7, 8, 9)  2 pt.
print(Sort((1, 2, 1, 4, 2, 5, 4, 5, 3)))  #  (1, 1, 2, 2, 3, 4, 4, 5, 5)  2 pt.