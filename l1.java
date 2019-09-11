//инкапсуляция и полиморфизм
public abstract class AbstractPhone {
    private int year;     

    private RollBackYear() {
            this.year =0;;
        }

    public AbstractPhone(int year) {
        this.year = year;
    }

    public printA(int a) {
            system.out.print(a);
        }

    public printA(string a) {
            system.out.print(a);
        }

}
//наследование
public abstract class WirelessPhone extends AbstractPhone {

    private int hour;

    public WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }
}
