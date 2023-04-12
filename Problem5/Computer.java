import java.util.Objects;

public class Computer {
	
	private String manufacturer;
	private String processor;
	private int ramSize;
	private double processorSpeed;
	
	public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	
	public double computePower() {
		
		return this.ramSize * this.processorSpeed;
	}
	
	@Override
	public boolean equals(Object comp) {
		
		if(comp == null) return false;
		
		if(!(comp instanceof Computer)) return false;
		
		Computer c = (Computer) comp;
		
		boolean isEqual = this.manufacturer.equals(c.manufacturer) && 
						  this.processor.equals(c.processor) && this.ramSize == c.ramSize &&
					      this.processorSpeed == c.processorSpeed;
		
		return isEqual;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Manufacturer: ").append(this.manufacturer)
		.append(" Processor: ").append(this.processor)
		.append(" RAM Size: ").append(this.ramSize)
		.append(" Processor Speed: ").append(this.processorSpeed);
		
		return sb.toString();
	}
}
