import java.util.ArrayList;
import java.util.Scanner;

public class HolidayFinder {
    private ArrayList<Holiday> allHolidays;

    public HolidayFinder() {
        Holiday newYear = new Holiday("Confraternização mundial", "01/01/2023");
        Holiday carnival = new Holiday("Carnaval", "21/02/2023");
        Holiday easter = new Holiday("Páscoa", "17/04/2023");
        Holiday tiradentes = new Holiday("Tiradentes", "21/04/2023");
        Holiday laborDay = new Holiday("Dia do trabalho", "01/05/2023");
        Holiday corpusChristi = new Holiday("Corpus Christi", "08/06/2023");
        Holiday independenceFromBrazil = new Holiday("Independência do Brasil", "07/09/2023");
        Holiday ourLadyAparecida = new Holiday("Nossa Senhora Aparecida", "12/10/2023");
        Holiday allSoulsDay = new Holiday("Finados", "02/11/2023");
        Holiday declarationOftheRepublic = new Holiday("Proclamação da República", "15/11/2023");
        Holiday christmas = new Holiday("Natal", "25/12/2023");

        ArrayList<Holiday> holidays = new ArrayList<>();
        holidays.add(newYear);
        holidays.add(carnival);
        holidays.add(easter);
        holidays.add(tiradentes);
        holidays.add(laborDay);
        holidays.add(corpusChristi);
        holidays.add(independenceFromBrazil);
        holidays.add(ourLadyAparecida);
        holidays.add(allSoulsDay);
        holidays.add(declarationOftheRepublic);
        holidays.add(christmas);

        this.allHolidays = holidays;
    }

    public void printAllHollidays() {
        for (int i = 0; i < allHolidays.size(); i++) {
            Holiday holiday = allHolidays.get(i);
            Logger.println(holiday.getDate() + " => " + holiday.getName());
        }
    }

    public void find() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a data do feriado? DD/MM/2023");
        String dateInput = sc.nextLine();

        for (int i = 0; i < allHolidays.size(); i++) {
            Holiday holiday = allHolidays.get(i);
            if (holiday.getDate().equals(dateInput)) {
                System.out.println("Essa data corresponde ao feriado de " + holiday.getName());
                break;
            }
            if (i == allHolidays.size() - 1) {
                System.out.println("Não existe feriado com tal data");
            }
        }
    }

    public ArrayList<Holiday> getAllHolidays() {
        return allHolidays;
    }

    public void setAllHolidays(ArrayList<Holiday> allHolidays) {
        this.allHolidays = allHolidays;
    }

}
