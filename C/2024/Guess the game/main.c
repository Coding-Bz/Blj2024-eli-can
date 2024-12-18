#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <conio.h>

int playGame() {
    char name[40];
    srand(time(0));
    int right=(rand()%10)+1;
    int currentGuess;
    char playAgain;


    printf("Hello, today we are going to play the game guess the number\n");
    printf("First of all, how should I call you?\n");
    scanf("%s", name);
    printf("Let's begin, %s!\n", name);

    do {


        do {
            printf("mGuess the number %s!\n", name );
            scanf("%i", &currentGuess);

            if (currentGuess > right) {
                printf("Too high!\n");
            } else if (currentGuess < right) {
                printf("Too low!\n");
            } else {
                printf("Perfect!\n");
            }
        } while (currentGuess != right);
        printf("Do you want to play again? (y/n): ");
        scanf(" %c", &playAgain);

    } while (playAgain == 'y' || playAgain == 'Y');

    return 0;
}

int main(void) {
    playGame();
    return 0;
}
