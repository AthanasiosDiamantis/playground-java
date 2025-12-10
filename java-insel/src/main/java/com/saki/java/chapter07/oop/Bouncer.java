package com.saki.java.chapter07.oop;

	class Bodybuilder {
		
		Bodybuilder(){
			whoAmI();
		}
		
		void whoAmI() {
			System.out.println("I don't know yet :-( ");
		}

	}
	
	public class Bouncer extends Bodybuilder {
		
		String who = "I'm a bouncer !!! ";
		
		@Override
		void whoAmI() {
			System.out.println( who);
		}

		// TODO try to understand dynamic binding within this example 
		public static void main(String[] args) {
			Bodybuilder bb = new Bodybuilder();
			bb.whoAmI();
			
			Bouncer bouncer = new Bouncer();
			bouncer.whoAmI();
		}
}
