
public class LetItGo {

	public static void main(String[] args) {
		String lyrics = new String("Let it go! Let it go!Cannot hold it back anymore");
				
		lyrics = lyrics.replace("it", "her");
		lyrics = lyrics.replace("Cannot", "Can't");
        System.out.println(lyrics);
	}

}
