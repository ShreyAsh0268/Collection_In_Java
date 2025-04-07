package exception;
import java.util.*;
/*
 * Q2. ProductOufOfStockException
Description: Suppose  consider we are working on InventoryControl Application and we have one module name
 as StockManagment and we want to store product count in stack if product is less than 0 then system should 
 generate run time exception to us name as ProductOutOfStockException


 */
class ProductOufOfStockException extends Exception{

	public ProductOufOfStockException(String message) {
		super(message);
	}	
}

class StockValidator{
	int ordervalue;
	static Stack productStack = new Stack();
	
	public static void addProduct(int quantity){
        
        productStack.push(quantity);
    }
	
	public int removeProduct() throws ProductOufOfStockException {
        if (productStack.isEmpty()) {
            throw new ProductOufOfStockException("No products available in stock.");
        }
        return (int) productStack.pop();
    }
	
	public void viewStock() {
        System.out.println("Current Stock: " + productStack);
    }
}

public class Q2_ProductOufOfStockException {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StockValidator sv = new StockValidator();
		int choice=0;
        do {
        	System.out.println("1. add product \n 2. remove product \n 3.View Stock \n enter your choice");
        	choice=s.nextInt();
        	switch(choice) {
        	case 1:
        		
        			System.out.println("Enter product name for add");
        			int value = s.nextInt();
                    sv.addProduct(value);
                break;
        	case 2:
        		try {
                    sv.removeProduct();
                 
                } catch (ProductOufOfStockException e) {
                    System.out.println("Exception: " + e.getMessage());
                    choice=0;
                }
        		break;
        	case 3:
        		sv.viewStock();
        		break;
        	}
        }while(choice!=0);

	}

}
