
public class Speaker implements Volume,Play,Power{
	public static void main(String args[]){
	
	}
    public void play(){
        System.out.println("play");
        
    }
    public void pause(){
        System.out.println("pause");
    }
	
	public void powerOn(){
	    System.out.println("on");
	}
    
    public void powerOff(){
	    System.out.println("off");
	}

    public void volumeUp(){
        System.out.println("up");
    }
    
    public void volumeDown(){
        System.out.println("down");
        
    }
    
    public void mute(){
        
        System.out.println("mute");
    }
}