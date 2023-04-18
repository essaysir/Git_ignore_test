package nocommit_some;

public class NoCommit_7_untrack2 {

	public static void main(String[] args) {
		/*
	    1. 처음부터 NoCommit_7_untrack2.java 파일을 .gitignore 파일속에 올려두지 않았습니다.
		2. NoCommit_7_untrack2.java 파일을 생성하면 Unstaged Changes(관리를 받지 않는 단계)에 들어와 있고 
		      내용을 채우고 저장한 후  Staged Changes(관리를 받는 단계)에 들어오도록 만듭니다.
		3. Commit 을 하고 Push 도 합니다. 
		   Web 의 git Hub 에 가보면 /Git_ignore_test/src/main/java/nocommit_some/NoCommit_7_untrack2.java 파일이 Push 되어 보여집니다.     
        4. 그런 다음에 .gitignore 파일을 열어서 /Git_ignore_test/src/main/java/nocommit_some/NoCommit_7_untrack2.java 을 등록한 후 저장합니다.
        5. NoCommit_7_untrack2.java 파일을 .gitignore 에 등록해 두었지만 이전에 Staged Changes(관리를 받는 단계)에 들어간 적이 있으므로 계속해서 commit 대상이 되어버립니다. 
        6. 이때 NoCommit_7_untrack2.java 파일에 마우스 우측을 클릭하여 Team => Advanced => Untrack 을 클릭합니다.
        7. Project Explorer 에 가보면 이제부터 NoCommit_7_untrack2.java 파일은 ignore 상태로 되어집니다.
                        그러나 Git Staging 에 가보면  Unstaged Changes(관리를 받지 않는 단계) 와 Staged Changes(관리를 받는 단계) 에서는 
           NoCommit_7_untrack2.java 파일이 제외되지 않고 그대로 보여집니다.
                        그런데  Unstaged Changes(관리를 받지 않는 단계) 와 Staged Changes(관리를 받는 단계) 에서 보여지는 NoCommit_7_untrack2.java 파일의 아이콘 모양이 변경되어집니다.
                        아이콘 모양이 Unstaged Changes(관리를 받지 않는 단계)에서는 > 대신에 ?(untracked) 으로 보여지고, Staged Changes(관리를 받는 단계) 에서는  *(staged) 대신에 파일삭제표시인 우측하단에 x(removed) 가 보여집니다.
                        즉, Web 의 git Hub 에 있던 /Git_ignore_test/src/main/java/nocommit_some/NoCommit_7_untrack2.java 파일을 삭제하겠다는 것입니다.                          
        8. Commit 메시지를 쓴 후 Commit 을 하고 Push 를  합니다.
        9. Web 의 git Hub 에 가보면 /Git_ignore_test/src/main/java/nocommit_some/NoCommit_7_untrack2.java 파일이 삭제되어 안 보여집니다.   
       10. 이제부터  NoCommit_7_untrack2.java 파일은 ignore 대상이 되어서
           Unstaged Changes(관리를 받지 않는 단계) 와 Staged Changes(관리를 받는 단계)에도 등록이 안되고 Commit 대상도 안되고 당연히 Push 도 되지 않는 파일이 됩니다.    	
	 */
		System.out.println("=== NoCommit_7_untrack2.java 파일입니다. ===");
	}

}
