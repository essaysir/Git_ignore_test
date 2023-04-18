package nocommit_some;

public class NoCommit_6_mistake {

	public static void main(String[] args) {
	/*
		  1. NoCommit_6_mistake.java 파일은 .gitignore 파일에 등록하지 않고 먼저 생성되어진 파일입니다.
		  2. NoCommit_6_mistake.java 파일을 commit 하고 push 합니다.  
		  3. 그런 다음에 .gitignore 파일을 열어서 /Git_ignore_test/src/main/java/nocommit_some/NoCommit_6_mistake.java 을 등록한 후 저장합니다.   
		  4. 이렇게 되면 NoCommit_6_mistake.java 파일은 .gitignore 에 등록되었다 하더라도 파일내용이 변경되면 계속해서 commit 대상이 되어져 버립니다. 
		           왜냐하면 어떤 파일이 Staged Changes(관리를 받는 단계)에 등록이 되어진 이후 부터는 ignore 하더라도 ignore 가 되지 않기 때문입니다. 
		  5. NoCommit_6_mistake.java 파일을  ignore 되도록 하기 위한 무식한 방법은  
		     NoCommit_6_mistake.java 파일의 내용을 메모장으로 백업받은 후
		     NoCommit_6_mistake.java 파일을 삭제한 후 push 하고 
		          다시 NoCommit_6_mistake.java 파일을 재생성해서 백업해둔 메모장의 내용으로 덮어씌우면 됩니다. 
	*/	
		System.out.println("=== NoCommit_6_mistake.java 파일입니다. ==="); 
	}

}
