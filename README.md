# Pmyn
* Pmyn - a python-like mini DSL.
* Pmyn originally was created to be a simple DSL. But soon, it became a scripting language like python.
* Pmyn uses [antlr](https://www.antlr.org/) to create lexer and parser.

# Getting started
## Datatypes
There are 4 datatypes in Pmyn:
1. Integers

   Integers are like: 1, 230, 444.

2. Decimals

   Decimals are like: 2.0, 4.0, 333.2.

3. Strings

   Strings are enclosed in double\-quotes or single-quotes. Examples: `"text 1"`, `"string 2"`, `'single-quoutes string'`.

4. Booleans

   Booleans can be one of `true` or `false`.

`None` in Python equals to `Nothing` in Pmyn.

## Variables
- Lists

   List is a sequence of variables, each element in List can be accessed by an index. Examples:
   ```
   years = [2010, 2011, 2012, 2013]
   second_year = years[1]
   # second_year = 2011
   ```
   >**Note**: Like many programming language, Lists in Pmyn start at index 0
   
- Objects

   An object is like dictionary in Python. The only way you can create an object is calling built-in function `object`. Example: 
   ```
   object("name", "Pmyn", "age", 1, "types", ["String", "Number", "Boolean"], "is_cool", true)
   #{
   #   "name": "Pmyn",
   #   "age": 1,
   #   "types": ["String", "Number", "Boolean"],
   #   "is_cool": true
   #}
   ```
   Objects can be nested in other object, example:
   ```
   conanDoyle = object("name", "Arthur Conan Doyle", "born", 1914)
   book = object("title", "Sherlock Holme", "author", conanDoyle)
   #{
   #   "title": "Sherlock Holme",
   #   "author": {
   #      "name": "Arthur Conan Doyle",
   #      "born": 1914
   #   }
   #}
   ```

## Functions
1. Built-in functions

   Pmyn is currently supports: `print`, `map`

2. User-defined functions

   You can create a function by following this template:
   ```
   def myFunction(num1, num2) {
       num3 = num1 + num2
       return num3
   }
   sum = myFunction(2, 5)
   # sum = 7 
   ```
   Note that function must have a `return` statement at the end even if you don't want to return anything.
   > **Warning**: function can only access variables inside function body. Therefore, refer to outside variable will definitely cause error while running.

## Operators
1. Arithmetic operators

   Arithmetic operators are only applied for Number. All arithmetic operators in Pmyn are: +, -, \* , /, %.

2. Logical operatos

   Logical operators are only applied for Boolean. All arithmetic operators in Pmyn are: `and`, `or`, `not`.
   >**Note**: Pmyn is case-sensetive so that `and` is an operator but `And` is not.

## Comments
Like Python comments in Pmyn started by character '#'. Examples:
```
# This is a comment
```

```
# This is a multiple
# lines comment
```
    
# Fun facts
1. Its name `Pmyn` is a combination of 2 words: **py**thon and **m**i**n**imum. I rearranged the characters a bit to make it pronounceable.
2. Pmyn's main goal is learning how to create a programming language, Pmyn shouldn't
