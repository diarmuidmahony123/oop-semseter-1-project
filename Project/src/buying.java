public class buying {
    private double costOfitem;
    private int quaity;
    protected double  totalcost;


    public buying(double costOfitem, int quaity, double totalcost){
        this.costOfitem = costOfitem;
        this.quaity = quaity;
        this.totalcost = totalcost;

    }
    public double getCostOfitem(){
        return this.costOfitem;
    }
    public int getQuaity(){
        return this.quaity;
    }
    public double getTotalcost(){
        return this.totalcost;
    }

    public void setCostOfitem(double costOfitem){
        this.costOfitem = costOfitem;
    }
    public void setQuaity(int quaity){
        this.quaity = quaity;
    }
    public void setTotalcost(double totalcost){
        this.totalcost = totalcost;
    }
}
