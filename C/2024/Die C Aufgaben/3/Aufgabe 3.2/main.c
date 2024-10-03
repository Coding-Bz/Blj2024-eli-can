#include <stdbool.h>
#include <stdio.h>


int main(void)
{
    char firstletter = 'n';
    int age = 12;
    _Bool b = true;



    printf("Buchstabe: %c, Alter: %d\n", firstletter, age);
    printf("Groesse von char: %c byte(s)\n", sizeof(char));
    printf("Groesse von int: %d\n", sizeof(int));

    return 9;
}

//1. Damit der Speicher angezeigt wird
//2. include stdio
//3.Kommt auf den Datentyp darauf an %d intiger float f%  char c%
_