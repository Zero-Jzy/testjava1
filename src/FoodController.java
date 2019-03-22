import entity.Food;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FoodController {
    private ArrayList<Food> foodArrayList = new ArrayList<>();

    public void addFood(){
        Scanner sc = new Scanner(System.in);
        Food food = new Food();
        System.out.println("Nhập vào mã món ăn:");
        food.setFoodId(sc.nextLine());
        System.out.println("Nhập vào tên món ăn:");
        food.setFoodName(sc.nextLine());
        System.out.println("Nhập vào mô tả món ăn:");
        food.setDescription(sc.nextLine());
        System.out.println("Nhập vào giá món ăn:");
        food.setPrice(sc.nextDouble());
        sc.nextLine();
        food.setCreateAt(new Date());
        foodArrayList.add(food);
    }

    public void printList(){
        for (Food food: foodArrayList){
            System.out.println(food.toString());
        }
    }

}
