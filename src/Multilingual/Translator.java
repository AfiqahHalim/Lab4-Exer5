package Multilingual;

//for translation
public class Translator {

	private String translate;

	public Translator(String translate) {
		
		this.translate=translate;
		
		
	}
	
	public Translator() {
		
	}
	
	public void setText(String translate) {
		
		this.translate=translate;
		
	}
	
	public String getTranslate() {
		
		return translate;
		
	}
		
	
	
	public String getTranslatedMessage() {
		
		String translatedMessage = "";
				
		if(translate.contentEquals("Good Morning")||translate.contentEquals("Good morning")||translate.contentEquals("good morning")) {
			
		
				translatedMessage="Selamat Pagi          الخير          좋은 아침";
	
			}
			
			
		else if (translate.contentEquals("Good Night")||translate.contentEquals("Good night")||translate.contentEquals("good night")) {
			
		
				translatedMessage = "Selamat malam     مساء الخير        안녕히 주무세요";
				
						
			}
			
		else if (translate.contentEquals("How are you?")||translate.contentEquals("how are you?")) {
			
			
				translatedMessage = "Apa khabar?         كيف حالكم؟          어떻게 지내세요?";
				
		
			}
		
	    else if (translate.contentEquals("Thank you")||translate.contentEquals("thank you")) {
		
				translatedMessage = "Terima kasih       شكرا جزيلا       감사합니다";
		
			}
		
		else if (translate.contentEquals("Goodbye")||translate.contentEquals("goodbye")) {
			
		
				translatedMessage = "Selamat Tinggal    مع السلامة           안녕";
				
		
			}
			
		else if (translate.contentEquals("What's up?")||translate.contentEquals("what's up?")) {
			
			
				translatedMessage = "Ada apa?             ما أخبارك؟      뭐야?";
						
			}
		
		
		return translatedMessage;
	
	  }

}
