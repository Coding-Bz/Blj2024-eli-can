#include <stdio.h>

int main() {


    printf("<table>\n"); //Hier wird das Wort table geprintet


    for (int i = 0; i < 4; i++) { //4 Reihen
        //der user bestimmt das
        printf("  <tr>\n");  // tablerow tabellenzeile

        // Zweite Schleife für die Spalten
        for (int j = 0; j < 5; j++) { //5 Spalten
            printf("    <td>%d</td>\n", j + 1); // Spalteninhalt ausgeben
        }

        printf("  </tr>\n"); // Zeile beenden
    }

    // HTML-Endtag ausgeben
    printf("</table>\n");

    return 0;
}
