package curriculum.b;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();

		
		  Greeting greeting = new Greeting();
	        greeting.sayHello();
        //Question5 Q4(8行目　9行目)
	        
	        
	        
	        
        animal.setName("ライオン");
        animal.setLength(2.1);
        animal.setSpeed(80);

        
        
        
        
        System.out.println("動物名：" + animal.getName());
        System.out.println("体長：" + animal.getLength() + "m");
        System.out.println("速度：" + animal.getSpeed() + "km/h");
        
      
        //Question5 Q5（15行目　25行目） 
    }
}
