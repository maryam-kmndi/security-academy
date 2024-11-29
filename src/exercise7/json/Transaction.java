package exercise7.json;

public class Transaction {
		private String to;
	    private double amount;
	    private String description;
	    
		public Transaction() {
			super();
		}
		
		public Transaction(String to, double amount, String description) {
			super();
			this.to = to;
			this.amount = amount;
			this.description = description;
		}
		public String getTo() {
			return to;
		}
		public void setTo(String to) {
			this.to = to;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		@Override
		public String toString() {
			return "\nTransaction [to=" + to + ", amount=" + amount + ", description=" + description + "]\n";
		}
	    
}
