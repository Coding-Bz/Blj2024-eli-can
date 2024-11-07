#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int x;
    struct Node* next;
} TNode;

void display(TNode *head);
TNode *createNode(int data);
void append(TNode *head, int data);
void delete(TNode *head, int data);

int main(int argc, char* argv[]) {
    printf("create linked list\n");
    TNode *root = createNode(10);
    display(root);

    printf("\nbefore append\n");
    append(root, 12);
    append(root, 1);
    delete(root, 4);
    append(root, 4);
    append(root, 8);
    display(root);

/*
    if (root->x  != NULL) {
        printf("Erfolg!");
    }
    else {printf("Fehlgeschlagen");}
    // Speicher in der richtigen Reihenfolge freigeben zuerst den letzten damit Infos nicht verschwinden
    free(root->next->next);
    free(root->next);
    // Bestätigung der Speicherfreigabe
    if (root->next== NULL) {
        printf("Speicher erfolgreich freigegeben!\n");
    } else {
        printf("Speicherfreigabe fehlgeschlagen.\n");
    }*/

    return 0;
}

void display(TNode *head) {  //zeigt alle elemente in der liste an
    TNode *p_cursor = head;
    while (p_cursor!= NULL) {
        printf("data: %d, next: %p\n", p_cursor->x, p_cursor->next);
        p_cursor=p_cursor->next;
    }
}

TNode *createNode(int data) {        //erstellt einen einen neuen knoten
    TNode *newNode = malloc(sizeof(TNode));
    newNode->x = data;
    newNode->next = NULL;
    return newNode;
}

void append(TNode *head, int data ) { //fügt ein neies elemt der liste hinzu
    TNode *p_cursor = head;
    while (p_cursor->next != NULL) {
        p_cursor=p_cursor->next;
    }
    p_cursor->next = createNode(data);
}



void delete(TNode *head, int data){
    TNode *newNode = malloc(sizeof(TNode));
    free( newNode->next);
    newNode->x = data;

 }
