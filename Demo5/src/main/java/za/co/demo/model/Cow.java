package za.co.demo.model;

public class Cow extends Animal{
		private boolean bell;
		
		public Cow() {
			super("cow");
		}

		public boolean hasBell() {
			return bell;
		}

		public void setBell(boolean bell) {
			this.bell = bell;
		}		
		
		@Override
		public String getName() {
			return "Daisy";
		}
		
}
