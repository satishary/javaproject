
package oops;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Product {
    public static void main(String[] args) {
        Map<String,Integer>products= new HashMap<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Product Name");
    
        while(true){
            System.out.println("0-Exit,1-Add Product Name,2-Search By Brand,3-All Products,4-Remove Product");
            int n= Integer.parseInt(s.nextLine());
            switch (n){
                case 0:{
                    System.out.println("Exit");
                    return;
                }
                case 1:{
                    System.out.println("Enter product");
                    String pro=s.nextLine();
                   // Product name=new Product();
                    System.out.println("Enter price");
                    int price=Integer.parseInt(s.nextLine());
                    products.put(pro,price);
                   break;
                }
                case 2:{
                    System.out.println("Enter Brand");
                    String pro=s.nextLine();
                    if(products.containsKey(pro))
                    System.out.println(products.get(pro));
                    else
                        System.out.println("No such product ");
                    break;
                }
                case 3:{
                    System.out.println("All Products: "+"\n"+products);
                    break;
                  
                }
                case 4:{
                    System.out.println("Remove Product");
                    System.out.println("Enter Product Name");
                    String  rm=s.nextLine();
                    products.remove(rm);
                    break;
                }
                
            }
            
        }
    }
    
}
