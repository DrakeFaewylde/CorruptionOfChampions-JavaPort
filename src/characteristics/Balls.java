package src.characteristics;

public class Balls {
	private Double size;
	private Integer count;
	
	public Balls(Double size) {
		this(size, 2);
	}
	public Balls(Double size, Integer count) {
		this.setSize(size)
		.setCount(count);
	}
	
	public Double getSize() {
		return this.size;
	}
	public Integer getCount() {
		return this.count;
	}
	public Balls setSize(Double size) {
		this.size = size;
		return this;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
}
