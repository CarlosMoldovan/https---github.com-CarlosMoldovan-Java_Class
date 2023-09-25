 public class ContBancar {
    private double _sold = 0.0;
    public ContBancar(double sold)
    {
        _sold = sold;
    }
    public void depozitareSuma(double suma)
    {
        _sold += suma;
    }
    public boolean retragereSuma(double suma)
    {
       if (_sold - suma >= 0)
        {
          _sold -= suma;
          return true;
        }
       else
        {
          return false;
        }
    }
    public double interogareSold()
    {
        return _sold;
    }
    @Override
    public String toString() {
        return "ContBancar [Sold=" + _sold + "]";
    }
}
