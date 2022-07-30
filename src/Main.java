class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("200g", 700);
        MobilePhone oldPhone = new MobilePhone("4000g", 100);
        MobilePhone mediumPhone = new MobilePhone("600g", 340);
        phone.checkPrice();
        oldPhone.checkPrice();
        mediumPhone.checkPrice();
        phone.getNumber(5, -2);
    }
}

class MobilePhone{
    String weight = "200g";
    int price;

    public MobilePhone(String weight, int price){
        this.weight = weight;
        this.price = price;
    }

    public void displayPrice(){
        System.out.println("Price: " + this.price);
    }

    public void lowerPrice(int discountInPercent){
        this.price = price - ((price * discountInPercent) / 100);
    }

    public void increasePrice(int increaseInCurrency){
        this.price = price + increaseInCurrency;
    }

    public void displayValues(){
        System.out.println("Weight: " + this.weight + " Price: " + this.price);
    }

    public String getParameters(){
        return "Weight: " + this.weight + " Price: " + this.price;
    }

    public int checkPrice() {
        if(price > 500){
            System.out.println("This phone is expensive");
        }
        return price;
    }

    public void displayEvenNumbers(int min, int max){
        for (int i = min; i < max; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public void isDivided(int min, int max){
        int result = 0;
        for (int i = min; i <= max; i++){
            if(i % 3 == 0 || i % 5 == 0){
                result++;
            }
        }
        System.out.println(result);
    }

    public int getEvenSum(int min, int max){
        int evenSum = 0;
        for (int i = min; i < max; i++){
            if(i % 2 == 0){
                evenSum = evenSum + i;
            }
        }
        return evenSum;
    }

    public void getNumber(int max, int min){
        for (int i = max; i >= min; i--){
            if(i != min){
                System.out.print(i + ", ");
            }else{
                System.out.print(i);
            }
        }
    }

}

class Flight{
    private String arrival;
    private String departure;
    private int price;
    private int duration;
    public Flight(String departure, String arrival, int price, int duration){
        this.arrival = arrival;
        this.departure = departure;
        this.price = price;
        this.duration = duration;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public int getPrice() {
        return price;
    }

    public int getDuration() {
        return duration;
    }

    public void getInformationAboutFlight(){
        System.out.println("Flight from " + this.departure + " to " + this.arrival + " costs " + this.price + " and lasts " + this.duration);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
