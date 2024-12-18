#include <stdio.h>
#include <string.h>
#include <stdlib.h>

typedef enum {
    Film,
    Game,
    Book
} TImportant;

typedef struct Information {
    TImportant important;
    char title[50];
    char author[50];
    int year;
} TInformation;

TInformation media[20];

void initmedia(void) {
    strcpy(media[0].title, "KeineAhnung");
    strcpy(media[0].author, "Goethe");
    media[0].year = 1981;
    media[0].important = Game;

    strcpy(media[1].title, "KeineAhnung1");
    strcpy(media[1].author, "Schiller");
    media[1].year = 1995;
    media[1].important = Book;

    strcpy(media[2].title, "KeineAhnung2");
    strcpy(media[2].author, "Stefan Zweig");
    media[2].year = 1995;
    media[2].important = Film;

    strcpy(media[3].title, "KeineAhnung3");
    strcpy(media[3].author, "Franz Kafka");
    media[3].year = 1995;
    media[3].important = Book;



    strcpy(media[4].title, "KeineAhnung");
    strcpy(media[4].author, "Goethe");
    media[4].year = 1981;
    media[4].important = Game;

    strcpy(media[5].title, "KeineAhnung1");
    strcpy(media[5].author, "Schiller");
    media[5].year = 1995;
    media[5].important = Book;

    strcpy(media[6].title, "KeineAhnung2");
    strcpy(media[6].author, "Stefan Zweig");
    media[6].year = 1995;
    media[6].important = Film;

    strcpy(media[7].title, "KeineAhnung3");
    strcpy(media[7].author, "Franz Kafka");
    media[7].year = 1995;
    media[7].important = Book;



    strcpy(media[8].title, "KeineAhnung");
    strcpy(media[8].author, "Goethe");
    media[8].year = 1981;
    media[8].important = Game;

    strcpy(media[9].title, "KeineAhnung1");
    strcpy(media[9].author, "Schiller");
    media[9].year = 1995;
    media[9].important = Book;

    strcpy(media[10].title, "KeineAhnung2");
    strcpy(media[10].author, "Stefan Zweig");
    media[10].year = 1995;
    media[10].important = Film;

    strcpy(media[11].title, "KeineAhnung3");
    strcpy(media[11].author, "Franz Kafka");
    media[11].year = 1995;
    media[11].important = Book;


    strcpy(media[12].title, "KeineAhnung");
    strcpy(media[12].author, "Goethe");
    media[12].year = 1981;
    media[12].important = Game;

    strcpy(media[13].title, "KeineAhnung1");
    strcpy(media[13].author, "Schiller");
    media[13].year = 1995;
    media[13].important = Book;

    strcpy(media[14].title, "KeineAhnung2");
    strcpy(media[14].author, "Stefan Zweig");
    media[14].year = 1995;
    media[14].important = Film;

    strcpy(media[15].title, "KeineAhnung3");
    strcpy(media[15].author, "Franz Kafka");
    media[15].year = 1995;
    media[15].important = Book;


    strcpy(media[16].title, "KeineAhnung");
    strcpy(media[16].author, "Goethe");
    media[16].year = 1981;
    media[16].important = Game;

    strcpy(media[17].title, "KeineAhnung1");
    strcpy(media[17].author, "Schiller");
    media[17].year = 1995;
    media[17].important = Book;

    strcpy(media[18].title, "KeineAhnung2");
    strcpy(media[18].author, "Stefan Zweig");
    media[18].year = 1995;
    media[18].important = Film;

    strcpy(media[19].title, "KeineAhnung3");
    strcpy(media[19].author, "Franz Kafka");
    media[19].year = 1995;
    media[19].important = Book;

}

void printPerson(TInformation person) {
    printf("Title: %s\n", person.title);
    printf("Author: %s\n", person.author);
    printf("Year: %d\n", person.year);


    switch (person.important) {
        case Book:
            printf("Type: Book\n");
        break;
        case Game:
            printf("Type: Game\n");
        break;
        case Film:
            printf("Type: Film\n");
        break;
        default:
            printf("Type: Unknown\n");
        break;
    }

    printf("\n");
}

int main(void) {
    initmedia();  // Initialisiert die media-Daten
int *ptr;

    ptr = (int*)malloc(20* sizeof(int));
    if (ptr == NULL) {
        printf("Memory not allocated.\n");
        exit(0);
    } else {
        printf("Memory successfully allocated using malloc.\n");

        // Free the memory
        free(ptr);
        printf("Malloc memory successfully freed.\n");
    }


    // Schleife zur Ausgabe aller nicht leeren Einträge in media
    for (int i = 0; i < 19; i++) {
        if (strlen(media[i].title) > 0) { // Überprüfen, ob der Eintrag gültig ist
            printPerson(media[i]);
        }


    }

    return 0;
}
