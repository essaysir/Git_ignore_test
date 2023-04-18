package nocommit_some;

public class NoCommit_5_right {

	public static void main(String[] args) {
		/*
		  1. 맨 처음에는 .gitignore 파일속에 NoCommit_5_right.java 파일을 등록하지 않았습니다.
		  2. NoCommit_5_right.java 파일을 생성하여 내용을 입력한 후 저장합니다.  
		  3. NoCommit_5_right.java 파일은 Unstaged Changes(관리를 받지 않는 단계)에만 들어갑니다.  
		  4. 이제 .gitignore 파일을 열어서  /Git_ignore_test/src/main/java/nocommit_some/NoCommit_5_right.java 을 등록하여 저장하면  
		     NoCommit_5_right.java 파일은 관리대상에서 제외됩니다. 
		  5. 이렇게 하면 이 파일은 Unstaged Changes(관리를 받지 않는 단계)에서 제외되므로 더 이상 commit 대상이 안 되어집니다.  
		*/
			System.out.println("== NoCommit_5_right.java 파일입니다. ==");  
	}

}
