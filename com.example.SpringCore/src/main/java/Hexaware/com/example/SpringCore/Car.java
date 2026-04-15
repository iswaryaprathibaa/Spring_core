package Hexaware.com.example.SpringCore;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	  int carId;
	  String carName;
	  @Autowired
	  Engine engineobj;
	  
	  public Car() {
		super();
	}


	  public Car(int carId, String carName, Engine engineobj) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.engineobj = engineobj;
	}


	  @Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", engineobj=" + engineobj + "]";
	}


	  public int getCarId() {
		return carId;
	}


	  public String getCarName() {
		  return carName;
	  }


	  public Engine getEngineobj() {
		  return engineobj;
	  }


	  public void setCarId(int carId) {
		  this.carId = carId;
	  }


	  public void setCarName(String carName) {
		  this.carName = carName;
	  }


	  public void setEngineobj(Engine engineobj) {
		  this.engineobj = engineobj;
	  }


	  
}
