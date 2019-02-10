package entities;

	public class CurrencyConverter {
	
		public double price;
		public double dollars;
		public double percentage() {
			return (dollars/100)*6;
		}
		
		public double totalReais(){
			return (dollars + percentage()) * price;
		}

		public String toString(){
			return "Amount to be paid in reais = R$: "
					+String.format("%.2f", totalReais());
		}

	}

