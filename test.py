import numpy as np
b = np.array([1.1, 2.2, 3.3, -4.5, -2, 0])

a = (b > 0).astype('int')
print(a)