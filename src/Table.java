public class Table {

    private String name;
    private MenuItem[] order = new MenuItem[10];
    private int itemCount = 0;


    public Table(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getItemCount(){
        return itemCount;
    }

    public MenuItem[] getItem() {
        return order;
    }

    public void setItemCount(int itemCount){
        this.itemCount = itemCount;
    }

    public void addItem(MenuItem m){
        order[itemCount] = m;
        itemCount++;
    }

    public double getTotalPrice(){
        double total = 0;
        for(int i = 0; i < itemCount; i++){
            total += order[i].getItemPrice();
        }
        return total;
    }

    public int determinePrepTime(){
        int time = 0;
        for(int i=0; i < itemCount; i++){
            if(order[i].getPrepTime() > time){
                time = order[i].getPrepTime();
            }
        }
        return time;
    }
    public String toString() {
        return ("Table " + name + " Items: " + itemCount + " Total Time: " + determinePrepTime() + " and it cost $" + getTotalPrice());


    }


}
