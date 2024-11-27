class SwitchDemo{
	public static void main(String []args){
		int data=500;
		if(data<500){
			switch(data){
				case 100:
					System.out.println("1Hundred");
				case 200:
					System.out.println("2Hundred");
				case 300:
					System.out.println("3Hundred");
				case 400:
					System.out.println("4Hundred");
			}
		}else{
			if(data>500){
				switch(data){
					case 600:
						System.out.println("6Hundred");
					case 700:
						System.out.println("7Hundred");
					case 800:
						System.out.println("8Hundred");
					case 900:
						System.out.println("9Hundred");
					case 1000:
						System.out.println("Thousand");
				}
			}else{
				System.out.println("Coder:)");
			}
		}
	}
}
