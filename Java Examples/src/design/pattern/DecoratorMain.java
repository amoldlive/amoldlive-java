package design.pattern;

abstract class Coffee {
	public abstract String getDescription();

	public abstract int getCost();
}

class BaseCoffee extends Coffee {
	@Override
	public String getDescription() {
		return "Base Coffee";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 10;
	}
}

abstract class CoffeeDecorator extends Coffee {

	private Coffee coffee;

	public CoffeeDecorator(Coffee coffee) {
		super();
		this.coffee = coffee;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription();
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return coffee.getCost();
	}
}

class AddMilk extends CoffeeDecorator {

	public AddMilk(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " + Milk ";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 10;
	}
}

class AddSuger extends CoffeeDecorator {

	public AddSuger(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription() + " + Suger ";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return super.getCost() + 5;
	}

}

public class DecoratorMain {

	public static void main(String[] args) {

		Coffee coffee = new BaseCoffee();
		printCoffee(coffee);

		Coffee addmilk = new AddMilk(coffee);
		printCoffee(addmilk);

		Coffee addsuger = new AddSuger(addmilk);
		printCoffee(addsuger);
	}

	public static void printCoffee(Coffee cofee) {
		System.out.println("Desc : " + cofee.getDescription() + "    Cost :  " + cofee.getCost());
	}
}
