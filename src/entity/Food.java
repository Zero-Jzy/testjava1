package entity;

import java.util.Date;

public class Food {
    private String foodId;
    private String foodName;
    private String description;
    private double price;
    private Date createAt;

    @Override
    public String toString() {
        return  String.format("Food{foodId= %s | foodName= %s | description= %s | price= %f | createAt= %s",
                foodId, foodName, description, price, createAt);
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
