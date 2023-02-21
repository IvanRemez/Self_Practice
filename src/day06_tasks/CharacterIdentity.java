package day06_tasks;

public class CharacterIdentity {

    public static void main(String[] args) {

        char character = 'Y';

        boolean alphabeticCharacter = character >= 65 && character <= 90 || character <= 97 && character >= 122;
        boolean digit = character >= 48 && character <= 57;
        boolean specialCharacter = !alphabeticCharacter && !digit;

        if (alphabeticCharacter){
            System.out.println("Alphabetical Character");
        }
        if (digit){
            System.out.println("Digit");
        }
        if (specialCharacter){
            System.out.println("Special Character");
        }
    }
}

/*
5. Create a class named CharacterIdentity, and write a program
that can identify if the given character is a digit or
Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the characters on ASCII table
 */