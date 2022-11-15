## Exponent Calculator
The program that calculates the exponent based on the number of bases and exponents received from the user.

## Exponentiation Method
```java
    private static int exponentResultCalculator(int baseNumber, int exponentNumber){
        int result=1;
        if(exponentNumber==0){
        return result;
        }
        for(int i=1;i<=exponentNumber;i++){
        result*=baseNumber;
        }
        return result;
        }
```
## Sample Console Output
```
Enter base number : 5
Enter exponent number : 3
5 ^ 3 = 125
```
## Other Projects

Patika.dev Java 101 Camp
[Click](https://github.com/mcancankaya/java101) for other projects

My Patika.dev Profile :
https://app.patika.dev/mcancankaya