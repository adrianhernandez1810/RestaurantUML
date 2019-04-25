public class MenuItem {

    private Ingredient[] ingredients = new Ingredient[10];
    private String name;
    private int ingredientCount = 0;
    private int prepTime;

    public MenuItem(String name, int prepTime) {
        this.name = name;
        this.prepTime = prepTime;
    }

    public int getIngredientCount() {
        return ingredientCount;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredientCount(int ingredientCount) {
        this.ingredientCount = ingredientCount;
    }

    public int getPrepTime(){
         return prepTime;
     }

     public void setPrepTime(int prepTime){
        this.prepTime = prepTime;
    }

    public void addIngredient(Ingredient m){
        ingredients[ingredientCount] = m;
        ingredientCount++;
    }

    public double getItemPrice(){
        double total = 0;
        for(int i = 0; i < ingredientCount; i++){
            total += ingredients[i].getPrice();
        }
        return total;
    }

}
