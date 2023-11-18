# def Proizv(data):
#     list_proiz = []
#     for i in data:
#         if i % 2 == 0:
#             list_proiz.append((i, i ** 2))
#     return list_proiz


# data = [1,2,3,5,8,15,23,38]

# print(Proizv(list))


def select(f, col):
    return[f(x) for x in col]

def where(f,col):
    return[x for x in col if f(x)]

data = [1,2,3,5,8,15,23,38]
res = select(int, data)
print(res)
res = where(lambda x: x % 2 == 0, res)
print(res)
res = list(select(lambda x: (x, x**2), res))
print(res)