package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Прайсы
*/

public class Solution {
/*    public static void main(String[] args) throws Exception {
        int maxId = 0;
        String productName = "";
        String price;
        String quantity;
        if (args.length == 0) {
            return;
        }
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String file = input.readLine();
        input.close();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            List<String> idList = new ArrayList<>();
            String line;
            while (reader.ready()) {
                line = reader.readLine();
                idList.add(line.substring(0, 8).trim());
            }
            if (idList.size() > 0) {
                maxId = Integer.parseInt(Collections.max(idList));
            }
        }
        if (args[0].equals("-c")) {
            int id = 0;
            if (maxId > id) {
                id = maxId;
            }
            for (int i = 1; i < args.length - 2; i++) {
                productName += args[i] + " ";
            }
            if (productName.length() > 30) {
                productName = productName.substring(0, 30).trim();
            }
            price = args[args.length - 2];
            if (price.length() > 8) {
                price = price.substring(0, 8).trim();
            }
            quantity = args[args.length - 1];
            if (quantity.length() > 4) {
                quantity = quantity.substring(0, 4).trim();
            }
            try (FileWriter writer = new FileWriter(file, true)) {
                String result = String.format("%-8d%-30s%-8s%-4s", ++id, productName, price, quantity);
                writer.write("\n");
                writer.write(result);
            }
        }
    }*//// мое решение хоть убей но не принимает
public static class Product {
    int id;
    String name;
    String price;
    String quantity;

    public Product(int id, String name, String price, String quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
    }
}

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            return;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        List<Product> products = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                Product product = getProduct(fileReader.readLine());
                products.add(product);
            }
        }

        switch (args[0]) {
            case "-c":
                int id = 0;
                for (Product product : products) {
                    if (product.id > id) id = product.id;
                }
                String name = "";
                for (int i = 1; i < args.length - 2; i++) {
                    name += args[i] + " ";
                }
                if (name.length() > 30) {
                    name = name.substring(0, 30);
                }
                String price = args[args.length - 2];
                if (price.length() > 8) {
                    price = price.substring(0, 8);
                }
                String quantity = args[args.length - 1];
                if (quantity.length() > 4) {
                    quantity = quantity.substring(0, 4);
                }
                Product product = new Product(++id, name.trim(), price, quantity);
                try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                    fileWriter.write("\n");
                    fileWriter.write(product.toString());
                }
        }
    }

    public static Product getProduct(String string) {
        String id = string.substring(0, 8).trim();
        String name = string.substring(8, 38).trim();
        String price = string.substring(38, 46).trim();
        String quantity = string.substring(46, 50).trim();
        return new Product(Integer.parseInt(id), name, price, quantity);
    }
}
//C:\Users\Тоха\Desktop\testjava.txt