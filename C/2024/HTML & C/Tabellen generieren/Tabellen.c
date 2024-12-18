#include <stdio.h>

int main() {

    int num;
    printf("Gib die Spaltenanzahl an");
    scanf("%d", &num);
    int sum;
    printf("Gib die Reihenanzahl an");
    scanf("%d", &sum);
    printf("<table>\n"); //Hier wird das Wort table geprintet


    for (int i = 0; i < num; i++) { // num Reihen der User bestimmt die Anzahl
        //der user bestimmt das
        printf("  <tr>\n");  // tablerow tabellenzeile

        // Zweite Schleife für die Spalten
        for (int j = 0; j < sum; j++) { //sum Spalten der User bestimmt die Anzahl
            printf("    <td>%d</td>\n", j + 1); // Spalteninhalt ausgeben
        }

        printf("  </tr>\n"); // Zeile beenden
    }

    // HTML-Endtag ausgeben
    printf("</table>\n");

    return 0; //Prozess beenden
}
