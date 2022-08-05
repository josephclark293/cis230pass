def add(a,b):
    return a + b
def subtract(a,b):
    return a -b
def multiply(a,b):
    return a * b
def divide(a,b):
    return a /b

if __name__ == "__main__":
    print("Enter two numbers: ",end="")
    a = int(input())
    b = int(input())
    print("The sum is", add(a,b))
    print("The difference is", subtract(a,b))
    print("The product is", multiply(a,b))
    print("The quotient is", divide(a,b))
