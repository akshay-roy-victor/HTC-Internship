def is_mathematically_computable(equation):
    try:
        eval(equation)
        return True
    except:
        return False

equation1 = "2 + 3 * 5"
equation2 = "10 / (2 - 2)"
equation3 = "x + 5" 
equation4 = "0 / 0"

print(is_mathematically_computable(equation1))  
print(is_mathematically_computable(equation2))  
print(is_mathematically_computable(equation4))  
