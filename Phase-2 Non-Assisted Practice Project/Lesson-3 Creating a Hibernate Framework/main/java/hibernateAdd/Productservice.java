package hibernateAdd;

public class Productservice {
	
	Productdao ps=new Productdao();
	public String storeEmployee(Productdetails pd) {
        if(pd.getPrice()<5000) {
            return " Product price must be > 5000";
        }else if(ps.storeProduct(pd)>0) {
            return " Record inserted successfully";
        }else {
            return " Record didn't insert";
        }
    }

}
