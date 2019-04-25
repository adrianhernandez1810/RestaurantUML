public class Runner {
    public static void main(String[] args){

        Ingredient cheese = new Ingredient("cheese", 3.50);
        Ingredient pasta = new Ingredient("pasta", 2);
        Ingredient chicken = new Ingredient("chicken", 5.25);
        Ingredient peppers = new Ingredient("peppers", 1.30);


        MenuItem special = new MenuItem("special", 80);
        MenuItem veggie = new MenuItem("veggie", 90);
        MenuItem plain = new MenuItem("plain", 85);
        Table table1 = new Table("t1");
        Table table2 = new Table("t2");


        special.addIngredient(cheese);
        special.addIngredient(pasta);
        special.addIngredient(chicken);
        veggie.addIngredient(cheese);
        veggie.addIngredient(pasta);
        veggie.addIngredient(peppers);
        plain.addIngredient(pasta);
        plain.addIngredient(peppers);
        table1.addItem(special);
        table1.addItem(special);
        table1.addItem(veggie);

        table2.addItem(veggie);
        table2.addItem(veggie);
        table2.addItem(veggie);
        table2.addItem(plain);
        table2.addItem(plain);

        System.out.println(table1.getTotalPrice());
        System.out.println(table2.toString());

    }
}
