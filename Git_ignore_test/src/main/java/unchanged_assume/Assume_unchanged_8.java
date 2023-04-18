package unchanged_assume;

public class Assume_unchanged_8 {

	public static void main(String[] args) {
	/*
	   1. 처음부터 Assume_unchanged_8.java 파일을 .gitignore 파일속에 올려두지 않았습니다.
	   2. Assume_unchanged_8.java 파일을 생성하면 Unstaged Changes(관리를 받지 않는 단계)에 들어와 있고 
		    내용을 채우고 저장한 후  Staged Changes(관리를 받는 단계)에 들어오도록 만듭니다.
	   3. Commit 을 하고 Push 도 합니다. 
		  Web 의 git Hub 에 가보면 /MyGitExample/src/main/java/unchaged_assume/Assume_unchanged_8.java 파일이 Push 되어 보여집니다.
	   4. Assume_unchanged_8.java 파일의 내용을 변경합니다.
	             파일을 저장하면 Unstaged Changes(관리를 받지 않는 단계)에 >(dirty) 모양으로 들어옵니다.
	      Staged Changes(관리를 받는 단계)에 *(staged) 모양으로 들어와도 상관 없이 괜찮습니다.       
	   5. Project Explorer 에서  Assume_unchanged_8.java 파일에 마우스 우클릭하여 
	      Team => Advanced => Assume Unchanged(변경이 없음으로 가정함)를 클릭하면 
	      Project Explorer 에서  Assume_unchanged_8.java 파일의 아이콘이 우측하단에 조그만한 v(assume-valid) 표시가 나옵니다.
	   6. 이제부터 Assume_unchanged_8.java 파일은 내용물에 실제로 변경이 있음에도 불구하고
	             변경이 없음으로 간주하기 때문에 Git Staging 의 Unstaged Changes(관리를 받지 않는 단계)에 가보면 
	      Assume_unchanged_8.java 파일이 없어져 안보이게 되고, 그러므로  Staged Changes(관리를 받는 단계)에도 들어오지 않게 되기에 
	      Commit 및 Push 에서 빠지게 됩니다.
	   7. 만약에 Assume_unchanged_8.java 파일을 다시 commit 대상으로 만들어 Push 해주고 싶으면 
	      Project Explorer 에서  Assume_unchanged_8.java 파일에 마우스 우클릭하여 
	      Team => Advanced => No Assume Unchanged(변경이 없음으로 가정함을 없앰) 를 클릭하면 됩니다. 
	   8. Project Explorer 에서  Assume_unchanged_8.java 파일의 아이콘은 우측하단에 조그만한 v(assume-valid) 표시가 없어지고
	             노란 원기둥 모양의 표시(tracked) 또는 노란 원기둥 모양의 표시 >(dirty) 또는 * 표시(staged) 로 보여집니다.	
	   9. Git Staging 의 Unstaged Changes(관리를 받지 않는 단계)에 가보면 
	      Assume_unchanged_8.java 파일이 >(dirty) 모양으로 들어오게 되고 
	             이제부터는 Staged Changes(관리를 받는 단계)에도 들어오게 되고 Commit 및 Push 대상이 되어집니다.          
	*/
		System.out.println("==== Assume_unchanged_8.java 파일입니다. ===="); 
		System.out.println("==== Assume_unchanged_8.java 파일입니다. ===="); 
		System.out.println("==== Assume_unchanged_8.java 파일입니다. ===="); 
		System.out.println("==== Assume_unchanged_8.java 파일입니다. ===="); 
		

	}

}
