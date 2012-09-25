
public class Mammal {

	int ayaksayisi=4;
//	public static void testClassMethod() {
 //       System.out.println("The class" + " method in Mammal.");
//    }
//    public void testInstanceMethod() {
 //       System.out.println("The instance " + " method in Mammal.");
//    }
	System.out.print("ayak sayýsý " + ayaksayisi );

}

public class Cats extends Mammal {
	String kedikumumarkasi="CatWorld";
	int ictigisutmiktari=3;
	
	public void miyavlama() {
        System.out.println("Kedi = miyaaav");
	}
   // public static void testClassMethod() {
   //     System.out.println("The class method" + " in Cats.");
    }
  //  public void testInstanceMethod() {
  //      System.out.println("The instance method" + " in Cats.");
   // }

    public static void main(String[] args) {
        Cats myCat = new Cats();
        
        Mammal myMammal = myCat;
   //     Mammal.testClassMethod();
   //     myMammal.testInstanceMethod();
        myCat.miyavlama();
        myCat.ictigisutmiktari;
        myCat.kedikumumarkasi;
    }
}


public class Dogs extends Mammal {
	String kopekmamasi="DogWorld";
	int yedigikemiksayisi=7;
	
	public void havlama() {
        System.out.println("Köpek = haaav");
	}
   // public static void testClassMethod() {
   //     System.out.println("The class method" + " in Dogs.");
    
  //  public void testInstanceMethod() {
  //      System.out.println("The instance method" + " in Dogs.");
   // }

    public static void main(String[] args) {
        Dogs myDog = new Dogs();
          Mammal myMammal = myDog;
   //     Mammal.testClassMethod();
   //     myMammal.testInstanceMethod();
        myDog.havlama();
        myDog.yedigikemiksayisi;
        myDog.kopekmamasi;
    }
}

