#include <stdio.h>
#include "utils.h"
#include <stdlib.h>

#define FIELD_SIZE 4

void swapValues(int *num1, int *num2) {
    int temp = *num1;
    *num1 = *num2;
    *num2 = temp;
}

/**
 * This program depicts an all-time classic, the sliding puzzle. The one and
 * only 0 represents the empty slot in the sliding puzzle. Moves (sliding up,
 * down, left, right) are always made relative to the empty slot e.g. in the
 * case of the initial state of the field, only the moves left (swap 0 with 15)
 * and up (swap 0 with 8) can be made. This program doesn't detect whether the
 * field is sorted. It runs as long as the user doesn't enter a 0.
 *
 * @return 0 if the program was successfully run.
 */
int main(void) {
    int field[FIELD_SIZE][FIELD_SIZE] = {
        { 0, 15,  1, 13},
        { 8,  5,  2,  3},
        {14,  7,  4,  9},
        {10, 11,  6, 12},
    };
    int input, emptyX = 0, emptyY = 0;

    do {
        printField(FIELD_SIZE, field);
        printf("Enter a number to slide (0 to quit): ");
        scanf("%d", &input);

        if (input < 1 || input > FIELD_SIZE * FIELD_SIZE - 1) {
            printf("Invalid input\n");
            continue;
        }

        // Find the position of the input value
        int foundX = -1, foundY = -1;
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                if (field[i][j] == input) {
                    foundX = i;
                    foundY = j;
                }
            }
        }

        // Check if the position is adjacent to the empty slot
        if ((foundX == emptyX && abs(foundY - emptyY) == 1) ||
            (foundY == emptyY && abs(foundX - emptyX) == 1)) {
            swapValues(&field[emptyX][emptyY], &field[foundX][foundY]);
            emptyX = foundX;
            emptyY = foundY;
            } else {
                printf("Invalid move\n");
            }

    } while (input != 0);

    return 0;
}
