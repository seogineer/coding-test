import sys
from enum import Enum
class StringType(Enum):
  LOWERCASE = 0
  UPPERCASE = 1
  NUMBER = 2
  SPACE = 3

while True:
  frequency = [0, 0, 0, 0]
  input = sys.stdin.readline().rstrip('\n')
  
  if not input:
    break
  
  for i in input:
    if 'a' <= i <= 'z':
      frequency[StringType.LOWERCASE.value] += 1
    if 'A' <= i <= 'Z':
      frequency[StringType.UPPERCASE.value] += 1
    if '0' <= i <= '9':
      frequency[StringType.NUMBER.value] += 1
    if i == ' ':
      frequency[StringType.SPACE.value] += 1

  print(' '.join(map(str, frequency)))