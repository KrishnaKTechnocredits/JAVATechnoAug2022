package technocredits.collectionsdemo.advance;

public class Builder implements Comparable<Builder> {

	private String name;
	private int exp;
	private int revenue;
	private String location;

	public Builder(String name, int exp, int revenue, String location) {
		super();
		this.name = name;
		this.exp = exp;
		this.revenue = revenue;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public int getExp() {
		return exp;
	}

	public int getRevenue() {
		return revenue;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public int compareTo(Builder o) {
		if(this.exp != o.exp)
			return this.exp - o.exp;
		else if(this.revenue != o.revenue) {
			return this.revenue - o.revenue; 
		}else {
			return this.name.compareTo(o.name);
		}
	}

}
