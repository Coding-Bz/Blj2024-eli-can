public class UniqueProducts {

    private Product[] myList = new Product[10];
    private int Size;

    public UniqueProducts() {
    }

    public Product[] add(Product sp) {
        System.out.println("---Adding a Product---");
        System.out.println();
        boolean controll = false;
        for (int z = 0; z < myList.length; z++) {
            if (myList[z] != null && myList[z].getName().equalsIgnoreCase(sp.getName())) {
                controll = true;
            }
        }
        if (controll) {
            System.out.println("This product already exists in the list");
            return null;
        }

        if (myList[0] == null) {
            myList[0] = sp;
            System.out.println("Product: " + sp.getName() + " Price: " + sp.getPrice() + " was added.");
            return myList;
        } else {
            int check = -1;
            for (int b = 0; b < myList.length; b++) {
                if (myList[b] == null) {
                    check = b;
                    break;
                }
            }
            if (check == -1) {
                System.out.println("List is full.");
                return null;
            }
            myList[check] = sp;
        }

        System.out.println("Product: " + sp.getName() + " Price: " + sp.getPrice() + " was added.");
        Sorting(myList);
        return myList;
    }

    public void getTopPlayers(int count) {
        System.out.println("---Get Top Products---");
        System.out.println();
        int printed = 0;
        for (int b = 0; b < myList.length && printed < count; b++) {
            if (myList[b] != null) {
                System.out.println("Product name: " + myList[b].getName() + " Price: " + myList[b].getPrice());
                printed++;
            }
        }
    }

    public void getPlayerRank(String name) {
        System.out.println("---Get Product Rank---");
        System.out.println();
        for (int z = 0; z < myList.length; z++) {
            if (myList[z] != null && myList[z].getName().equalsIgnoreCase(name)) {
                System.out.println("Your product is ranked at position: " + (z + 1));
            }
        }
    }

    public Product[] Sorting(Product[] myList) {
        int validLength = 0;
        for (Product p : myList) {
            if (p != null) validLength++;
        }

        for (int i = 0; i < validLength; i++) {
            int check = i;
            for (int j = i + 1; j < validLength; j++) {
                double niveauJ = myList[j].getPrice();
                double niveauChcek = myList[check].getPrice();
                if (niveauJ < niveauChcek) {
                    check = j;
                }
            }
            Object tempNiveau = myList[i].getPrice();
            Object tempNmae = myList[i].getName();
            myList[i].setPrice(myList[check].getPrice());
            myList[i].setName(myList[check].getName());
            myList[check].setPrice((Double) tempNiveau);
            myList[check].setName((String) tempNmae);
        }

        return myList;
    }

    public void getHighestPrice() {
        System.out.println("---Highest Priced Product---");
        System.out.println();
        Product highest = null;
        for (Product p : myList) {
            if (p != null) {
                if (highest == null || p.getPrice() > highest.getPrice()) {
                    highest = p;
                }
            }
        }
        if (highest != null) {
            System.out.println("The priciest product costs: " + highest.getPrice() + " Name: " + highest.getName());
        } else {
            System.out.println("No products in the list.");
        }
    }

    public void getCheapestPrice() {
        System.out.println("---Cheapest Priced Product---");
        System.out.println();
        Product cheapest = null;
        for (Product p : myList) {
            if (p != null) {
                if (cheapest == null || p.getPrice() < cheapest.getPrice()) {
                    cheapest = p;
                }
            }
        }
        if (cheapest != null) {
            System.out.println("The cheapest product costs: " + cheapest.getPrice() + " Name: " + cheapest.getName());
        } else {
            System.out.println("No products in the list.");
        }
    }
}
