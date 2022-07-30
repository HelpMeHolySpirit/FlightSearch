import java.util.ArrayList;

public class FlightDatabase {

    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        flightDatabase.checkIfFlightExists("Warsaw", "Madrid");
//        flightDatabase.displayFlightsToCity("Berlin");
//        ArrayList<String> cities = flightDatabase.getCities();
//        for (String city: cities) {
//            System.out.println(city);
//        }
//        flightDatabase.getCheapestFlightFromCity("Paris").getInformationAboutFlight();
//
        ArrayList<Journey> journeys = flightDatabase.getFlights("Warsaw", "Los Angeles");
        String journey = flightDatabase.getCheapestJourney(journeys).toString();
        System.out.println(journey);

        for (Flight flight: flightDatabase.findTheBestJourney("Warsaw", "Los Angeles")) {
            flight.getInformationAboutFlight();
        }


    }
    private ArrayList<Flight> flights = new ArrayList();

    public FlightDatabase(){
        this.flights.add(new Flight("Warsaw", "Los Angeles", 400, 44));
        this.flights.add(new Flight("Warsaw", "Berlin", 400, 44));
        this.flights.add(new Flight("Berlin", "Los Angeles", 400, 600));

        this.flights.add(new Flight("Warsaw", "New York", 1200, 550));
        this.flights.add(new Flight("Warsaw", "Madrid", 640, 120));
        this.flights.add(new Flight("Warsaw", "Paris", 530, 80));
        this.flights.add(new Flight("Paris", "Warsaw", 530, 80));
        this.flights.add(new Flight("Paris", "Berlin", 340, 44));
        this.flights.add(new Flight("Paris", "Los Angeles", 2000, 550));
        this.flights.add(new Flight("Paris", "Rome", 700, 110));
        this.flights.add(new Flight("Warsaw", "Gdańsk", 240, 30));

    }

    public void checkIfFlightExists(String arrival, String departure){
        for (Flight flight:
             this.flights) {
            if(flight.getArrival().equals(arrival) & flight.getDeparture().equals(departure)){
                System.out.println("Flight exists.");
                return;
            }
        }
        System.out.println("Flight doesn't exist.");
    }

    public ArrayList<Flight> getFlightsFromCity(String departure){
        ArrayList<Flight> results = new ArrayList<>();

        for (Flight flight: flights) {
            if(flight.getDeparture().equals(departure)){
                results.add(flight);
            }
        }
        return results;
    }

    public ArrayList<Flight> getFlightsToCity(String arrival){
        ArrayList<Flight> results = new ArrayList<>();

        for(Flight flight: this.flights){
            if(flight.getArrival().equals(arrival)){
                results.add(flight);
            }
        }
        return results;
    }

    public void displayFlights(ArrayList<Flight> results){
        if(results.isEmpty()){
            System.out.println("Flight not found.");
        }else {
            for(Flight flight: results){
                flight.getInformationAboutFlight();
            }
        }
    }

    public void displayFlightsFromCity(String departure){
        ArrayList<Flight> fromCity = getFlightsFromCity(departure);
        displayFlights(fromCity);
    }

    public void displayFlightsToCity(String arrival){
            ArrayList<Flight> toCity = getFlightsToCity(arrival);
            displayFlights(toCity);
    }

    public ArrayList<String> getCities(){
        ArrayList<String> results = new ArrayList<String>();
        for (Flight flight: this.flights) {
            if(!results.contains(flight.getArrival())){
                results.add(flight.getArrival());
            }
            if(!results.contains(flight.getDeparture())){
                results.add(flight.getDeparture());
            }
        }
        return results;
    }



    public Flight getCheapestFlight(){
        Flight cheapestFlight = null;
        for (Flight flight: this.flights) {
            if(cheapestFlight == null || cheapestFlight.getPrice() > flight.getPrice()){
                cheapestFlight = flight;
            }
        }
        return cheapestFlight;
    }

    public Flight getCheapestFlightFromCity(String departure){
        Flight cheapestFlight = null;
        for (Flight flight: this.flights) {
            if((cheapestFlight == null || cheapestFlight.getPrice() > flight.getPrice()) && flight.getDeparture().equals(departure)){
                cheapestFlight = flight;
            }
        }
        return cheapestFlight;
    }



    public ArrayList<Journey> getFlights(String departure, String arrival){
        ArrayList<Flight> fromCity = getFlightsFromCity(departure);
        ArrayList<Flight> toCity = getFlightsToCity(arrival);
        ArrayList<Journey> result = new ArrayList<>();

        for (Flight first: fromCity){
            for(Flight second: toCity){
                if (first.getArrival().equals(second.getDeparture())){
                    result.add(new Journey(first, second));
                }
            }
        }
        return result;
    }

    public ArrayList<Journey> getCheapestJourney(ArrayList<Journey> journeys){
        Journey cheapestJourney = null;
        ArrayList<Journey> result = new ArrayList<>();
        for (Journey journey: journeys) {
            if((cheapestJourney == null || cheapestJourney.getFirst().getPrice() + cheapestJourney.getSecond().getPrice() > journey.getFirst().getPrice() + journey.getSecond().getPrice())){
                cheapestJourney = journey;
            }
        }
        result.add(cheapestJourney);

        return result;
    }

    public ArrayList<Flight> findTheBestJourney(String departure, String arrival){
        ArrayList<Flight> result = new ArrayList<>();
        for (Flight flight: flights) {
            if(flight.getDeparture().equals(departure) && flight.getArrival().equals(arrival)){
                result.add(flight);
                return result;
            }
        }
        ArrayList<Journey> journey = getCheapestJourney(getFlights(departure, arrival));
        result.add(journey.get(0).getFirst());
        result.add(journey.get(0).getSecond());

        return result;
    }

}
