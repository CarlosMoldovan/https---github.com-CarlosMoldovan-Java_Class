public class masinaclass {
    private String tip;
    private String culoare;
    private double viteză;
    public void setTip(String nume)
    {
       this.tip = nume;
    }
    public void setCuloare(String culoare)
    {
       this.culoare = culoare;
    }
    public void setViteză(double viteză)
    {
       this.viteză = viteză;
    }
    public String getTip()
    {
        return this.tip;
    }
    public String getCuloare()
    {
        return this.culoare;
    }
    public double getViteză()
    {
        return this.viteză;
    }
    @Override
    public String toString() {
        return "Mașina este " + tip +" are culoarea " + culoare + " și are viteza de " + viteză + " km pe oră!";
    }
}
