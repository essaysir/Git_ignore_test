package nocommit_some;

public class NoCommit_7_untrack {

	public static void main(String[] args) {
		/*
	    1. 처음부터 NoCommit_7_untrack.java 파일을 .gitignore 파일속에 올려두지 않았습니다.
		2. NoCommit_7_untrack.java 파일을 생성하면 Unstaged Changes(관리를 받지 않는 단계)에 들어와 있고 
		      내용을 채우고 저장한 후  Staged Changes(관리를 받는 단계)에 들어오도록 만듭니다.
        3. 그런 다음에 .gitignore 파일을 열어서 /Git_ignore_test/src/main/java/nocommit_some/NoCommit_7_untrack.java 을 등록한 후 저장합니다.
        4. NoCommit_7_untrack.java 파일을 .gitignore 에 등록해 두었지만 Staged Changes(관리를 받는 단계)에 들어갔으므로 계속해서 commit 대상이 되어버립니다. 
        5. 이때 NoCommit_7_untrack.java 파일에 마우스 우측을 클릭하여 Team => Advanced => Untrack 을 클릭합니다.
        6. 이제 NoCommit_7_untrack.java 파일은 Unstaged Changes(관리를 받지 않는 단계) 와 Staged Changes(관리를 받는 단계) 모두에서 제외 됩니다.
        7  NoCommit_7_untrack.java 파일은 .gitignore 에 등록해둔 파일이므로 이제부터는 파일내용을 변경하여 저장 하더라도 
           Unstaged Changes(관리를 받지 않는 단계) 와 Staged Changes(관리를 받는 단계) 모두에서 제외되므로  commit 대상에서 제외됩니다. 
        8. commit 대상이 아니므로 당연히 Push 도 되지 않는 파일이 됩니다.    	
	 */
		System.out.println("== NoCommit_7_untrack.java 파일입니다. =="); 
	}

}
