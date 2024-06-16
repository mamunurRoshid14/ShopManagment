package com.mamun.shopmanagment;

import com.mamun.shop.product.Product;
import java.io.*;

/**
 *
 * @author Mamunur Roshid
 */
public class ShopManagment {

    private static int totalProductCount = 0;
    
    private static Product productList[] = new Product[10];

    public static void addProductToList(Product product) {
        //productList[totalProductCount] = product;
        productList[0] = product;
        totalProductCount++;
    }

    public static void showProduct() {
        System.out.println("\n\nProduct Name : "+productList[0].getProductName());
        System.out.println("Product Model Number : "+productList[0].getModelNumber());
        System.out.println("Product ID : "+productList[0].getProductId());
        System.out.println("Available Unit : "+productList[0].getAvailableUnit());
    }
    
    public static void writeProductData() {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Final Project\\ShopManagment\\Product.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public static void readProductdata() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Asus\\Documents\\NetBeansProjects\\Final Project\\ShopManagment\\Product.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Product[] produuctsFromSavedFile = (Product[]) ois.readObject();
            ois.close();
            for (int i = 0; i < produuctsFromSavedFile.length; i++) {
                productList[totalProductCount] = produuctsFromSavedFile[i];
                totalProductCount++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
