## Random Class

Returns a random integer between [0, 10)
* ` (int)(Math.random() * 10) `

Returns a random integer between [50, 100)     
* ` 50 + (int)(Math.random() * 50) `

Returns a random integer between [a, a+b)
* ` a + Math.random() * b `

## Formulas

Note that the distance between two points (x1, y1) and (x2, y2) can be computed using the formula: </br>
* ` Math.sqrt((Math.pow(x2-x1,2) + Math.pow(y2-y1,2))) `          

## Character Class

* isDigit(ch) Returns true if the specified character is a digit.
* isLetter(ch) Returns true if the specified character is a letter.
* isLetterOfDigit(ch) Returns true if the specified character is a letter or digit.
* isLowerCase(ch) Returns true if the specified character is a lowercase letter.
* isUpperCase(ch) Returns true if the specified character is an uppercase letter.
* toLowerCase(ch) Returns the lowercase of the specified character.
* toUpperCase(ch) Returns the uppercase of the specified character.

* For example, the following code tests whether a character ch is an uppercase letter, a lowercase letter, or a digital character.

```
if (ch >= 'A' && ch <= 'Z')
	System.out.println(ch + " is an uppercase letter");
else if (ch >= 'a' && ch <= 'z')
	System.out.println(ch + " is a lowercase letter");
else if (ch >= '0' && ch <= '9')
	System.out.println(ch + " is a numeric character");
```

* Reading a Character from the Console:

To read a character from the console, use the nextLine() method to read a string and then
invoke the charAt(0) method on the string to return a character. For example, the following
code reads a character from the keyboard:

``` 
Scanner input = new Scanner(System.in);
System.out.print("Enter a character: ");
String s = input.nextLine();
char ch = s.charAt(0);
System.out.println("The character entered is " + ch);
```

## String Class

String is a predefined class in the Java library, just like the classes System and Scanner.
The String type is not a primitive type. It is known as a reference type. Any Java class can
be used as a reference type for a variable. The variable declared by a reference type is known
as a reference variable that references an object.

- Simple Methods for String Objects:

* length() Returns the number of characters in this string.
* charAt(index) Returns the character at the specified index from this string.
* concat(s1) Returns a new string that concatenates this string with string s1.
* toUpperCase() Returns a new string with all letters in uppercase.
* toLowerCase() Returns a new string with all letters in lowercase
* trim() Returns a new string with whitespace characters(' ', \t, \f, \r, or \n) trimmed on both sides.


Comparison Methods for String Objects:

* equals(s1) Returns true if this string is equal to string s1.
* equalsIgnoreCase(s1) Returns true if this string is equal to string s1; it is case insensitive.
* compareTo(s1) Returns an integer greater than 0, equal to 0, or less than 0 to indicate whether this string is greater than, equal to, or less than s1.
* compareToIgnoreCase(s1) Same as compareTo except that the comparison is case insensitive.
* startsWith(prefix) Returns true if this string starts with the specified prefix.
* endsWith(suffix) Returns true if this string ends with the specified suffix.
* contains(s1) Returns true if s1 is a substring in this string.


How do you compare the contents of two strings? You might attempt to use the == operator, as follows:

```
if (string1 == string2)
	System.out.println("string1 and string2 are the same object");
    else
	System.out.println("string1 and string2 are different objects");
```
	
However, the == operator checks only whether string1 and string2 refer to the same object; it does not tell you whether they have the same contents. 

Therefore, you cannot use the == operator to find out whether two string variables have the same contents. Instead, you should use the equals method. The following code, for instance, can be used to compare two strings:

```
if (string1.equals(string2))
	System.out.println("string1 and string2 have the same contents");
else
	System.out.println("string1 and string2 are not equal");
```

s1.compareTo(s2)

The actual value returned from the compareTo method depends on the offset of the first
two distinct characters in s1 and s2 from left to right. For example, suppose s1 is abc and s2
is abg, and s1.compareTo(s2) returns -4. The first two characters (a vs. a) from s1 and
s2 are compared. Because they are equal, the second two characters (b vs. b) are compared.
Because they are also equal, the third two characters (c vs. g) are compared. Since the character
c is 4 less than g, the comparison returns -4.

The String class contains the methods for obtaining substrings:

* substring(beginIndex) Returns this string’s substring that begins with the character at the specified beginIndex and extends to the end of the string.

* substring(beginIndex, endIndex) Returns this string’s substring that begins at the specified beginIndex and extends to the character at index endIndex – 1. Note that the character at endIndex is not part of the substring.
