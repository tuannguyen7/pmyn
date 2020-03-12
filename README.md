# Pmyn
Pmyn - a python-like mini DSL.
Pmyn originally was created to be a simple DSL. But soon, it became a scripting language like python.
Pmyn uses [antlr](https://www.antlr.org/) to create lexer and parser.

# Getting started
## Datatypes
There are 3 datatypes in Pmyn:
1. Numbers
Numbers are all represented as float value in Pmyn.

2. Strings
Strings are enclosed in double\-quotes or single-quotes. Examples: `"text 1"`, `"string 2"`, `'single-quoutes string'`.

3. Booleans
Booleans can be one of `true` or `false`.

`None` in Python equals to `Nothing` in Pmyn.

## Variables
- Lists
List is a sequence of variables, each element in List can be accessed by an index. Examples:
   ```
   years = [2010, 2011, 2012, 2013]
   second_year = years[1]
   ```
   >**Note**: Like many programming language, Lists in Pmyn start at index 0
- Objects
An object is like dictionary in Python. The only way you can create an object is calling built-in function `object`. Example: 
   ```
   object("name", "Pmyn", "age", 1, "types", ["String", "Number", "Boolean", "object", "list"], "has")
   ```
   Objects can be nested in other objects, example:
   ```
   conanDoyle = object("name", "Arthur Conan Doyle", "born", 1914)
   book = object("title", "Sherlock Holme", "author", conanDoyle)
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
    ```
   Note that function must has a `return` statement at the end even you dont want to return anything.
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
