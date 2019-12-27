
#Jeremy Wood
#woodx552
#
#  CHOOSERS. How to choose letters for random words.
#
#    James B. Moen
#    30 Sep 18
#

#  CHOOSERS. A dictionary of choosers that tell how to pick letters in a random
#  word. Read the CSci 1913 Project 1 assignment to find out how this works.

choosers = \
  { ' ': ( 586447, 
           'a',  69934, 'b',  25416, 'c',  21677, 'd',  17586, 'e',  12125,
           'f',  21547, 'g',  10051, 'h',  50014, 'i',  31198, 'j',   1663,
           'k',   4421, 'l',  14727, 'm',  19833, 'n',  17135, 'o',  34249,
           'p',  19043, 'q',   1429, 'r',  15867, 's',  47746, 't',  90094,
           'u',   5680, 'v',   5748, 'w',  40917, 'x',    451, 'y',   7123,
           'z',    773 ),
    'a': ( 202717,
           ' ',  15488, 'a',      7, 'b',   3458, 'c',   7014, 'd',  11259,
           'e',     69, 'f',   1671, 'g',   3375, 'h',    314, 'i',   8728,
           'j',    168, 'k',   2534, 'l',  14216, 'm',   4599, 'n',  45440,
           'o',     42, 'p',   4630, 'q',      2, 'r',  17676, 's',  19513,
           't',  27982, 'u',   2511, 'v',   4268, 'w',   2151, 'x',     51,
           'y',   5205, 'z',    346 ),
    'b': ( 34658,
           ' ',    282, 'a',   3189, 'b',    229, 'c',      3, 'd',     16,
           'e',  11355, 'h',      1, 'i',   1005, 'j',    175, 'l',   3635,
           'm',     69, 'n',      9, 'o',   4088, 'r',   1978, 's',    476,
           't',    257, 'u',   5275, 'v',     46, 'w',     20, 'y',   2550 ),
    'c': ( 61622,
           ' ',    642, 'a',   6721, 'c',   1049, 'd',      9, 'e',  13129,
           'h',  11607, 'i',   2574, 'k',   2624, 'l',   2004, 'm',      2,
           'o',  12830, 'q',    117, 'r',   2071, 's',     96, 't',   4134,
           'u',   1691, 'w',      7, 'y',    310, 'z',      5 ),
    'd': ( 118298,
           ' ',  76800, 'a',   2440, 'b',     12, 'c',     10, 'd',   1304,
           'e',  13742, 'f',     85, 'g',    435, 'h',     50, 'i',   7795,
           'j',    236, 'k',     69, 'l',   1239, 'm',    314, 'n',    290,
           'o',   4935, 'p',      4, 'q',     45, 'r',   3576, 's',   2227,
           't',     47, 'u',   1100, 'v',    320, 'w',     44, 'y',   1177,
           'z',      2 ),
    'e': ( 313575,
           ' ', 112596, 'a',  13336, 'b',    253, 'c',   5370, 'd',  28598,
           'e',   7949, 'f',   3165, 'g',   2143, 'h',    714, 'i',   3467,
           'j',     85, 'k',    268, 'l',  10160, 'm',   7103, 'n',  26199,
           'o',   1613, 'p',   3426, 'q',    255, 'r',  44054, 's',  19609,
           't',   7394, 'u',    311, 'v',   5303, 'w',   3184, 'x',   3133,
           'y',   3717, 'z',    170 ),
    'f': ( 54901,
           ' ',  19688, 'a',   3854, 'b',     27, 'e',   4580, 'f',   2835,
           'h',      3, 'i',   4669, 'k',      7, 'l',   1209, 'm',      2,
           'n',      5, 'o',   8089, 'r',   5660, 's',    149, 't',   2150,
           'u',   1862, 'w',     27, 'y',     85 ),
    'g': ( 51327,
           ' ',  22464, 'a',   3359, 'b',      1, 'd',     42, 'e',   5830,
           'g',    445, 'h',   5956, 'i',   2495, 'l',   1479, 'm',     18,
           'n',    926, 'o',   3085, 'r',   2742, 's',    862, 't',    170,
           'u',   1338, 'w',     18, 'y',     95, 'z',      2 ),
    'h': ( 167415,
           ' ',  16422, 'a',  27451, 'b',     62, 'c',     62, 'd',     60,
           'e',  74877, 'f',     68, 'g',      1, 'h',      6, 'i',  25823,
           'k',     95, 'l',    150, 'm',    377, 'n',    116, 'o',  13681,
           'p',      4, 'r',   1282, 's',    157, 't',   4195, 'u',   1593,
           'v',      4, 'w',     36, 'y',    893 ),
    'i': ( 172257,
           ' ',   6096, 'a',   2909, 'b',   1273, 'c',   8518, 'd',   8648,
           'e',   8442, 'f',   3745, 'g',   4294, 'h',      6, 'i',    460,
           'k',   1198, 'l',   7923, 'm',   9814, 'n',  48156, 'o',   7275,
           'p',    833, 'q',     27, 'r',   5915, 's',  21118, 't',  21135,
           'u',    130, 'v',   3437, 'w',      4, 'x',    324, 'y',      1,
           'z',    576 ),
    'j': ( 2574,
           ' ',      4, 'a',     96, 'e',    564, 'i',     11, 'o',    716,
           'u',   1183 ),
    'k': ( 20432,
           ' ',   5589, 'a',    503, 'b',      7, 'c',     47, 'd',      3,
           'e',   5654, 'f',     13, 'g',     12, 'h',    817, 'i',   3385,
           'l',    339, 'm',     29, 'n',   2071, 'o',    255, 'p',      1,
           'r',     95, 's',    747, 't',      5, 'u',    666, 'v',     12,
           'w',     82, 'y',    100 ),
    'l': ( 96532,
           ' ',  13841, 'a',   7590, 'b',     71, 'c',     70, 'd',   6912,
           'e',  16760, 'f',   2303, 'g',     86, 'h',      4, 'i',   9411,
           'k',   1036, 'l',  13209, 'm',    392, 'n',    122, 'o',   8290,
           'p',    380, 'q',      1, 'r',    463, 's',   1555, 't',   1641,
           'u',   1478, 'v',    423, 'w',    467, 'y',  10002, 'z',     25 ),
    'm': ( 61649,
           ' ',  13202, 'a',   9255, 'b',   1086, 'c',     36, 'e',  15100,
           'f',    133, 'g',      1, 'i',   4822, 'k',      6, 'l',    162,
           'm',   1383, 'n',    227, 'o',   6641, 'p',   3430, 'r',     81,
           's',   1918, 't',     59, 'u',   1645, 'w',      6, 'y',   2456 ),
    'n': ( 184184,
           ' ',  43375, 'a',   5502, 'b',    151, 'c',   9102, 'd',  34575,
           'e',  14823, 'f',    912, 'g',  24993, 'h',    143, 'i',   5677,
           'j',    120, 'k',   1492, 'l',   2104, 'm',    138, 'n',   1949,
           'o',  12561, 'p',     95, 'q',    243, 'r',     74, 's',   6173,
           't',  15994, 'u',    955, 'v',    753, 'w',    106, 'x',     82,
           'y',   2070, 'z',     22 ),
    'o': ( 190083,
           ' ',  26991, 'a',   1379, 'b',    890, 'c',   1376, 'd',   3050,
           'e',    500, 'f',  16917, 'g',    770, 'h',    360, 'i',   2233,
           'j',    121, 'k',   3371, 'l',   7364, 'm',  11064, 'n',  26778,
           'o',   7196, 'p',   3053, 'q',     25, 'r',  19747, 's',   6745,
           't',  10011, 'u',  23548, 'v',   5734, 'w',   9910, 'x',    141,
           'y',    696, 'z',    113 ),
    'p': ( 45533,
           ' ',   3817, 'a',   4407, 'b',     11, 'c',    127, 'd',      2,
           'e',   8191, 'f',    100, 'g',      9, 'h',    415, 'i',   4202,
           'k',     18, 'l',   4221, 'm',     27, 'n',      8, 'o',   4744,
           'p',   2625, 'r',   7855, 's',   1073, 't',   2167, 'u',   1164,
           'w',     19, 'y',    331 ),
    'q': ( 2331,
           ' ',      2, 'u',   2329 ),
    'r': ( 148431,
           ' ',  33554, 'a',   8039, 'b',    213, 'c',   1468, 'd',   4353,
           'e',  35520, 'f',    448, 'g',   1396, 'h',    211, 'i',  13013,
           'j',      2, 'k',    922, 'l',   1259, 'm',   2928, 'n',   2560,
           'o',  14694, 'p',    544, 'q',     13, 'r',   4926, 's',   8073,
           't',   4600, 'u',   2894, 'v',    705, 'w',    277, 'y',   5737,
           'z',     82 ),
    's': ( 162897,
           ' ',  64012, 'a',   8388, 'b',    425, 'c',   2227, 'd',     63,
           'e',  17542, 'f',    300, 'g',     44, 'h',  10842, 'i',   9071,
           'j',      3, 'k',   2154, 'l',   1201, 'm',   1686, 'n',    439,
           'o',   8548, 'p',   3239, 'q',    169, 'r',     25, 's',   9685,
           't',  17764, 'u',   3946, 'v',     79, 'w',    669, 'y',    372,
           'z',      4 ),
    't': ( 226414,
           ' ',  62632, 'a',   7578, 'b',     15, 'c',    634, 'd',      3,
           'e',  19115, 'f',    186, 'g',      9, 'h',  73760, 'i',  13903,
           'k',     10, 'l',   2998, 'm',    274, 'n',    178, 'o',  23720,
           'p',     43, 'r',   5652, 's',   3902, 't',   4386, 'u',   2965,
           'v',     17, 'w',   1163, 'x',      1, 'y',   3133, 'z',    137 ),
    'u': ( 64399,
           ' ',   4072, 'a',   1323, 'b',    903, 'c',   2048, 'd',   1411,
           'e',   1893, 'f',    331, 'g',   3251, 'h',     42, 'i',   1750,
           'j',      1, 'k',     96, 'l',   6271, 'm',   1366, 'n',   8763,
           'o',    148, 'p',   2775, 'q',      1, 'r',   7994, 's',   8787,
           't',  10954, 'v',     80, 'w',      2, 'x',     43, 'y',     20,
           'z',     74 ),
    'v': ( 27087,
           ' ',   3482, 'a',   1691, 'e',  14498, 'g',      3, 'i',   4715,
           'k',      8, 'l',    215, 'n',    532, 'o',   1466, 'r',     87,
           's',    261, 't',      2, 'u',     20, 'v',      1, 'w',      1,
           'y',    105 ),
    'w': ( 59209,
           ' ',   8490, 'a',  12163, 'b',      6, 'c',     16, 'd',    367,
           'e',   7758, 'f',     44, 'h',  11925, 'i',  10020, 'k',     63,
           'l',    199, 'm',      2, 'n',   2222, 'o',   4595, 'p',      1,
           'r',    528, 's',    728, 't',      7, 'u',     19, 'w',     17,
           'y',     39 ),
    'x': ( 4384,
           ' ',    432, 'a',    337, 'c',    601, 'e',    270, 'h',     59,
           'i',    513, 'l',      2, 'o',      5, 'p',   1355, 'q',      4,
           't',    471, 'u',     17, 'v',    156, 'x',    158, 'y',      4 ),
    'y': ( 46235,
           ' ',  32186, 'a',   1167, 'b',    149, 'c',    167, 'd',     10,
           'e',   2560, 'f',     98, 'g',      9, 'h',     12, 'i',   1075,
           'k',     36, 'l',    202, 'm',    166, 'n',     42, 'o',   5986,
           'p',     52, 'r',     83, 's',   1295, 't',    795, 'u',     53,
           'v',      1, 'w',     81, 'z',     10 ),
    'z': ( 2388,
           ' ',    288, 'a',     99, 'd',     27, 'e',    729, 'h',    154,
           'i',    242, 'k',      4, 'l',     44, 'm',     63, 'n',     17,
           'o',    631, 's',      2, 'u',     26, 'w',      1, 'y',     14,
           'z',     47 ) }





class Random():
    def __init__(self, seed):
        self.N=seed  #initializes an instance of random
    def next(self):
        self.N=(16807*self.N)%(2147483647)  #Generates the next random integer
        return self.N
    def choose(self, max):
        return self.next()%max  #generates a random integer in between 0 and max using next

class Mumble():
    def __init__(self, seed, choosers):
        self.choosers = choosers
        self.R=Random(seed)  #Creates a "random" integer based on the given seed

    def make(self, max):
        word = ''  #Variable to store each letter that is chosen to create the word
        lastletter = ' '   #Variable to store the previous letter that was chosen
        if max <= 0:
            raise RuntimeError('Max is less than 0')  #Error being raised to ensure that max is greater than 0
        while max > 0: #Runs as long as the length of the word is less than max
            X=self.choosers[lastletter]  #Variable that uses the last letter chosen to get that letter in the choosers dictionary
            Q = self.R.choose(X[0])  #Variable that uses X and R to pick a random number between 0 and the maximum value for the given letter in choosers
            I = 2
            while Q > 0:  #Runs as long as the next letter has not been chosen 
                Q=Q-X[I]  #Set the new value of Q to whatever it was before minus the number associated with the current letter
                if Q <=0:  #The next letter in the word is chosen when Q is >= 0
                    if X[I-1] == ' ': #If a space is chosen, return the word that has been created so far, since words cannot have spaces
                        return word
                    word=word + X[I-1]  #Add the chosen letter to word
                    lastletter = X[I-1]  #Change lastletter to the chosen letter
                I+=2
            max-=1
        return word
                
    def test(self, count, min, max):
        if min < 1 and min > max:
            raise RuntimeError('min must be >=1 and <= max')  #Error raised so that min can't be less than 1 and min can't be greater than max
        Y=0
        while Y < count:  
            P = self.make(max)  #Calls make to create a word
            if len(P)<min:  #If the length of the word is under the minimum, do nothing (don't print the word), and don't increment Y, so that there will still be count words
                pass
            else:
                print(P)
                Y+=1
