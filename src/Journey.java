public class Journey {
    private Flight first;
    private Flight second;

    public Journey(Flight first, Flight second){
        this.first = first;
        this.second = second;
    }

    public Flight getFirst() {
        return first;
    }

    public Flight getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Flight from " + this.first.getDeparture() + " to " + this.second.getArrival() + " with stop at " + first.getArrival() + " costs " + (this.first.getPrice() + this.second.getPrice() + " and lasts " + (this.first.getDuration() + this.second.getDuration()));
    }
}
