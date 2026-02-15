package curriculum.j;
public class ContractEmploye extends Employe {

    private static final int HOURLY_RATE = 1000;

    public ContractEmploye(String id, String name) {
        super(id, name);
    }

    @Override
    public int costForDay(int hoursWorked) {
        return hoursWorked * HOURLY_RATE;
    }
}