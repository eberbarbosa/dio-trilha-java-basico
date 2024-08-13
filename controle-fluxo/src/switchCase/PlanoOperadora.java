package switchCase;
public class PlanoOperadora {
    
    public static void main(String[] args) {
		String plano = "T"; //M / T
		
		/*if(plano == "B") {
			System.out.println("\n100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("\n100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis\n");	
		}else if(plano == "T") {
			System.out.println("\n100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube\n");
            }*/
            
            switch (plano) {
                case "T": {
                    System.out.println("5Gb Youtube");
                }
                case "M": {
                    System.out.println("WhatsApp e Instagram grátis");
                }
                case "B": {
                    System.out.println("100 minutos de ligação");
                }
            }
		
			
		
	}
}
