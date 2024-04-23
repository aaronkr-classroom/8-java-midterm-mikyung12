public class LibrarySystem  {
	private Book[] booklist;
	private static int bookCount = 0;
	private static final int NUM_BOOK = 10;
	
	public LibrarySystem() {
		booklist = new Book[NUM_BOOK];
		bookCount = 0;
	}
	
	public void addBook(Book book) {
		if (bookCount < NUM_BOOK) {
            booklist[bookCount++] = book;
            System.out.println("'" + book.getTitle() + "'을(를) 라이브러리에 추가했습니다.");
        } else {
            System.out.println("라이브러리가 꽉 찼습니다. 책을 추가할 수 없습니다.");
        }
	}
	
	public void removeBook(String title) {
		  for (int i = 0; i < bookCount; i++) {
	            if (booklist[i].getTitle().equals(title)) {
	                for (int j = i; j < bookCount - 1; j++) {
	                    booklist[j] = booklist[j + 1];
	                }
	                booklist[--bookCount] = null;
	                System.out.println("'" + title + "'을(를) 라이브러리에서 삭제했습니다.");
	                return;
	            }
	        }
		
    	
		
	
		// 찾을 수 없으면 메시지를 인쇄합니다.
		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
}

	
	public void borrowBook(String title) {
		 for (int i = 0; i < bookCount; i++) {
	            if (booklist[i].getTitle().equals(title)) {
	                if (booklist[i].isAvailable()) {
	                    booklist[i].setAvailable(false);
	                    System.out.println("'" + title + "'을(를) 대출했습니다.");
	                } else {
	                    System.out.println("'" + title + "'은(는) 현재 대출 중입니다.");
	                }
	                return;
	            }
	        }
		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
	}
	
	public void returnBook(String title) {	
		for (int i = 0; i < bookCount; i++) {
            if (booklist[i].getTitle().equals(title)) {
                if (!booklist[i].isAvailable()) {
                    booklist[i].setAvailable(true);
                    System.out.println("'" + title + "'을(를) 반납했습니다.");
                } else {
                    System.out.println("'" + title + "'은(는) 이미 라이브러리에 있습니다.");
                }
                return;
            }
		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
		}
	}
	
	public void displayAllBooks() {
		System.out.println("책 목록: ");
		for (int i = 0; i < bookCount; i++) {
			Book book = booklist[i];
			System.out.println(book.getIsbn() + " | " + book.getTitle() + book.getAuthor() + book.getYear());
		}
	}

    }


