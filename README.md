# Git_ignore_test

git ignore 연습 
1. https://github.com/ 에 자신의 계정으로 로그인한다.

2. 좌측상단의 Recent Repositories 에 보이는 New 버튼을 클릭한다.

3. Repository name 에 이클립스에서 생성될 Dynamic Web Project 이름을 입력한다.
   여기서는 Git_ignore_test 이라고 입력하겠다.

   Description (optional) 에는 git ignore 연습 이라고 입력하다.

   아래의 라디오 선택은 Public 으로 한다.

   Add a README file 체크박스에 체크를 한다.
   Add .gitignore    체크박스에 체크를 한다.
   select 태그 .gitignore template: None 를 클릭하여 java 를 입력한 후 Java 를 선택한다.

   Create repository 버튼을 클릭하여 레포지토리를 생성한다.

4. 생성된 .gitignore 를 클릭하여 파일의 내용연후 
   우측중간에 보이는 연필모양의 아이콘(Edit this file)을 클릭하여 수정상태로 변경한다.

5. 웹브라우저에서 새로운 탭에 https://www.toptal.com/developers/gitignore 사이트에 간다.
   검색란에 java 를 입력하여 Java를 선택하고, eclipse 를 입력하여 Eclipse 를 선택한 후 생성버튼을 클릭한다.
   웹상에 보여지는 내용물을 전부 복사하여 메모장에 붙여둔다.

6. 위의 4번에서 작업한 곳(.gitignore 파일을 수정하는 상태)으로 가서 모든 내용을 지우고, 
   5번에서 메모장에 붙여둔 모든 내용을 여기에 복사시킨다.
   내용물중 64번 라인쯤에 있는 #.project 에서 # 을 제거하고 .project 로 만든다.
   
   그리고 앞으로 해야 할 gitignore 실습을 위해서 맨 아래에

   ##### commit 제외파일 #####
   /Dynamic Web Project 이름/src/main/java/nocommit_all/
   /Dynamic Web Project 이름/src/main/java/nocommit_some/NoCommit_3.java 
   을 추가한다.
   
   여기서 Dynamic Web Project 이름은 Git_ignore_test 이라고 했으므로
   ##### commit 제외파일 #####
   /Git_ignore_test/src/main/java/nocommit_all/
   /Git_ignore_test/src/main/java/nocommit_some/NoCommit_3.java 
   라고 추가한다.

   아래에 보이는 Commit changes 란에 Update .gitignore 을 쓰고 
   라디오는 Commit directly to the main branch 를 선택한 상태에서 Commit changes 버튼을 클릭한다.

7. 좌측상단의 자신의계정명/레포지토리명(여기서는 Git_ignore_test) 에서 레포지토리명(여기서는 Git_ignore_test)을 클릭한다.

8. 우측 중간에 보여지는 Code 버튼을 클릭하고 URL주소를 복사하는 아이콘을 클릭한다.
   메모장을 띄워서 URL주소를 붙여둔다. https://github.com/essaysir/Git_ignore_test.git


9. 이클립스에서 레포지토리명(여기서는 Git_ignore_test)과 동일한 이름을 가지는 Dynamic Web Project 를 생성한다.
   설정된 기본값으로 다음 다음을 클릭한다. 배치서술자(deployment descripter)인 web.xml 은 반드시 체크를 선택하도록 한다.

10. 이클립스에서 레포지토리명과 동일한 이름으로 생성된 Dynamic Web Project(여기서는 Git_ignore_test) 에 간다.
    src/main/java 에 가서 위의 6번에서 ##### commit 제외파일 ##### 에 등록된 
    nocommit_all 패키지와 nocommit_some 패키지를 생성한다.
    
    nocommit_all 패키지속에 NoCommit_1.java 클래스 파일과 NoCommit_2.java 클래스 파일을 생성한다.
    nocommit_some 패키지속에 NoCommit_3.java 클래스 파일을 생성한다.

11. 만약에 우측상단에 Git 아이콘이 없으면 이클립스에서 Open Perspective 를 선택하여 Git 를 Open 시킨다. 
    우측상단에 Git 아이콘이 이미 보이면 Git 아이콘을 클릭하면 된다. 

12. 좌측패널에서 Clone a Git repository 를 클릭한다.
    
    Source Git Repository 에서 URI 입력란에 위의 8번에서 작업한 메모장에 붙여둔 URL주소를 붙인다.

    Authentication 에서 user 는 자신의 git 계정명을 입력하고 Password 는 자신의 Git access tokens 값을 입력하고 
    Next 를 클릭한다.

13. Branch Selection 에서 main 브랜치에 체크가 된 상태에서 Next 를 클릭한다.

14. Local Destination 에서 Destination Directory 는 C:\Users\윈도우즈계정명\git\Git_ignore_test 라고 되어진 기본값을 그대로 
    사용한다. Remote name 은 기본값인 origin 으로 사용한다. Finish 를 클릭한다.

15. 좌측 패널에서 Git_ignore_test - Working Tree - .gitignore 파일을 더블클릭해보면 위의 6번에서 작업한 내용이 그대로 보인다.

16. 우측 상단의 Java EE 아이콘을 클릭하여 Project Explorer 에 간다.

17. 이클립스의 메뉴에서 Window - Show View - Other... 를 클릭하여 
    Git - Git Repositories 와 Git Staging 을 선택한 후 Open 시킨다. 
    만약에 이미 있으면 Open 시킬 필요는 없다.

18. Project Explorer 에서 Dynamic Web Project 인 여기서는 Git_ignore_test 에 마우스 우측클릭 하여
    Team -- Share Project.. 을 클릭한다.

19. Configure Git Repository 에서 
    Repository 란에 v 를 클릭하면 Git_ignore_test - C:\Users\윈도우즈계정명\git\Git_ignore_test\.git 을 선택한다.
    Project 의 Current Location 을 Target Location 으로 옮긴다는 내용인데 그대로 Finish 를 클릭한다.  

20. Java EE 에서 .gitignore 파일을 열어본다.
    
    Git Staging 탭에서 Unstaged Change(관리를 받지 않는 단계)에 들어온 파일들중 
    앞으로 Push 대상이 되지 않을 파일들은 Commit 이 되지 않으면 Push 가 안되므로
    .gitignore 파일속에 파일명을 등록해주면 등록해준 파일명은 Unstaged Change(관리를 받지 않는 단계)에서 삭제가 되어진다. 
    
    실습으로 통해 알아보자.
    예를 들어 .classpath 와 .gitignore 파일과 web.xml 파일을 Push 하지 않을 것이라면
    .gitignore 파일의 내용중 
    ##### commit 제외파일 ##### 밑에
    .classpath
    .gitignore
    /Git_ignore_test/src/main/webapp/WEB-INF/web.xml
    을 추가해주고 저장해준다.

    그러면 Unstaged Change(관리를 받지 않는 단계)에 존재하던 ?아이콘 모양의 .classpath 와 .gitignore 파일과 web.xml 파일이
    삭제가 되고 >.gitignore 이 나타나게 된다. 

    또한 이전까지 /Git_ignore_test/src/main/webapp/WEB-INF/web.xml 파일의 아이콘에 ? 가 있던것이 없어지고 
    /Git_ignore_test/src/main/webapp/WEB-INF/web.xml 파일에는 아무런 아이콘 표시가 없고 깨끗해진다.
    아이콘이 깨끗해진 파일은 앞으로 파일의 내용이 변경되어도 더이상 Staged Changes(관리를 받는 단계)에 들어올 수 없게 된다.
    즉, Commit 대상에서 제외되므로 Push 대상에서도 빠지게 되는 것이다.

    Unstaged Change(관리를 받지 않는 단계) 에 있는 >.gitignore 를 Staged Changes(관리를 받는 단계)로 넣어주고
    Commit Message 에는 Update .gitignore 을 쓰고 Commit and Push 버튼을 클릭한다.

21. 한번더 실습을 하기 위해 WEB-INF -- Command.properties 파일을 생성해본다. 
    우리는 파일을 생성하지 않고 MyMVC 에 있던 Command.properties 파일을 복사해주면 된다.

    Unstaged Change(관리를 받지 않는 단계) 에 ?아이콘으로 되어진 Command.properties 파일이 올라온다. 
    만약에 Command.properties 파일을 Push 하지 않을 예정이라면 .gitignore 파일속에
    /Git_ignore_test/src/main/webapp/WEB-INF/Command.properties 을 추가해주면 된다. 

    그러면 Unstaged Change(관리를 받지 않는 단계) 에 ?아이콘과 함께 있던 Command.properties 파일이 없어진다.

    WEB-INF -- Command.properties 파일의 내용물을 변경하여 저장하더라도 
    Unstaged Change(관리를 받지 않는 단계) 에 Command.properties 파일은 보이지 않는다.
    즉, 앞으로 WEB-INF -- Command.properties 파일은 Push 대상에서 빠지게 되는 것이다.

    Unstaged Change(관리를 받지 않는 단계) 에 있는 >.gitignore 를 Staged Changes(관리를 받는 단계)로 넣어주고
    Commit Message 에는 Update .gitignore 을 쓰고 Commit and Push 버튼을 클릭한다.

    특이한점은 .gitignore 파일에서 
    ##### commit 제외파일 ##### 밑에 
    .gitignore 을 추가했더라도 Unstaged Change(관리를 받지 않는 단계) 에 ?아이콘과 함께 있던 .gitignore 파일만 없어지고
    .gitignore 파일의 내용이 변경되어 저장을 하면 항상 Unstaged Change(관리를 받지 않는 단계) 에 >.gitignore 이 보여지므로 
    Commit 및 Push 를 해야 한다. 
    Push를 해주면 인터넷 GitHub에 가보면 로컬에서 변경된 .gitignore 파일의 내용이 그대로 동일하게 올라와 있게 된다.

    팀프로젝트시 .gitignore 파일이 충돌나면 안되므로 팀원들은 공통으로 사용하는 파일에 대해서만 ignore 를 하도록 하고,
    충돌방지를 위해서 웬만하면 여러 팀원중 팀원 1명만 .gitignore 파일을 제어하고 나머지 팀원들은 pull 받도록 하도록 하자.  
     

22. 이후부터 보여드릴 여러 시나리오에 따른 작업과 설명은 이클립스에서 생성한 자바클래스 파일의 실습과 함께 설명을 하겠습니다.

-- 끝 --  

 
     









