# ilc.markov
TP NOTE 4A ILC 2019

## Questions
- Fork this github repository
- Run the project
- Comment the 2 classes
- Complete the next section : functions to be tested
- Commit your changes (commit README.md)
- Make tests (call your test functions using the rule: GIVEN_WHEN_THEN) 
- Commit your changes
- On github, make a pull request 
- that ends

## Functions to be tested
Hereafter, for each classes give function to be tested 

### Classe Coulpe
#### functions
    -equals 

### Classe Markov
#### function
Functions to be tested : 
    -hashCodeEclipse() 
    - E randomElement : there is a condition if(n-- ==0 ) since we decrement n if would be good to test if n can be negative. ##Edit : there is no chance n is negative so testing is not necessary
    - randomElement : we don't want n to be negative, so we should test if it is positive. ##Edit n is never negative so this test is useless.
    - readFile
    



## Tricks & tips

- Never test auto generate code
- Never test creator (its a design problem)
- Use @Test before each testFunction !
- When you test a void function of the class Markov, then test the markov instance's state
> Markov m=new Markov();
> int actual = m.couples.size();
- You can test a function than throws an exception with the argument: expected
> @Test(expected=Exception.class)

