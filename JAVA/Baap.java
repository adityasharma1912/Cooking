class Baap{

	void functionBaap(){
		System.out.println("Code executing inside Baap");
	}
}

class Beta extends Baap{

	void functionBaap(){
		System.out.println("Code executing inside Beta");
	}

	public static void main(String args[]){
		//some shitty testing.. you might know already...
		Baap baapObject = new Baap();
		baapObject.functionBaap();
		Baap baapObject2 = new Beta();
		baapObject2.functionBaap();
		Beta betaObject = new Beta();
		betaObject.functionBaap();

		/* next part of code gonna sucks during comilation.. with following error...
		* "incompatible types: Baap cannot be converted to Beta"
		*/

		//Beta betaObject2 = new Baap();
		//betaObject2.functionBaap();
	}
}
